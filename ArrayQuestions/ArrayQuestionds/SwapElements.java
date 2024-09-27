package com.ArrayQuestionds;

import java.util.Arrays;

public class SwapElements {

	public static void main(String[] args) 
	{
	int[] arr = {2,33,7,9,5};
	
	swap(arr, 1 , 2 );
	
	System.out.println(Arrays.toString(arr));
	
	

	}
	
	static void swap(int[] arr, int index1, int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		
	}

}
