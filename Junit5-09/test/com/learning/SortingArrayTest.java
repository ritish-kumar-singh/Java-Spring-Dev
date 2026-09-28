package com.learning;


import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class SortingArrayTest {

	@Test
	void testSortingArray_Exception() {
//		try {
			SortingArray array=new SortingArray();
//			
////			int[] unsorted= {2,1,4};
//			int[] unsorted= null;
//			int[] sortedArray=array.sortingArrays(unsorted);
//			
//			for(int elem:sortedArray) {
//				System.out.print(elem + " ");
//			}
//			
//			System.out.println("Statements below exception");
//			fail();
//		}
//		catch(NullPointerException e) {
//			System.out.println("Exception generated");
//		}
			
//		int[] unsorted= {2,1,4};
		int[] unsorted= null;
			
		assertThrows(NullPointerException.class, ()->array.sortingArrays(unsorted));
		
	}

}
