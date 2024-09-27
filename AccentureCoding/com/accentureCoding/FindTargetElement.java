package com.accentureCoding;

public class FindTargetElement {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int [] arr = {2,3,4,10,40};
		int target = 10;
		
		int result = FindElement(arr, target);
		System.out.println(result);
		
	}
	
	public static int FindElement(int [] arr , int target)
	{
		int start = 0;
		int end = arr.length;
		
		while(start <= end)
		{
			int mid = start +(end-start)/2;
			
			if(target == arr[mid])
			{
				return mid;
			}
			
			else if (target< arr [mid]) 
			{
				end = mid-1;
				
			}
			
			else
			{
				start = mid+1;
			}
		}
		return -1;
	}

	
}
