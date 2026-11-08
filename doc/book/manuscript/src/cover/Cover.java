import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarFile;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

import javax.imageio.ImageIO;

/**
 * Generates the covers of the book. The fonts are Noto Sans, read from the Asciidoctor PDF jar (SIL Open Font
 * License), so the covers use the same family as the headings.
 *
 * <p>The front cover is 2232 by 2906 pixels, 189 by 246 mm (7.44 by 9.69 inches) at 300 dpi, the trim size of
 * the PDF and of the printed editions:
 *
 * <pre>
 * java Cover.java &lt;asciidoctorj-pdf jar&gt; &lt;logo&gt; &lt;output png&gt;
 * </pre>
 *
 * Run from the manuscript directory, it regenerates src/docs/asciidoc/images/cover.png:
 *
 * <pre>
 * java src/cover/Cover.java ~/.m2/repository/org/asciidoctor/asciidoctorj-pdf/2.3.27/asciidoctorj-pdf-2.3.27.jar \
 *      src/docs/asciidoc/images/nasdanika-sdk-logo.jpg src/docs/asciidoc/images/cover.png
 * </pre>
 *
 * <p>The cover of the coil-bound Lulu edition is a one-page PDF of the back and the front with no spine, 15.13
 * by 9.93 inches: Lulu's trim of 7.44 by 9.68 inches, twice across, with 0.125 inches of bleed around it. The
 * barcode is a PNG at 300 dpi, drawn pixel for pixel:
 *
 * <pre>
 * java Cover.java &lt;asciidoctorj-pdf jar&gt; &lt;logo&gt; &lt;barcode png&gt; &lt;output pdf&gt;
 * </pre>
 *
 * Leanpub and other stores may want their own cover sizes; change WIDTH and HEIGHT.
 */
public class Cover {

	static final int WIDTH = 2232;
	static final int HEIGHT = 2906;

	static final int DPI = 300;
	static final int WRAP_WIDTH = 4539;
	static final int WRAP_HEIGHT = 2979;
	static final int BLEED = 37; // 0.125 inches is 37.5 pixels: 37 on the left and top, 38 on the right and bottom

	/** Holes are punched along the edge the back shares with the front, so text keeps well away from it. */
	static final int BACK_MARGIN = 225;

	static final Color DEEP = new Color(0x0F, 0x4C, 0x6E);
	static final Color BLUE = new Color(0x1B, 0x8E, 0xC6);
	static final Color INK = new Color(0x22, 0x22, 0x22);
	static final Color MUTED = new Color(0x6B, 0x77, 0x80);
	static final Color WASH = new Color(0xF2, 0xF7, 0xFA);

	public static void main(String[] args) throws Exception {
		if (args.length != 3 && args.length != 4) {
			System.err.println("Usage: java Cover.java <asciidoctorj-pdf jar> <logo> <output png>");
			System.err.println("   or: java Cover.java <asciidoctorj-pdf jar> <logo> <barcode png> <output pdf>");
			System.exit(1);
		}
		Font regular;
		Font bold;
		try (JarFile jar = new JarFile(args[0])) {
			regular = font(jar, "notosans-regular-subset.ttf");
			bold = font(jar, "notosans-bold-subset.ttf");
		}
		BufferedImage logo = ImageIO.read(new File(args[1]));

		if (args.length == 3) {
			BufferedImage cover = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
			Graphics2D g = graphics(cover);
			background(g, WIDTH, HEIGHT, 0);
			front(g, logo, regular, bold);
			g.dispose();
			ImageIO.write(cover, "png", new File(args[2]));
			System.out.println("Wrote " + args[2]);
		} else {
			BufferedImage barcode = ImageIO.read(new File(args[2]));
			BufferedImage cover = new BufferedImage(WRAP_WIDTH, WRAP_HEIGHT, BufferedImage.TYPE_INT_RGB);
			Graphics2D g = graphics(cover);
			background(g, WRAP_WIDTH, WRAP_HEIGHT, BLEED);
			g.translate(BLEED, BLEED);
			back(g, barcode, regular, bold);
			g.translate(WIDTH, 0);
			front(g, logo, regular, bold);
			g.dispose();
			File output = new File(args[3]).getAbsoluteFile();
			output.getParentFile().mkdirs();
			writePdf(cover, output);
			System.out.println("Wrote " + args[3]);
		}
	}

