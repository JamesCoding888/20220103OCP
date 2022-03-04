package com.study.ocp.day14;

import static org.junit.Assert.assertEquals; 

import org.junit.Test;

public class TestSquare {
	@Test
	public void test() {
		// 1. Arrange
		Square square = new Square();
		square.setH(10);
		square.setW(10);
		int expect = 101; // hot-code
		// 2. Act
		int result = square.getArea();
		// 3. Assert
		assertEquals(expect, result);
		System.out.println("測試成功");
	}
}