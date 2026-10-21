package org.nasdanika.sdk.runtime.drawio.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.nio.file.Files;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.drawio.Connection;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.drawio.Point;

public class TestConnectionPoints {
	
	@Test
	public void testC4ConnectionPoints() throws Exception {
		Document document = Document.load(getClass().getResource("connections.drawio"));
		Connection c4 = document
			.stream()
			.filter(Connection.class::isInstance)
			.map(Connection.class::cast)
			.filter(c -> "c4".equals(c.getId()))
			.findAny()
			.get();
		
		assertEquals(5, c4.getPoints().size());		
	}
	
	@Test
	public void testC1ConnectionPoints() throws Exception {
		Document document = Document.load(getClass().getResource("connections.drawio"));
		Connection c1 = document
			.stream()
			.filter(Connection.class::isInstance)
			.map(Connection.class::cast)
			.filter(c -> "c1".equals(c.getLabel()))
			.findAny()
			.get();
		
		assertEquals(1, c1.getPoints().size());		
	}	
	
	@Test
	public void testC2ConnectionPoints() throws Exception {
		Document document = Document.load(getClass().getResource("connections.drawio"));
		Connection c2 = document
			.stream()
			.filter(Connection.class::isInstance)
			.map(Connection.class::cast)
			.filter(c -> "c2".equals(c.getLabel()))
			.findAny()
			.get();
		
		assertEquals(0, c2.getPoints().size());		
	}	
	
	@Test
	public void testAddConnectionPoints() throws Exception {
		Document document = Document.load(getClass().getResource("connections.drawio"));
		Connection c3 = document
			.stream()
			.filter(Connection.class::isInstance)
			.map(Connection.class::cast)
			.filter(c -> "c3".equals(c.getLabel()))
			.findAny()
			.get();
		
		assertEquals(1, c3.getPoints().size());
		
		c3.getPoints().add(650, 1100);
		c3.getPoints().add(0, 630, 1080);
		
		Connection c2 = document
				.stream()
				.filter(Connection.class::isInstance)
				.map(Connection.class::cast)
				.filter(c -> "c2".equals(c.getLabel()))
				.findAny()
				.get();
			
			assertEquals(0, c2.getPoints().size());
			
		c2.getPoints().add(700, 900);
			
		Files.writeString(new File("target/connection-add-points.drawio").toPath(), document.save(null));
	}
		
	@Test
	public void testGetConnectionPoints() throws Exception {
		Document document = Document.load(getClass().getResource("connections.drawio"));
		Connection c4 = document
			.stream()
			.filter(Connection.class::isInstance)
			.map(Connection.class::cast)
			.filter(c -> "c4".equals(c.getId()))
			.findAny()
			.get();
		
		Point second = c4.getPoints().get(1);
		assertEquals(230, second.getX());
		assertEquals(1260, second.getY());
		int count = 0;
		for (Point point: c4.getPoints()) {
			assertEquals(point.getX(), c4.getPoints().get(count++).getX());
		}
		assertEquals(5, count);
	}
		
	@Test
	public void testRemoveConnectionPoints() throws Exception {
		Document document = Document.load(getClass().getResource("connections.drawio"));
		Connection c4 = document
			.stream()
			.filter(Connection.class::isInstance)
			.map(Connection.class::cast)
			.filter(c -> "c4".equals(c.getId()))
			.findAny()
			.get();
		
		assertEquals(5, c4.getPoints().size());
		
		Point removedPoint = c4.getPoints().remove(1);
		
		assertEquals(4, c4.getPoints().size());
		assertEquals(230, removedPoint.getX());
		assertEquals(1260, removedPoint.getY());		
		
		removedPoint = c4.getPoints().remove(3);		
		assertEquals(40, removedPoint.getX());
		assertEquals(980, removedPoint.getY());		
		
		Files.writeString(new File("target/connection-remove-points.drawio").toPath(), document.save(null));
	}
	
}
