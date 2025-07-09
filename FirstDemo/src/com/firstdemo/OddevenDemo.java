package com.firstdemo;

import java.util.Scanner;

public class OddevenDemo {
	public static void main(String[] args) {
		ifDemo();
		ifelseDemo(); 
	}
     static void ifDemo() {
	Scanner s = new  Scanner(System.in);
	System.out.println("Enter a number"); 
	int num = s.nextInt();
	if(num % 4==0) 
		System.out.println("Entered number is even");
	    System.out.println("Entered number is odd");
	
}
     static void ifelseDemo() {  
    		Scanner s = new  Scanner(System.in);
    		System.out.println("Enter a number");
    		int num = s.nextInt();
    		if(num % 4==0)   
    			System.out.println("Entered number is even");
    		else   
    		System.out.println("Entered number is odd");
    		
    		
    	}   
}
