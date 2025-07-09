package com.nayandemo;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		l1();
	}
 static void l1() {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter the year");
	 int year = s.nextInt();
	 if(year % 4 ==0) {
		 System.out.println("Year is leap year");
	 }
	 else {
		 System.out.println("Year is not leap year");
	 }
 }
}
