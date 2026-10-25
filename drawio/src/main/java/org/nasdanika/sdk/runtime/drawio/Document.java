package org.nasdanika.sdk.runtime.drawio;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.metadata.IIOMetadata;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.nasdanika.sdk.runtime.common.NasdanikaException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.nasdanika.sdk.runtime.drawio.impl.DocumentImpl;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Represents the root mxfile element.
 * 
 * @author Pavel
 *
 */
public interface Document extends Element<Document> {

	/**
	 * Supplies a document
	 */
	interface Supplier {
		
		default Document getDocument() {
			return getDocument(null, null);
		}
		
		Document getDocument(
				Function<URI,InputStream> uriHandler, 
				Function<String,String> propertySource);
		
	}
	
	/**
	 * Document loading context
	 */
	interface Context {
		
		Context INSTANCE = new Context() {
			
			
		};
		
		default InputStream openStream(URI uri) throws IOException, URISyntaxException {
			return new java.net.URI(uri.toString()).toURL().openStream();
		}
		
		default String getProperty(String name) {
			return null;
		}
		
		default String filterProperty(ModelElement<?> modelElement, String propertyName, String propertyValue) {
			return propertyValue;
		}	
		
		/**
		 * Variables for evaluating <code>$spel</code> magic properties and property filtering
		 * @return
		 */
		default Map<String, Object> getVariables(ModelElement<?> modelElement) {
			return Collections.emptyMap();
		}
		
		default Context compose(Context other) {
			if (other == null) {
				return this;
			}
			return new Context() {
				
				@Override
				public InputStream openStream(URI uri) throws IOException, URISyntaxException {
					InputStream stream = Context.this.openStream(uri);
					return stream == null ? other.openStream(uri) : stream;
					
				}
				
				@Override
				public String getProperty(String name) {
					String property = Context.this.getProperty(name);
					return org.nasdanika.sdk.runtime.common.Util.isBlank(property) ? other.getProperty(name) : property;
				}
				
				@Override
				public String filterProperty(ModelElement<?> modelElement, String propertyName, String propertyValue) {
					String filteredProperty = Context.this.filterProperty(modelElement, propertyName, propertyValue);
					return other.filterProperty(modelElement, propertyName, filteredProperty);
				}				
				
				@Override
				public Map<String, Object> getVariables(ModelElement<?> modelElement) {
					Map<String, Object> ret = new LinkedHashMap<>(other.getVariables(modelElement));
					ret.putAll(Context.this.getVariables(modelElement));
					return ret;
				}
				
			};
		}
		
		static Context fromPropertySource(Function<String,String> propertySource) {
			return new Context() {
				
				@Override
				public String getProperty(String name) {
					return propertySource == null ? Context.super.getProperty(name) : propertySource.apply(name);
				}
				
			};
		}
		
		static Context fromVariablesProvider(Function<ModelElement<?>,Map<String,Object>> variablesProvider) {
			return new Context() {
				
				@Override
				public Map<String, Object> getVariables(ModelElement<?> modelElement) {
					return variablesProvider.apply(modelElement);
				}
				
			};
		}
				
		static Context fromURIHandler(URIHandler uriHandler) {
			return new Context() {
				
				@Override
				public InputStream openStream(URI uri) throws IOException, URISyntaxException {
					return uriHandler == null ? Context.super.openStream(uri) : uriHandler.createInputStream(uri, null);
				}
				
			};
		}
		
		static Context fromURIConverter(URIConverter uriConverter) {
			return new Context() {
				
				@Override
				public InputStream openStream(URI uri) throws IOException, URISyntaxException {
					return uriConverter == null ? Context.super.openStream(uri) : uriConverter.createInputStream(uri, null);
				}
				
			};
		}
		
		static Context fromURIHandler(Function<URI, InputStream> uriHandler) {
			return new Context() {
				
				@Override
				public InputStream openStream(URI uri) throws IOException, URISyntaxException {
					return uriHandler == null ? Context.super.openStream(uri) : uriHandler.apply(uri);
				}
				
			};
		}
		
		static Context from(Context... contexts) {
			BinaryOperator<Context> composer = (a, b) -> compose(a,b);
			return Stream.of(contexts).reduce(composer).orElse(Context.INSTANCE);
		}		
		
		static Context compose(Context a, Context b) {	
			if (a == null) {
				return b;
			}
			if (b == null) {
				return a;
			}
			return a.compose(b);
		}
		
		static Optional<Context> reduce(Stream<Context> stream) {
			return stream.reduce((a, b) -> compose(a,b));
		}
		
	}
	
