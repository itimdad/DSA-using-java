package com.imdad;
import java.util.Arrays;
import java.util.Scanner;

public class Input
{

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[4];
		
		arr[0]=7;
		arr[1]=3;
		arr[2]=8;
		arr[3]=533;
		
		System.out.println(arr[3]);
		
		//input using for loop
		
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=sc.nextInt();
//			
//		}
//		//print by toString
//		System.out.println(Arrays.toString(arr));
		
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]+", ");
//		}
		
		
//		//print by  for each loop 
//		
//		for(int num: arr)  //for evry element of array , print the element
//		{
//			System.out.print(num+", ");  //here num represent element of array 
//		}
		
		
		
		
		//Array of objects
		
		String[] str = new String[6];
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.next();
		}
		
		System.out.println(Arrays.toString(str));
		

	}

}
