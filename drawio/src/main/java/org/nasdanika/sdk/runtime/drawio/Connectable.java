package org.nasdanika.sdk.runtime.drawio;

import java.util.List;

/**
 * Source and target of {@link Connection}s.
 * Base interface for {@link ConnectionPoint} and {@link Node}
 */
public interface Connectable {
	
	List<Connection> getIncomingConnections();
	
	List<Connection> getOutgoingConnections();

}
