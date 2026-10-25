// tag::module[]
/**
 * Browser sessions with Playwright against a harness server, in the server's trace, with
 * screenshots recorded in the spans they were taken in and an optional video.
 */
@SuppressWarnings("requires-transitive-automatic") // Playwright is an automatic module
module org.nasdanika.sdk.runtime.playwright {

	requires transitive org.nasdanika.sdk.runtime.harness;
	requires transitive com.microsoft.playwright;

	exports org.nasdanika.sdk.runtime.playwright;

}
// end::module[]
