// tag::module[]
/**
 * An HTTP server that is up while code runs, in one trace with the code's requests.
 */
module org.nasdanika.sdk.runtime.harness {

	requires transitive org.nasdanika.sdk.runtime.volume; // TelemetryHandler, jdk.httpserver, java.net.http

	exports org.nasdanika.sdk.runtime.harness;

}
// end::module[]
