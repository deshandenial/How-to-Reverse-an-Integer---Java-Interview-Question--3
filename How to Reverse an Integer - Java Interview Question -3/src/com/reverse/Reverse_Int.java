package com.reverse;

public class Reverse_Int 
{
	
	public static void main(String[] args) 
	{
		int number = 12345;
		
		
 // one way 
		
		int reverse = 0;
		
		while(number!=0)
		{
		  reverse =reverse * 10 + number % 10 ;
		  number = number / 10 ;
		}
		
		System.out.println("print reverse:" +reverse);
		
 // second way
		
		int numbers = 789;
		System.out.println(new StringBuffer(String.valueOf(numbers)).reverse());
		
	}

}
