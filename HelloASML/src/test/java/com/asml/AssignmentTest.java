package com.asml;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AssignmentTest {
	
	@Test
	public void printSpiralArrayTest1() {
	
	    int [][]matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	    List<Integer> expectedOutput= Arrays.asList(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10);
	    List<Integer> actualOutput=Assignment.printSprialArray(matrix);
	    assertTrue(expectedOutput.equals(actualOutput));
		
	}
	
	@Test
	public void printSpiralArrayTest2() {
	
	    int [][]matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15} };
	    List<Integer> expectedOutput= Arrays.asList(1, 2, 3, 6, 9, 12, 15, 14, 13, 10, 7, 4, 5, 8, 11);
	    List<Integer> actualOutput=Assignment.printSprialArray(matrix);
	    assertTrue(expectedOutput.equals(actualOutput));
	}
	
	@Test
	public void printSpiralArrayTest3() {
	
	    int [][]matrix = {{1,2},{3,4},{5,6},{7,8}};
	    List<Integer> expectedOutput= Arrays.asList(1, 2, 4, 6, 8, 7, 3, 5);
	    List<Integer> actualOutput=Assignment.printSprialArray(matrix);
	    assertTrue(expectedOutput.equals(actualOutput));
	}
	
}
