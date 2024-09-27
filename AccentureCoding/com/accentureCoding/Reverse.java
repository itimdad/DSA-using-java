package com.accentureCoding;
class Reverse 
{

public static void main(String args[])
{
	int num=233456;

	
	int reverse = 0;

	while(num!=0)
	{
		int rem=num%10;

		reverse=reverse*10+rem;

		num/=10;


	}

	System.out.println("Reverse"+ reverse);

	
}

}