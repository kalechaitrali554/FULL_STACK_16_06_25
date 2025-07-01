package com.chaitralidemo;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		//add();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your first number");
		int num1 =s.nextInt();
		System.out.println("Enter your second number");
		int num2 =s.nextInt();
		//add1 (num1,num2);
		int result =add2(num1,num2);
		System.out.println("Addition=="+ result);
		
	}
	static void add() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your first number");
		int num1 =s.nextInt();
		System.out.println("Enter your second number");
		int num2 =s.nextInt();
		
		int result =num1+num2;
		System.out.println("Addition=="+ result);
		
		
	}
	static void add1 (int num1 , int num2) {
		int result =num1+num2;
		System.out.println("Addition=="+ result);
		
	}
	static int add2 (int num1, int num2) {;
	int result = num1 +num2 ;
	return result ;
	}
	
	

}
