import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriter;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataNode;
import javax.imageio.stream.ImageOutputStream;

/**
 * Crops a screenshot to its non-white content plus padding and writes it as a PNG with the
 * draw.io diagram embedded in a tEXt chunk named mxfile, the way draw.io does.
 * java EmbedPng.java screenshot.png diagram.drawio out.png [padding] [dpi]
 */
public class EmbedPng {
	public static void main(String[] args) throws Exception {
		BufferedImage shot = ImageIO.read(new File(args[0]));
		String xml = Files.readString(new File(args[1]).toPath(), StandardCharsets.UTF_8);
		int pad = args.length > 3 ? Integer.parseInt(args[3]) : 24;
		int dpi = args.length > 4 ? Integer.parseInt(args[4]) : 192;
		int minX = shot.getWidth(), minY = shot.getHeight(), maxX = -1, maxY = -1;
		for (int y = 0; y < shot.getHeight(); ++y) {
			for (int x = 0; x < shot.getWidth(); ++x) {
				int rgb = shot.getRGB(x, y) & 0xFFFFFF;
				int r = rgb >> 16, g = (rgb >> 8) & 0xFF, b = rgb & 0xFF;
				if (r < 245 || g < 245 || b < 245) {
					minX = Math.min(minX, x); minY = Math.min(minY, y);
					maxX = Math.max(maxX, x); maxY = Math.max(maxY, y);
				}
			}
		}
		if (maxX < 0) throw new IllegalStateException("Blank screenshot " + args[0]);
		int x0 = Math.max(0, minX - pad), y0 = Math.max(0, minY - pad);
		int x1 = Math.min(shot.getWidth() - 1, maxX + pad), y1 = Math.min(shot.getHeight() - 1, maxY + pad);
		BufferedImage out = new BufferedImage(x1 - x0 + 1, y1 - y0 + 1, BufferedImage.TYPE_INT_RGB);
		out.getGraphics().drawImage(shot.getSubimage(x0, y0, out.getWidth(), out.getHeight()), 0, 0, null);

		// encodeURIComponent: URLEncoder plus the characters it leaves alone
		String value = URLEncoder.encode(xml, StandardCharsets.UTF_8)
				.replace("+", "%20").replace("%21", "!").replace("%27", "'")
				.replace("%28", "(").replace("%29", ")").replace("%7E", "~");

		ImageWriter writer = ImageIO.getImageWritersByFormatName("png").next();
		IIOMetadata metadata = writer.getDefaultImageMetadata(ImageTypeSpecifier.createFromRenderedImage(out), null);
		IIOMetadataNode root = new IIOMetadataNode("javax_imageio_png_1.0");
		IIOMetadataNode text = new IIOMetadataNode("tEXt");
		IIOMetadataNode entry = new IIOMetadataNode("tEXtEntry");
		entry.setAttribute("keyword", "mxfile");
		entry.setAttribute("value", value);
		text.appendChild(entry);
		root.appendChild(text);
		IIOMetadataNode phys = new IIOMetadataNode("pHYs");
		String ppm = Integer.toString((int) Math.round(dpi / 0.0254));
		phys.setAttribute("pixelsPerUnitXAxis", ppm);
		phys.setAttribute("pixelsPerUnitYAxis", ppm);
		phys.setAttribute("unitSpecifier", "meter");
		root.appendChild(phys);
		metadata.mergeTree("javax_imageio_png_1.0", root);
		File target = new File(args[2]);
		target.delete();
		try (ImageOutputStream ios = ImageIO.createImageOutputStream(target)) {
			writer.setOutput(ios);
			writer.write(new IIOImage(out, null, metadata));
		}
		System.out.println("Wrote " + target + " " + out.getWidth() + "x" + out.getHeight());
	}
}
