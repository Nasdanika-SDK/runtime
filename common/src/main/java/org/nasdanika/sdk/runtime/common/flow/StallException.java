package org.nasdanika.sdk.runtime.common.flow;

import java.util.List;

/**
 * Nothing can progress: the {@link Pump} is idle, nothing is in flight, and something is still
 * waiting. Reported like a deadlock, with what each waiting item waits for, because that list is
 * what a caller needs and an exception without it is a mystery.
 */
public class StallException extends PumpException {

	private static final long serialVersionUID = 1L;

	private final List<String> waiting;

	public StallException(String message, List<String> waiting) {
		super(format(message, waiting));
		this.waiting = List.copyOf(waiting);
	}

	/**
	 * @return Descriptions of what was waiting when the stall was detected.
	 */
	public List<String> getWaiting() {
		return waiting;
	}

	private static String format(String message, List<String> waiting) {
		if (waiting.isEmpty()) {
			return message;
		}
		StringBuilder builder = new StringBuilder(message);
		for (String w: waiting) {
			builder.append(System.lineSeparator()).append("  ").append(w);
		}
		return builder.toString();
	}

}
