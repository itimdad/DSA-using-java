package com.imdad;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimension 
{

	public static void main(String[] args) 
	{
		
	
		/*
		 
		 1 3 4  
		 6 7 8 
		 2 4 9
		 
		 */
		
//		int[][] arr1 = 
//			{
//					{1,2,3}, //0th index
//					{4,5,6}, //1st index 
//					{7,8,9}  //2nd index
//								
//			};
		
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		
		//input in 2-D array
		System.out.print("Enter values");
		for(int row=0;row<arr.length;row++)
		{
			//for each column in every row
			
			for(int col = 0; col < arr[row].length; col++ )
			{
				arr[row][col] = sc.nextInt();
			}
		}
		
//		//output
//		
//		for(int row=0;row<arr.length;row++)
//		{
//			//for each column in every row
//			
//			for(int col = 0; col < arr[row].length; col++ )
//			{
//				System.out.print(arr[row][col]+ " ,");
//			}
//			System.out.println();  //for new line
//		}
//	
		
	
//		//output using toString
//		
//		for(int row = 0; row < arr.length; row++)
//		{
//			System.out.println(Arrays.toString(arr[row]));
//		}
		
		
		//output using toString and for each loop
		
		for(int[] a: arr)
		{
			System.out.println(Arrays.toString(a));
			
		}

	}

}
