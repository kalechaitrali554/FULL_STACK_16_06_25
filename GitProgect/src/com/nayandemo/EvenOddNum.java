package com.nayandemo;

import java.util.Scanner;

public class EvenOddNum {
	public static void main(String[] args) {
		e1();
	}
 static void e1() {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter the number");
	 int num = s.nextInt();
	 if(num % 2 == 0) {
		 System.out.println("Number is Even");
	 }
	 else {
		 System.out.println("Number is odd");
	 }
 }
 }
