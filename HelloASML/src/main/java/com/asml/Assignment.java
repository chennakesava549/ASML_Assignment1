package com.asml;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/*
 * Stand Alone Program. We can run directly this class and see the traverse array output in console. 
 */

public class Assignment {
	final static Logger logger = Logger.getLogger(Assignment.class);
	static {
		  BasicConfigurator.configure();
		}

	public static void main( String[] args) {
				
		int[][] matrix = enterInput();
		  if ( matrix != null)
		   printSprialArray(matrix);
	}
 
	// Functional Logic to Traverse the 2D Array into SpiralArray pattern. 

	public static List<Integer> printSprialArray(int[][] matrix) {
		List<Integer> output = new ArrayList<Integer>();
		
		// Defining the boundaries of the matrix.

		int rows = matrix.length;
	    int cols=matrix[0].length;
		int i,row_index=0,col_index=0;
		int last_row=rows-1,last_col = cols-1;		
		
		while( row_index <= last_row  && col_index <= last_col) {
			
			for (i=col_index; i<=last_col; i++)
				output.add(matrix[row_index][i]);
			
			       row_index++;
			       
			 for(i=row_index; i<=last_row; i++)
				 output.add(matrix[i][last_col]);
			 
			      last_col--;
			      
			  if(row_index <= last_row) {
				  for(i=last_col;i>=col_index; i--)
					  output.add(matrix[last_row][i]);
				    
				  last_row--;
			  }
			  
			  if(col_index < last_col) {
				  for(i=last_row;i>=row_index; i--)
					  output.add(matrix[i][col_index]);
					    
					  col_index++;
			  }
			      
		}
		logger.info("Array Travese Pattern" +output);
		return output;
	}
	
	
	/*
	 * Read row,column and 2D Array Details from console or user input
	 */

	public static int[][] enterInput() {
		Scanner s = new Scanner(System.in);
		logger.info("enter row details");
		int rows = s.nextInt();
		logger.info("enter column details");
		int cols = s.nextInt();
		if( rows != 0 && rows > 0 && cols !=0 && cols > 0 ) {
			logger.info("Enter 2d array details");
			int[][] array = new int[rows][cols];
			 for(int i = 0;i < rows;i++) {
				for(int j= 0;j < cols;j++) {
	             array[i][j] = s.nextInt();			
			     }
			  }
			 s.close();
			return array;
		 }
		
		s.close();
		logger.info("Please enter proper row and column values" );
		return null;
	}
}