	interface EvaluatingContext extends Context {
		
		default <T> T evaluate(ModelElement<?> modelElement, String propertyName, Class<T> type) {
			return evaluate(modelElement, propertyName, Collections.emptyMap(), type);
		}

		<T> T evaluate(ModelElement<?> modelElement, String propertyName, Map<String,Object> variables, Class<T> type);
		
	}
	
	/**
	 * @return a list of pages. This list supports add() method to insert pages from other documents. The add() method creates a clone of the page passed as a parameter. 
	 */
	List<Page> getPages();
	
	/**
	 * @return Creates a new page and adds it to the list of pages.
	 */
	Page createPage();
	
	/**
	 * Creates a cache (map URI -&gt; Document) of loaded documents, loads document on demand.
	 * Similar in functionality to ResourceSet.
	 * @param uriHandler
	 * @return
	 */
	private static Function<URI, Document> wrap(Context context) {
		return new Function<URI, Document>() {
			
			Map<URI, Document> documents = new ConcurrentHashMap<>();

			@Override
			public Document apply(URI source) {
				return documents.computeIfAbsent(source, this::load);
			}
			
			private Document load(URI source) {
				try (InputStream in = context.openStream(source)) {					
					return new DocumentImpl(in, source, context, this);
				} catch (IOException | ParserConfigurationException | SAXException | URISyntaxException e) {
					throw new NasdanikaException("Error loading document from " + source + ": " + e, e);
				}
			}
			
		};
	}
	
	/**
	 * Loads document from an XML string.
	 * @param docStr
	 * @param uri Optional document URI for resolution of relative URI's.
	 * @return
	 * @throws IOException 
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 */
	static Document load(String docStr,	URI uri, Context context) throws ParserConfigurationException, SAXException, IOException {
		return new DocumentImpl(docStr, uri, context, wrap(context));
	}

	/**
	 * Loads document from an XML string.
	 * @param docStr
	 * @param uri Optional document URI for resolution of relative URI's.
	 * @return
	 * @throws IOException 
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 */
	static Document load(String docStr, URI uri) throws ParserConfigurationException, SAXException, IOException {
		return load(docStr, uri, Context.INSTANCE);
	}

	static Document load(Reader reader, URI uri, Context context) throws IOException, ParserConfigurationException, SAXException {
		return new DocumentImpl(reader, uri, context, wrap(context));
	}
	
	/**
	 * 
	 * @param reader
	 * @param uri Optional document URI for resolution of relative URI's.
	 * @return
	 * @throws IOException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	static Document load(Reader reader, URI uri) throws IOException, ParserConfigurationException, SAXException {
		return load(reader, uri, Context.INSTANCE);
	}
		
	static Document create(boolean compressed, URI uri, Context context) throws ParserConfigurationException {
		return new DocumentImpl(compressed, uri, context, wrap(context));
	}
	
	/**
	 * 
	 * @param compressed
	 * @param uri Optional document URI for resolution of relative URI's.
	 * @return
	 * @throws ParserConfigurationException
	 */
	static Document create(boolean compressed, URI uri) throws ParserConfigurationException {
		return create(compressed, uri, Context.INSTANCE);
	}

	static Document load(InputStream in, URI uri, Context context) throws IOException, ParserConfigurationException, SAXException {
		return new DocumentImpl(in, uri, context, wrap(context));
	}

	/**
	 * Loads document using UTF-8 encoding.
	 * @param in
	 * @param uri Optional document URI for resolution of relative URI's.
	 * @return
	 * @throws IOException
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 */
	static Document load(InputStream in, URI uri) throws IOException, ParserConfigurationException, SAXException {
		return load(in, uri, Context.INSTANCE);
	}
	
	/**
	 * @param uri
	 * @return true if the argument URI is drawio data URI, i.e. is starts with data:drawio[;base64],
	 */
	static boolean isDataURI(URI uri) {
		if (uri != null && "data".equals(uri.scheme())) {
			String uriStr = uri.toString();
			String DRAWIO = "data:drawio";
			return uriStr.startsWith(DRAWIO +";base64,") || uriStr.startsWith(DRAWIO +",");
		}
		return false;
	}

