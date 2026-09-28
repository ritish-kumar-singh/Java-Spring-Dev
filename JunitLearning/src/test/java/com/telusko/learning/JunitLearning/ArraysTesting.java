package com.telusko.learning.JunitLearning;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ArraysTesting 
{
	@Test
	void testArrays() {
		int[] expected= {2,4,6,8};
		
		int[] actual= {4,8, 6, 2};
		
		Arrays.sort(actual);
		
//		assertArrayEquals(expected, actual);
		
		assertEquals(expected, actual);
	}
}
