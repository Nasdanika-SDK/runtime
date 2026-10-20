module org.nasdanika.sdk.runtime.drawio {
	
	exports org.nasdanika.sdk.runtime.drawio;
	exports org.nasdanika.sdk.runtime.drawio.comparators;
	exports org.nasdanika.sdk.runtime.drawio.impl;
	exports org.nasdanika.sdk.runtime.drawio.style;
	exports org.nasdanika.sdk.runtime.drawio.style.impl;
	exports org.nasdanika.sdk.runtime.drawio.util;
	requires transitive org.nasdanika.sdk.runtime.common;
	requires transitive java.xml;
	requires java.desktop;
	requires org.json;
	requires org.jsoup;
	requires org.apache.commons.codec;
	requires org.apache.commons.text;
	
}