package com.javaproject;

import java.util.Scanner;

public class AdditionPoly {
	 public int sum(int no1, int no2) 
			    { 
			        return (no1 + no2); 
			    } 

			    public static void main(String args[]) 
			    { 
			    	AdditionPoly  addition = new AdditionPoly(); 
			    	Scanner scanner = new Scanner(System.in);
				     System.out.println("Enter the two numbers: ");
				      int no1= scanner.nextInt();
				      int no2 = scanner.nextInt();
				      int sum = no1+ no2;
				      
				       System.out.println("Sum of the numbers" +sum);
			    }
				}



