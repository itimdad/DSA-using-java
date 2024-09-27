package com.imdad;

public class Main
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Ques: Store a roll  no
		int a= 19;
		
		//Ques: Store a persons name;
		String name="imdad";
		
		//Ques : Store 5 roll no.
		int rno1=1;
		int rno2=23;
		int rno3=4;
		
		//Syntax Array
		//dataType[] Variable_Name = new DataType[Size];
		
		//Ques: Store 5 roll no;
		int [] rollno = new int[5];
		
		//directly
		int [] rollno2= {2,3,4,5,6,6};
		
		
		int[] roll; //Declaration of array.  roll is getting defined in the stack memory
		roll=new int[5]; // initialization of array :actually here object is being created in the memory (heap)
		
		System.out.println(roll[3]);

		
		String[] arr = new String[4];
		System.out.println(arr[3]);
		
	}

}
