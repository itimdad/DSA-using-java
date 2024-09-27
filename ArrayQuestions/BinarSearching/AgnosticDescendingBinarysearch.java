package com.BinarSearching;

import java.util.Scanner;

public class AgnosticDescendingBinarysearch
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner (System.in);
		
		int[] arr = new int[5];
		
		System.out.println("Enter array value ");
		for(int i=0;i<arr.length; i++)
		{
			 arr[i]=sc.nextInt();		
	    }
		
		System.out.println("Enter value of key");
		
		int target = sc.nextInt();

		
		int ans=AgnosticBinary(arr, target);
		
		System.out.println(ans);

	}
	
	
	//return the index
	static int AgnosticBinary(int[] arr, int target)
	{
		
	int start = 0;
	int end = arr.length-1;
	
	//find whether array is sorted ascending of descending order 
	boolean isAsce=arr[start]<arr[end];
	
	while(start<=end)
	{
		//int mid = ( start + end ) / 2;     //might possible that (start+end) exceed the range of int in java so we get error 
	    int mid=start + (end - start) / 2;    //better way to calculate mid
			

		if(target == arr[mid])
		{
			return mid;
			
		}
		if(isAsce)
		{
			System.out.println("Ascending order ");
			
			if(target < arr[mid])
			{
				end = mid-1;
			}
			
			else if(target > arr[mid])
			{
				start = mid+1;
			}
		}
		
		else
		{
			System.out.println("Descending order");
			if(target > arr[mid])
			{
				end = mid-1;
			}
			
			else if(target < arr[mid])
			{
				start = mid+1;
			}

		}
			
		
	}
	return -1;
	    }
	
	
	}
	