	/**
	 * Loads document from an URI - supports data: schema.
	 * @param source
	 * @return
	 * @throws IOException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws URISyntaxException 
	 */
	static Document load(URI source, Context context) throws IOException, ParserConfigurationException, SAXException, URISyntaxException {
		if (isDataURI(source)) {
			String uriStr = source.toString();
			uriStr = uriStr.substring("data:drawio".length());				
			String BASE64 = ";base64,";
			if (uriStr.startsWith(BASE64)) {
				uriStr = new String(Base64.getDecoder().decode(URLDecoder.decode(uriStr.substring(BASE64.length()), StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
			} else {
				uriStr = URLDecoder.decode(uriStr.substring(1), StandardCharsets.UTF_8);
			}
			JSONObject payload = new JSONObject(new JSONTokener(uriStr));
			return load(payload.getString("document"), payload.has("uri") ? URI.createURI(payload.getString("uri")) : null, context);
		}
			
		return load(context.openStream(source), source, context);
	}
	
	/**
	 * Loads document from an URI - supports data: schema.
	 * @param source
	 * @return
	 * @throws IOException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws URISyntaxException 
	 */
	static Document load(URI source) throws IOException, ParserConfigurationException, SAXException, URISyntaxException {
		return load(source, Context.INSTANCE);
	}
	
	static Document load(URL source, Context context) throws IOException, ParserConfigurationException, SAXException {
		return wrap(context).apply(URI.createURI(source.toString()));
	}
	
	/**
	 * Loads document from URL by opening a stream.
	 * @param source
	 * @return
	 * @throws IOException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	static Document load(File source, Context context) throws IOException, ParserConfigurationException, SAXException {
		return load(source.toURI().toURL(), context);
	}	
	
	/**
	 * Loads document from URL by opening a stream.
	 * @param source
	 * @return
	 * @throws IOException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	static Document load(URL source) throws IOException, ParserConfigurationException, SAXException {
		return load(source, Context.INSTANCE);
	}
	
	/**
	 * Loads document from URL by opening a stream.
	 * @param source
	 * @return
	 * @throws IOException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	static Document load(File source) throws IOException, ParserConfigurationException, SAXException {
		return load(source, Context.INSTANCE);
	}
	
	/**
	 * Loads documents stored in PNG metadata using UTF-8 encoding.
	 * @param in
	 * @return
	 * @throws IOException
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 */
	static List<Document> loadFromPngMetadata(InputStream in, URI uri, Context context) throws IOException, ParserConfigurationException, SAXException {
		ImageReader imageReader = ImageIO.getImageReadersByFormatName("png").next();
		imageReader.setInput(ImageIO.createImageInputStream(in));
		IIOMetadata metadata = imageReader.getImageMetadata(0);
		List<Document> ret = new ArrayList<>();
		for (int imageCount = imageReader.getNumImages(true), minIndex = imageReader.getMinIndex(), idx = 0; idx < imageCount; ++idx) {
			IIOMetadata imageMetadata = imageReader.getImageMetadata(minIndex + idx);
			if (imageMetadata != null) {
				for (String formatName: imageMetadata.getMetadataFormatNames()) {
					Node tree = metadata.getAsTree(formatName);
					NodeList childNodes = tree.getChildNodes();
					for (int i = 0; i < childNodes.getLength(); ++i) {
						Node child = childNodes.item(i);
						if (child instanceof org.w3c.dom.Element && "Text".equals(((org.w3c.dom.Element) child).getTagName())) {
							NodeList grandChildNodes = child.getChildNodes();
							for (int j = 0; j < grandChildNodes.getLength(); ++j) {
								Node grandChild = grandChildNodes.item(j);
								if (grandChild instanceof org.w3c.dom.Element 
										&& "TextEntry".equals(((org.w3c.dom.Element) grandChild).getTagName())
										&& ((org.w3c.dom.Element) grandChild).hasAttribute("keyword")
										&& "mxfile".equals(((org.w3c.dom.Element) grandChild).getAttribute("keyword"))) {
									String value = ((org.w3c.dom.Element) grandChild).getAttribute("value");
									ret.add(load((URLDecoder.decode(value, StandardCharsets.UTF_8)), uri, context));									
								}
							}
						}
					}
				}
			}
		}
		return ret;
	}

	static List<Document> loadFromPngMetadata(InputStream in, URI uri) throws IOException, ParserConfigurationException, SAXException {
		return loadFromPngMetadata(in, uri, Context.INSTANCE);
	}
	
	/**
	 * Loads documents stored in PNG metadata using UTF-8 encoding.
	 * @param source
	 * @return
	 * @throws IOException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws URISyntaxException 
	 */
	static List<Document> loadFromPngMetadata(URL source, Context context) throws IOException, ParserConfigurationException, SAXException, URISyntaxException {
		URI sourceUri = URI.createURI(source.toString());
		return loadFromPngMetadata(context.openStream(sourceUri), sourceUri, context);
	}
	
	static List<Document> loadFromPngMetadata(URL source) throws IOException, ParserConfigurationException, SAXException, URISyntaxException {
		return loadFromPngMetadata(source, Context.INSTANCE);
	}
	
	/**
	 * Loads the document that an SVG image carries in the <code>content</code> attribute of its
	 * root element, as draw.io's editable SVG export writes it.
	 * External DTDs and entities are not loaded.
	 * @return The document, or null if the image carries none
	 */
	static Document loadFromSvg(InputStream in, URI uri, Context context) throws IOException, ParserConfigurationException, SAXException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		factory.setExpandEntityReferences(false);
		factory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
		factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
		factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
		org.w3c.dom.Element root = factory.newDocumentBuilder().parse(in).getDocumentElement();
		String content = root.getAttribute("content");
		return content.isBlank() ? null : load(content, uri, context);
	}
	
	static Document loadFromSvg(InputStream in, URI uri) throws IOException, ParserConfigurationException, SAXException {
		return loadFromSvg(in, uri, Context.INSTANCE);
	}
	
	static Document loadFromSvg(URL source) throws IOException, ParserConfigurationException, SAXException {
		try (InputStream in = source.openStream()) {
			return loadFromSvg(in, URI.createURI(source.toString()));
		}
	}
	
	/**
	 * Embeds this document in a PNG image, as draw.io's editable PNG export does: in a <code>tEXt</code>
	 * chunk with the keyword <code>mxfile</code>, after the image header. The image data is not changed.
	 * {@link #loadFromPngMetadata(InputStream, URI)} reads the document back, and draw.io opens the image for editing.
	 * @param png A PNG image, usually a picture of this document
	 * @param compress See {@link #save(Boolean)}
	 * @return The image with the document
	 */
	byte[] embedInPng(byte[] png, Boolean compress) throws TransformerException, IOException;
	
	/**
	 * @param compress If null keeps the original compression setting. If not null forces either compressed (TRUE) or uncompressed (FALSE).
	 * This can be used to generate HTML tags with compressed document while keeping the source document uncompressed so it can be manually inspected, edited, diffed, and merged.
	 * @param viewer URL of the viewer script. Default value is used if null.  
	 * @return div tag with the embedded document which can be inserted into HTML pages.
	 */
	String toHtml(Boolean compress, String viewer) throws TransformerException, IOException;

	String JSDELIVR_DRAWIO_VIEWER = "https://cdn.jsdelivr.net/gh/jgraph/drawio@v32.5.5/src/main/webapp/js/viewer.min.js";
	
	/**
	 * Generates HTML with a veiwer from Jsdelivr
	 * @param compress
	 * @return
	 * @throws TransformerException
	 * @throws IOException
	 */
	default String toHtml(Boolean compress) throws TransformerException, IOException {
		return toHtml(compress, JSDELIVR_DRAWIO_VIEWER);
	}
		
	/**
	 * Generates HTML with a compressed diagram and a veiwer from Jsdelivr
	 * @return
	 * @throws TransformerException
	 * @throws IOException
	 */
	default String toHtml() throws TransformerException, IOException {
		return toHtml(true, JSDELIVR_DRAWIO_VIEWER);
	}
		
	/**
	 * Encodes document as data: URI.
	 * @return
	 */
	URI toDataURI(Boolean compress) throws TransformerException, IOException;

	/**
	 * Saves the document to String.
	 * @param compress If null keeps the original compression setting. If not null forces either compressed (TRUE) or uncompressed (FALSE).
	 * This can be used to generate HTML tags with compressed document while keeping the source document uncompressed so it can be manually inspected, edited, diffed, and merged.  
	 * @return Document string.
	 */
	String save(Boolean compress) throws TransformerException, IOException;
	
	String getProperty(String name);
	
	default Page getPageByName(String pageName) {
		for (Page page: getPages()) {
			if (pageName.equals(page.getName())) {
				return page;
			}
		}
		return null;
	}

	default Page getPageById(String pageId) {
		for (Page page: getPages()) {
			if (pageId.equals(page.getId())) {
				return page;
			}
		}
		return null;
	}
	
	/**
	 * Loads a document identified by the URI if it is not loaded yet.
	 * URI is resolved relative to this document URI.
	 * @param source
	 * @return
	 * @throws IOException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws URISyntaxException 
	 */
	Document getDocument(URI source) throws IOException, ParserConfigurationException, SAXException, URISyntaxException;	

}
