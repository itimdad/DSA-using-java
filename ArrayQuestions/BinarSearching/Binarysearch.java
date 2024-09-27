package com.BinarSearching;

public class Binarysearch
{

	public static void main(String[] args)
	{
		
		int[] arr = {2,3,16,24,36,37,58,90};
		int target=58;

		
		int ans=binarysearch(arr, target);
		
		System.out.println(ans);

	}
	
	
	//return the index
	static int binarysearch(int[] arr, int target)
	
	{
	int start = 0;
	int end = arr.length-1;
	
	
	while(start<=end)
	{
		//int mid = ( start + end ) / 2;     //might possible that (start+end) exceed the range of int in java so we get error 
		int mid=start + (end - start) / 2;    //better way to calculate mid
		

		if(target<arr[mid])
		{
			end=mid-1;
		
		}
		
		else if(target > arr[mid])
		{
			start=mid+1;
		}
	
		else
		{
			//answer
			return mid;
		}
		
	}
	return -1;
	
	}
	

}
