/**
 * Draw.io documents rendered with draw.io's own viewer in a browser driven by Playwright: pages as
 * PNG and SVG images with the page embedded, and videos.
 */
// tag::module[]
module org.nasdanika.sdk.runtime.drawio.playwright {

	requires transitive org.nasdanika.sdk.runtime.drawio;
	requires transitive org.nasdanika.sdk.runtime.playwright;
	requires org.json;

	exports org.nasdanika.sdk.runtime.drawio.playwright;

}
// end::module[]
