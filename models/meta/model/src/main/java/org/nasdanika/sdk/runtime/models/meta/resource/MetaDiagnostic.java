package org.nasdanika.sdk.runtime.models.meta.resource;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * An error or a warning found reading the text syntax, at a line and column of a file. Resources
 * list them in {@link Resource#getErrors()} and {@link Resource#getWarnings()}.
 */
public class MetaDiagnostic extends Exception implements Resource.Diagnostic {

	private static final long serialVersionUID = 1L;

	private final String location;
	private final int line;
	private final int column;

	/**
	 * @param location The URI of the file, may be null
	 * @param line One-based
	 * @param column One-based
	 */
	public MetaDiagnostic(String message, String location, int line, int column) {
		super(message);
		this.location = location;
		this.line = line;
		this.column = column;
	}

	@Override
	public String getLocation() {
		return location;
	}

	@Override
	public int getLine() {
		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}

	@Override
	public String toString() {
		return (location == null ? "" : location) + ":" + line + ":" + column + ": " + getMessage();
	}

}
