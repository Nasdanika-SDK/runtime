package org.nasdanika.sdk.runtime.common.flow;

/**
 * A {@link Pump} failed: a task threw, the step budget was exhausted, or the pumping thread was
 * interrupted. Once failed, a pump drops new work and its terminals rethrow the failure.
 */
public class PumpException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PumpException(String message) {
		super(message);
	}

	public PumpException(String message, Throwable cause) {
		super(message, cause);
	}

}
