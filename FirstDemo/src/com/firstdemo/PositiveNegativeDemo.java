package com.firstdemo;

import java.util.Scanner;

public class PositiveNegativeDemo {
public static void main(String[] args) {
	ifpositive_negative();
	ifelsepositive_negative();
}
  static void ifpositive_negative() {
	 Scanner scanner =new Scanner(System.in); 
	 System.out.println("enter a value");
	 int value =scanner.nextInt();
	 if(value > 1)
	 System.out.println("enter a positive value");
	 System.out.println("enter a  negative value"); 
	
 }
  static void ifelsepositive_negative() {
		 Scanner scanner =new Scanner(System.in);
		 System.out.println("enter a value");
		 int value =scanner.nextInt(); 
		 if(value < 1)
		 System.out.println("enter a positive value");
		 else
		 System.out.println("enter a  negative value");
		  
	 }
}