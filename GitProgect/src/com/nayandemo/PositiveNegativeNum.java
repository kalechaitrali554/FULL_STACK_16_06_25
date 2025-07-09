package com.nayandemo;

import java.util.Scanner;

public class PositiveNegativeNum {
	public static void main(String[] args) {
		pn();
	}
   static void pn() {
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter the number");
	   int a = s.nextInt();
	   if(a > 0) {
		   System.out.println("Number is Positive");
	   }
	   else{
		   System.out.println("Number is negative");
	   }
	   }
}
