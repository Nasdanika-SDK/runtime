package org.nasdanika.sdk.runtime.drawio;

import java.util.List;

public interface Root extends ModelElement<Root> {
	
	List<Layer<?>> getLayers();
	
	Layer<?> createLayer();

}
