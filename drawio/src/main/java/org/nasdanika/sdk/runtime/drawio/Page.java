package org.nasdanika.sdk.runtime.drawio;

import java.util.Map;

public interface Page extends LinkTarget<Page> {

	Model getModel();

	String getName();
	
	void setName(String name);
	
	String getId();	
	
	void setId(String id);	
	
	Document getDocument();
	
	/**
	 * @return Unmodifiable map of tags.
	 */
	Map<String,Tag> getTags();
	
	Tag createTag(String name);
	
	int getPosition();
	
	/**
	 * Removes this page from the document
	 */
	void remove();

}
