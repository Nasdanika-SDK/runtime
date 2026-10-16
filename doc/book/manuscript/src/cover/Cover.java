import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarFile;

import javax.imageio.ImageIO;

/**
 * Generates the front cover of the book: 2100 by 2775 pixels, 7 by 9.25 inches at 300 dpi, the trim
 * size of the PDF. The fonts are Noto Sans, read from the Asciidoctor PDF jar (SIL Open Font
 * License), so the cover uses the same family as the headings.
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
 * Leanpub and other stores may want their own cover sizes; change WIDTH and HEIGHT.
 */
public class Cover {

	static final int WIDTH = 2100;
	static final int HEIGHT = 2775;

	static final Color DEEP = new Color(0x0F, 0x4C, 0x6E);
	static final Color BLUE = new Color(0x1B, 0x8E, 0xC6);
	static final Color INK = new Color(0x22, 0x22, 0x22);
	static final Color MUTED = new Color(0x6B, 0x77, 0x80);
	static final Color WASH = new Color(0xF2, 0xF7, 0xFA);

	public static void main(String[] args) throws Exception {
		if (args.length != 3) {
			System.err.println("Usage: java Cover.java <asciidoctorj-pdf jar> <logo> <output png>");
			System.exit(1);
		}
		Font regular;
		Font bold;
		try (JarFile jar = new JarFile(args[0])) {
			regular = font(jar, "notosans-regular-subset.ttf");
			bold = font(jar, "notosans-bold-subset.ttf");
		}
		BufferedImage logo = ImageIO.read(new File(args[1]));

		BufferedImage cover = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		Graphics2D g = cover.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

		// Background: white, with a pale wash behind the logo and a deep band at the bottom
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		g.setColor(WASH);
		g.fillRect(0, 0, WIDTH, 1520);
		g.setColor(DEEP);
		g.fillRect(0, HEIGHT - 260, WIDTH, 260);
		g.setColor(BLUE);
		g.fillRect(0, HEIGHT - 280, WIDTH, 20);

		// The logo, in a thin circle of the brand blue
		int diameter = 1060;
		int x = (WIDTH - diameter) / 2;
		int y = 230;
		g.setColor(Color.WHITE);
		g.fill(new Ellipse2D.Double(x - 30, y - 30, diameter + 60, diameter + 60));
		g.setClip(new Ellipse2D.Double(x + 3, y + 3, diameter - 6, diameter - 6)); // The JPEG is square, the logo is round
		g.drawImage(logo, x, y, diameter, diameter, null);
		g.setClip(null);
		g.setColor(BLUE);
		g.setStroke(new BasicStroke(10));
		g.draw(new Ellipse2D.Double(x - 30, y - 30, diameter + 60, diameter + 60));

		center(g, bold.deriveFont(150f), DEEP, "Nasdanika SDK Runtime", 1760);
		center(g, regular.deriveFont(84f), BLUE, "More Structure with Less Effort", 1900);
		g.setColor(BLUE);
		g.fillRect(WIDTH / 2 - 160, 1975, 320, 8);
		center(g, regular.deriveFont(60f), MUTED, "Models, capabilities and telemetry on the JDK", 2100);
		center(g, bold.deriveFont(84f), INK, "Pavel Vlasov", 2380);
		center(g, regular.deriveFont(52f), Color.WHITE, "nasdanika.com", HEIGHT - 110);

		g.dispose();
		ImageIO.write(cover, "png", new File(args[2]));
		System.out.println("Wrote " + args[2]);
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
