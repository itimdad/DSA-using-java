package com.accentureCoding;

public class LargestNumArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int [] arr = {2,7,3,9,2,5,90};
		
		LargestNumber(arr);

	}

	public static void LargestNumber(int [] arr )
	{
		int maxNum = arr[0];
		
		for(int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>maxNum)
			{
				maxNum = arr[i];
			}
			
		}
		
		System.out.println("max Num is: " + maxNum); 
		
		
	}
} 
