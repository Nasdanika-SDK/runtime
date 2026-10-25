package org.nasdanika.sdk.runtime.drawio.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.text.StringEscapeUtils;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.drawio.Node;
import org.nasdanika.sdk.runtime.drawio.Page;

/**
 * Documents embedded in PNG and SVG images, as draw.io's editable exports write them.
 */
public class TestEmbedding {

	private static Document document() throws Exception {
		Document document = Document.create(false, null);
		Page page = document.createPage();
		page.setName("Embedded page");
		Node node = page.getModel().getRoot().getLayers().getFirst().createNode();
		node.setLabel("Hello, world & friends");
		node.setId("hello");
		return document;
	}

	@Test
	public void testPng() throws Exception {
		ByteArrayOutputStream image = new ByteArrayOutputStream();
		ImageIO.write(new BufferedImage(20, 10, BufferedImage.TYPE_INT_RGB), "png", image);

		byte[] png = document().embedInPng(image.toByteArray(), true);

		List<Document> loaded = Document.loadFromPngMetadata(new ByteArrayInputStream(png), null);
		assertThat(loaded).singleElement().satisfies(d -> {
			assertThat(d.getPages()).singleElement().extracting(Page::getName).isEqualTo("Embedded page");
			assertThat(d.getModelElementById("hello").getLabel()).isEqualTo("Hello, world & friends");
		});
		BufferedImage read = ImageIO.read(new ByteArrayInputStream(png)); // Still a valid image
		assertThat(read.getWidth()).isEqualTo(20);
	}

	@Test
	public void testSvg() throws Exception {
		String content = StringEscapeUtils.escapeXml10(document().save(false));
		String svg = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
				+ "<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">\n"
				+ "<svg xmlns=\"http://www.w3.org/2000/svg\" content=\"" + content + "\"><rect width=\"10\" height=\"10\"/></svg>";

		Document loaded = Document.loadFromSvg(new ByteArrayInputStream(svg.getBytes(StandardCharsets.UTF_8)), null);

		assertThat(loaded.getModelElementById("hello").getLabel()).isEqualTo("Hello, world & friends");
		String plain = "<svg xmlns=\"http://www.w3.org/2000/svg\"/>";
		assertThat(Document.loadFromSvg(new ByteArrayInputStream(plain.getBytes(StandardCharsets.UTF_8)), null)).isNull();
	}

}
