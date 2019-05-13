package com.javaproject;

import java.util.Scanner;

public class AdditionEncaps 
{
	public static void main(String args[]) 
	{
			 Encapsulation add = new Encapsulation();
	         Scanner scanner = new Scanner(System.in);
		     System.out.println("enter the two  numbers: ");
		     int number1 = scanner.nextInt();
		     int number2 = scanner.nextInt();
		     int sum = number1 + number2;
		     System.out.println("Sum of the number" +sum);
	  
		}

	}
