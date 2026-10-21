package org.nasdanika.sdk.runtime.harness;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;

import com.sun.net.httpserver.Filter;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

/**
 * Delegates to a server, and adds a filter to every context created through it, so that code
 * configuring the server cannot leave a context uninstrumented.
 */
final class TracedHttpServer extends HttpServer {

	private final HttpServer delegate;
	private final Filter filter;

	TracedHttpServer(HttpServer delegate, Filter filter) {
		this.delegate = delegate;
		this.filter = filter;
	}

	@Override
	public void bind(InetSocketAddress addr, int backlog) throws IOException {
		delegate.bind(addr, backlog);
	}

	@Override
	public void start() {
		throw new UnsupportedOperationException("The harness starts the server");
	}

	@Override
	public void setExecutor(Executor executor) {
		throw new UnsupportedOperationException("The harness sets the executor");
	}

	@Override
	public Executor getExecutor() {
		return delegate.getExecutor();
	}

	@Override
	public void stop(int delay) {
		throw new UnsupportedOperationException("The harness stops the server");
	}

	@Override
	public HttpContext createContext(String path, HttpHandler handler) {
		HttpContext context = delegate.createContext(path, handler);
		context.getFilters().add(filter);
		return context;
	}

	@Override
	public HttpContext createContext(String path) {
		HttpContext context = delegate.createContext(path);
		context.getFilters().add(filter);
		return context;
	}

	@Override
	public void removeContext(String path) {
		delegate.removeContext(path);
	}

	@Override
	public void removeContext(HttpContext context) {
		delegate.removeContext(context);
	}

	@Override
	public InetSocketAddress getAddress() {
		return delegate.getAddress();
	}

}
