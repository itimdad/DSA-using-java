package com.accentureCoding;
import java.util.*;


/*
 *         Enter name
 input->  aman
           Enter char 1 value         ques -> take a name and take two letter in the name and replace each other  
           m
          Enter char2 value 
          n
 output-> anam

 * 
 */

public class ReplaceLetterFromword 
{
	public static void replaceChar(String str, char ch1 , char ch2)
	{
		String res="";
		
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i)==ch1)
			{
				res = res + ch2;
			}
			else if(str.charAt(i)== ch2)
			{
				res = res + ch1;
			}
			else
			{
				res =  res + str.charAt(i);
			}
		}
		System.out.println(res);
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Enter name");
		String str = sc.next();
		
		System.out.println("Enter char 1 value");
		char ch1 =  sc.next().charAt(0);
		
		System.out.println("Enter char2 value ");
		char ch2 = sc.next().charAt(0);
		
		replaceChar(str, ch1, ch2);
		
		

		
	}

}
