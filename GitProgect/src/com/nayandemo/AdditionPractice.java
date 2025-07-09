package com.nayandemo;

import java.util.Scanner;

public class AdditionPractice {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		add();
		System.out.println("Enter the value of A");
		int A = s.nextInt();
		System.out.println("Enter the value of B");
		int B = s.nextInt();
		sub( A, B);
		System.out.println("Enter the value of X");
		int X = s.nextInt();
		System.out.println("Enter the value of Y");
		int Y = s.nextInt();
		int Result = mul(X, Y);
		System.out.println("Result=="+Result);
		
	}
  static	void add() {
		Scanner s = new Scanner (System.in);
		int Result;
		System.out.println("Enter value of num1");
		int num1 = s.nextInt();
		System.out.println("Enter value of num2");
		int num2 = s.nextInt(); 
		Result = num1 + num2;
		System.out.println("Result=="+Result);
	}
  static void sub(int A, int B) {
	  int Result;
	  Result = A-B;
	  System.out.println("Result=="+Result);
  }
  static int mul(int X, int Y) {
	  int Result;
	  Result =X*Y;
	  return Result;
	     
  }
}