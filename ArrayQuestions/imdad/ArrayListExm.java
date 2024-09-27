package com.imdad;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExm {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>(10);
		
		list.add(99);
		list.add(4);
		list.add(55);
		list.add(7);
		list.add(88);
		list.add(83);
		list.add(822);
		
	
		System.out.println(	list.contains(88));
		list.set(0,999);
		
		list.remove(2);
		
		
		System.out.println(list);
		
		
		//input 
		System.out.println("Enter values");
		for(int i = 0; i < 5; i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println(list);

	}

}
