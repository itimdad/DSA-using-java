package com.imdad;

import java.util.Arrays;

public class passingInFunction
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int[]  nums = {2,4,7,9,6};
		
		System.out.println(Arrays.toString(nums));
		
		change(nums);
		
		System.out.println(Arrays.toString(nums));
		
		
		
	}
	static void change(int[] arr)
	{
		arr[0]=97;
		
	}

}
