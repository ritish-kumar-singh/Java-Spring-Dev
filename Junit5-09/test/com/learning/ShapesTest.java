package com.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ShapesTest {
	
	ShapesTest(){
		System.out.println("Test object is created before test object");
	}
	
	Shapes shape;
	
//	@BeforeAll
//	static void beforeAll() {
//		System.out.println("Before All Test");
//	}
	
	@BeforeAll
	void beforeAll() {
		System.out.println("Before All Test");
	}
	
//	@AfterAll
//	static void afterAll() {
//		System.out.println("After All Test");
//	}
	
	@AfterAll
	void afterAll() {
		System.out.println("After All Test");
	}
	
	@BeforeEach
	void init() {
		shape=new Shapes();
		System.out.println("Before Test");
	}
	
	@AfterEach
	void destroy() {
		System.out.println("After Test");
	}

	@Test
	void testComputeSquareArea() {
//		Shapes shape=new Shapes();
		
		assertEquals(25, shape.computeSquareArea(5));
		System.out.println("Actual Test Running");
	}
	
	@Test
	void testComputeCircleArea() {
//		Shapes shape=new Shapes();
		
		assertEquals(78.5, shape.computeCircleArea(5));
		System.out.println("Actual Test Running");
	}
	

}
