package com.accentureCoding;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of num");
		
		int nums = sc.nextInt();
		
	    boolean res = isprime(nums);
		System.out.println(res);
		
	}
	
	public static boolean isprime(int nums)
	{
		
		if(nums <=1)
		{
			return false;
		}
		
		for(int i=2; i<=Math.sqrt(nums); i++)
		{
			if(nums % i == 0)
			{
				return false;
			}
			
		}
		return true;
		
	}

}
