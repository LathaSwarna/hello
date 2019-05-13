package com.javaproject;
import java.util.Scanner;
public class AdditionInheritns extends Numbers 
{
 
             public static void main(String args[]) 
             {
		         Numbers demo = new Numbers();
		         Scanner add = new Scanner(System.in);
		         System.out.println("Enter the two numbers: ");
		         int no1 = add.nextInt();
		         int no2 = add.nextInt();
		         int sum = no1 +  no2;
		         System.out.println("Sum of the numbers" +sum);
	         }
    }


