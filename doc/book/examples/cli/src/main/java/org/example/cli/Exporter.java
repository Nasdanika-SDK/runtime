package org.example.cli;

import org.example.library.Library;

/**
 * What the export command accepts as sub-commands.
 */
public interface Exporter {

	String format();

	String export(Library library);

}
