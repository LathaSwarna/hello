package com.javaproject;

import java.util.Scanner;

public class AdditionAbstraction {
	
	
	   public static int no1;
	   public static int no2;
	  public static int sum;
	  AdditionAbstraction (int no1,int no2,int sum)
	   {
		   this.no1=no1;
		   this.no2=no2;
		   this. sum= sum;
		   
	   }
	   public static void main(String args[])
	   {
	      System.out.println("Enter two integers to calculate their sum");
	      Scanner scanner = new Scanner(System.in);
	     
	      no1 = scanner.nextInt();
	      no2 = scanner.nextInt();
	      sum = no1 +no2;
	     System.out.println("Sum of the integers = " + sum);
	   }
}
