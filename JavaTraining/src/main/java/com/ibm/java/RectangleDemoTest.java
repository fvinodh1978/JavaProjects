package com.ibm.java;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RectangleDemoTest {
	Rectangle obj;

	@Before
	public void init() {
		obj = new Rectangle();
	}

	@Test
	public void UTC_01() {
	    
	    String color = "Green";
		double width=10;
		double height=10;
		
		obj.setColor(color);
		obj.setWidth(width);
		obj.setHeight(height);

		double expected = 100;
		double actual = obj.getArea();

		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void UTC_02() {
	    String color = "Green";
		double width=10;
		double height=10;
		
		obj.setColor(color);
		obj.setWidth(width);
		obj.setHeight(height);

		double expected = 40;
		double actual = obj.getPerimeter();

		assertEquals(expected, actual, 0.1);
	}
}
