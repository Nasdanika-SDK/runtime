package org.nasdanika.sdk.runtime.common;

import io.opentelemetry.api.trace.Span;

/**
 * This exception type is primarily for wrapping low-level exceptions.
 * @author Pavel
 *
 */
@SuppressWarnings("serial")
public class NasdanikaException extends RuntimeException {

	public NasdanikaException(String message) {
		super(message);
	}

	public NasdanikaException(Throwable cause) {
		super(cause);
	}

	public NasdanikaException(String message, Throwable cause) {
		super(message, cause);
	}

	public NasdanikaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
			
	protected Span span;
	
	/**
	 * Creates an exception with a span which can be used for troubleshooting.
	 * @param message
	 * @param span
	 */
	public NasdanikaException(String message, Span span) {
		this(message);
		this.span = span;
	}

	/**
	 * Creates an exception with a span which can be used for troubleshooting.
	 * @param cause
	 * @param progressRecorder
	 */
	public NasdanikaException(Throwable cause, Span span) {
		this(cause);
		this.span = span;
	}

	/**
	 * Creates an exception with a span which can be used for troubleshooting.
	 * @param message
	 * @param cause
	 * @param progressRecorder
	 */
	public NasdanikaException(String message, Throwable cause, Span span) {
		this(message, cause);
		this.span = span;
	}
	
	public Span getSpan() {
		return span;
	}

}
