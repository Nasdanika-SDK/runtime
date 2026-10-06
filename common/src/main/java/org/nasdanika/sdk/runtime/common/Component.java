package org.nasdanika.sdk.runtime.common;

/**
 * Somethig with a lifecycle - start, stop, close
 */
public interface Component extends Closeable {
	
	void start();
	
	void stop();

}
