package org.nasdanika.sdk.runtime.models.svg.resource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.nasdanika.sdk.runtime.models.svg.DocumentRoot;
import org.nasdanika.sdk.runtime.models.svg.Svg;
import org.nasdanika.sdk.runtime.models.svg.SvgFactory;
import org.nasdanika.sdk.runtime.models.svg.SvgPackage;

/**
 * Writes and reads SVG with EMF's XML resource, guided by the model's ExtendedMetaData: element
 * and attribute names are SVG's, and SVG's namespace is the default one. Elements and attributes
 * outside the model's subset are skipped on load.
 */
public final class SvgFormat {

	private SvgFormat() {
		// Static helpers
	}

	private static Map<Object, Object> options() {
		EPackage.Registry registry = new EPackageRegistryImpl(EPackage.Registry.INSTANCE);
		registry.put(SvgPackage.eNS_URI, SvgPackage.eINSTANCE);
		ExtendedMetaData metaData = new BasicExtendedMetaData(registry);
		Map<Object, Object> options = new HashMap<>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, metaData);
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		options.put(XMLResource.OPTION_LAX_FEATURE_PROCESSING, Boolean.TRUE);
		options.put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
		options.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.FALSE);
		options.put(XMLResource.OPTION_FORMATTED, Boolean.TRUE);
		options.put(XMLResource.OPTION_LINE_WIDTH, 120);
		options.put(XMLResource.OPTION_SKIP_ESCAPE_URI, Boolean.TRUE);
		// External DTDs, such as SVG 1.1's, are not loaded
		Map<String, Boolean> parserFeatures = new HashMap<>();
		parserFeatures.put("http://apache.org/xml/features/nonvalidating/load-external-dtd", Boolean.FALSE);
		options.put(XMLResource.OPTION_PARSER_FEATURES, parserFeatures);
		return options;
	}

	/**
	 * Writes a copy of the element, in a document with SVG's namespace as the default one.
	 */
	public static void save(Svg svg, OutputStream out) throws IOException {
		DocumentRoot root = SvgFactory.eINSTANCE.createDocumentRoot();
		root.getXMLNSPrefixMap().put("", SvgPackage.eNS_URI);
		root.setSvg(EcoreUtil.copy(svg));
		XMLResource resource = new XMLResourceImpl(URI.createURI("document.svg"));
		resource.getContents().add(root);
		resource.save(out, options());
	}

	public static String toString(Svg svg) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			save(svg, out);
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
		return out.toString(StandardCharsets.UTF_8);
	}

	/**
	 * @return The root {@code svg} element, in its document
	 * @throws IOException If the root element is not {@code svg} in SVG's namespace
	 */
	public static Svg load(InputStream in, URI uri) throws IOException {
		XMLResource resource = new XMLResourceImpl(uri);
		resource.load(in, options());
		if (!resource.getContents().isEmpty() && resource.getContents().getFirst() instanceof DocumentRoot root && root.getSvg() != null) {
			resource.getContents().clear();
			return root.getSvg();
		}
		throw new IOException("Not an SVG document: " + uri);
	}

}