	static Graphics2D graphics(BufferedImage image) {
		Graphics2D g = image.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		return g;
	}

	/** White, with a pale wash at the top and a deep band at the bottom, out to the edges of the canvas. */
	static void background(Graphics2D g, int width, int height, int top) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, width, height);
		g.setColor(WASH);
		g.fillRect(0, 0, width, top + 1592);
		g.setColor(DEEP);
		g.fillRect(0, top + HEIGHT - 260, width, height - (top + HEIGHT - 260));
		g.setColor(BLUE);
		g.fillRect(0, top + HEIGHT - 280, width, 20);
	}

	static void front(Graphics2D g, BufferedImage logo, Font regular, Font bold) {
		// The logo, in a thin circle of the brand blue
		int diameter = 1060;
		int x = (WIDTH - diameter) / 2;
		int y = 241;
		g.setColor(Color.WHITE);
		g.fill(new Ellipse2D.Double(x - 30, y - 30, diameter + 60, diameter + 60));
		var clip = g.getClip();
		g.clip(new Ellipse2D.Double(x + 3, y + 3, diameter - 6, diameter - 6)); // The JPEG is square, the logo is round
		g.drawImage(logo, x, y, diameter, diameter, null);
		g.setClip(clip);
		g.setColor(BLUE);
		g.setStroke(new BasicStroke(10));
		g.draw(new Ellipse2D.Double(x - 30, y - 30, diameter + 60, diameter + 60));

		center(g, bold.deriveFont(150f), DEEP, "Nasdanika SDK Runtime", 1843);
		center(g, regular.deriveFont(84f), BLUE, "More Structure with Less Effort", 1990);
		g.setColor(BLUE);
		g.fillRect(WIDTH / 2 - 160, 2068, 320, 8);
		center(g, regular.deriveFont(60f), MUTED, "Models, capabilities and telemetry on the JDK", 2199);
		center(g, bold.deriveFont(84f), INK, "Pavel Vlasov", 2492);
		center(g, regular.deriveFont(52f), Color.WHITE, "runtime.sdk.nasdanika.org", HEIGHT - 110);
	}

	static void back(Graphics2D g, BufferedImage barcode, Font regular, Font bold) {
		int textWidth = WIDTH - 2 * BACK_MARGIN;
		Font body = regular.deriveFont(56f);

		g.setFont(bold.deriveFont(96f));
		g.setColor(DEEP);
		g.drawString("More structure with less effort", BACK_MARGIN, 250);

		int baseline = 400;
		baseline = paragraph(g, body, INK, textWidth, baseline,
				"Most enterprise knowledge is glass. It holds its shape and makes sense up close, and nothing "
				+ "connects it. The definition of a customer lives in a database schema, a Java class, a wiki table "
				+ "and three spreadsheets.");
		baseline = paragraph(g, body, INK, textWidth, baseline,
				"People skip structure because it costs more to keep than it pays. This book argues that the cost "
				+ "has changed, and shows a runtime built on that argument: models written as text, telemetry kept "
				+ "as a model, and a command line assembled from the modules present, on the JDK.");
		paragraph(g, body, INK, textWidth, baseline,
				"For architects who want more structure with less effort, Java developers who want an observable "
				+ "foundation with few dependencies, and R&D teams who need to try an idea before anyone will "
				+ "provision infrastructure for it.");

		// The barcode sits on white above the band, pixel for pixel: scaling would blur its bars
		int barcodeX = WIDTH - BACK_MARGIN - barcode.getWidth();
		int barcodeY = HEIGHT - 280 - 80 - barcode.getHeight();
		g.drawImage(barcode, barcodeX, barcodeY, null);

		paragraph(g, regular.deriveFont(46f), MUTED, barcodeX - BACK_MARGIN - 80, barcodeY + 110,
				"Pavel Vlasov is the creator of Nasdanika and has worked in information technology for more than "
				+ "thirty years, as a developer, an architect and an enterprise architect.");
	}

	/** Draws wrapped text and returns the baseline for the paragraph after it. */
	static int paragraph(Graphics2D g, Font font, Color color, int width, int baseline, String text) {
		g.setFont(font);
		g.setColor(color);
		FontMetrics metrics = g.getFontMetrics();
		int leading = Math.round(font.getSize2D() * 1.5f);
		StringBuilder line = new StringBuilder();
		for (String word : text.split(" ")) {
			if (!line.isEmpty() && metrics.stringWidth(line + " " + word) > width) {
				g.drawString(line.toString(), BACK_MARGIN, baseline);
				baseline += leading;
				line.setLength(0);
			}
			line.append(line.isEmpty() ? "" : " ").append(word);
		}
		g.drawString(line.toString(), BACK_MARGIN, baseline);
		return baseline + leading + leading / 2;
	}

	/** Writes the image as a one-page PDF at 300 dpi, compressed without loss. The JDK has no PDF writer, and this needs little of one. */
	static void writePdf(BufferedImage image, File file) throws IOException {
		int width = image.getWidth();
		int height = image.getHeight();
		ByteArrayOutputStream pixels = new ByteArrayOutputStream();
		try (DeflaterOutputStream deflater = new DeflaterOutputStream(pixels, new Deflater(Deflater.BEST_COMPRESSION))) {
			byte[] row = new byte[width * 3];
			for (int y = 0; y < height; ++y) {
				for (int x = 0; x < width; ++x) {
					int rgb = image.getRGB(x, y);
					row[x * 3] = (byte) (rgb >> 16);
					row[x * 3 + 1] = (byte) (rgb >> 8);
					row[x * 3 + 2] = (byte) rgb;
				}
				deflater.write(row);
			}
		}
		String pageWidth = String.format(java.util.Locale.ROOT, "%.2f", width * 72.0 / DPI);
		String pageHeight = String.format(java.util.Locale.ROOT, "%.2f", height * 72.0 / DPI);
		String content = pageWidth + " 0 0 " + pageHeight + " 0 0 cm /Cover Do";

		ByteArrayOutputStream pdf = new ByteArrayOutputStream();
		List<Integer> offsets = new ArrayList<>();
		ascii(pdf, "%PDF-1.4\n");
		object(pdf, offsets, "<< /Type /Catalog /Pages 2 0 R >>");
		object(pdf, offsets, "<< /Type /Pages /Kids [3 0 R] /Count 1 >>");
		object(pdf, offsets, "<< /Type /Page /Parent 2 0 R /MediaBox [0 0 " + pageWidth + " " + pageHeight + "]"
				+ " /Resources << /XObject << /Cover 4 0 R >> >> /Contents 5 0 R >>");
		offsets.add(pdf.size());
		ascii(pdf, "4 0 obj\n<< /Type /XObject /Subtype /Image /Width " + width + " /Height " + height
				+ " /ColorSpace /DeviceRGB /BitsPerComponent 8 /Filter /FlateDecode /Length " + pixels.size()
				+ " >>\nstream\n");
		pixels.writeTo(pdf);
		ascii(pdf, "\nendstream\nendobj\n");
		object(pdf, offsets, "<< /Length " + content.length() + " >>\nstream\n" + content + "\nendstream");
		int xref = pdf.size();
		ascii(pdf, "xref\n0 " + (offsets.size() + 1) + "\n0000000000 65535 f \n");
		for (int offset : offsets) {
			ascii(pdf, String.format(java.util.Locale.ROOT, "%010d 00000 n \n", offset));
		}
		ascii(pdf, "trailer\n<< /Size " + (offsets.size() + 1) + " /Root 1 0 R >>\nstartxref\n" + xref + "\n%%EOF\n");
		Files.write(file.toPath(), pdf.toByteArray());
	}

	static void object(ByteArrayOutputStream pdf, List<Integer> offsets, String body) throws IOException {
		offsets.add(pdf.size());
		ascii(pdf, offsets.size() + " 0 obj\n" + body + "\nendobj\n");
	}

	static void ascii(ByteArrayOutputStream out, String text) throws IOException {
		out.write(text.getBytes(StandardCharsets.US_ASCII));
	}

	static Font font(JarFile jar, String name) throws Exception {
		var entry = jar.stream().filter(e -> e.getName().endsWith("/data/fonts/" + name)).findFirst()
				.orElseThrow(() -> new IOException("No " + name + " in " + jar.getName()));
		try (InputStream in = jar.getInputStream(entry)) {
			return Font.createFont(Font.TRUETYPE_FONT, in);
		}
	}

	static void center(Graphics2D g, Font font, Color color, String text, int baseline) {
		g.setFont(font);
		g.setColor(color);
		FontMetrics metrics = g.getFontMetrics();
		g.drawString(text, (WIDTH - metrics.stringWidth(text)) / 2, baseline);
	}

}
