package com.ArrayQuestionds;

import java.util.Arrays;

public class MaxValueInArray {

	public static void main(String[] args)
	{
	
		int [] arr = {22,5,88,7,9};
		
	
		Reverse(arr);
		
		System.out.println(Arrays.toString(arr));
		

	}
	
	//Reverse userDefine Method 
	static void Reverse(int[] arr)
	{
		int start = 0;
		int end = arr.length-1;
		
		while(start<end)
		{
			int temp = arr [start];
			 arr[start] = arr[end];
			 arr[end] = temp;
			 
			 start++;
			 end--;
		}
		
		
	}
	
	
	//Swap userDefine method 
	static int max(int[] arr)
	{
		int maxNum=arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(maxNum < arr[i])
			{
				maxNum=arr[i];
			}
		}
		
		return maxNum;
		
		
	}

}
