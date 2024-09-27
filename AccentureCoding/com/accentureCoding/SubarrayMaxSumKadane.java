package com.accentureCoding;

public class SubarrayMaxSumKadane 
{

	public static void main(String[] args) 
	{
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		
		int result = MaxSubArray(arr);
		System.out.println("max sum is" + result);
	}

	public static int MaxSubArray(int [] arr)
	{
		int sum = 0;
		int maxSum=Integer.MIN_VALUE;
		
		for(int i =0; i<arr.length; i++)
		{
			
			if(sum >= 0)
			{
				sum = arr[i]+sum;
				
			}
			else
			{
				sum = arr[i];
			}
			
			maxSum = Math.max(maxSum, sum);
			
			if(maxSum<sum)
			{
				maxSum = sum;
			}
			
			
		}
		
		return maxSum;
	}
}
