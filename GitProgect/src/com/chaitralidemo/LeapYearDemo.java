package com.chaitralidemo;

import java.util.Scanner;

public class LeapYearDemo {
public static void main(String[] args) {
	ifYear();
	ifelseYear();
	}
static void ifYear() {
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter a year");
	int year =s1.nextInt();
	if(year % 400==0) {
		System.out.println("Is a leap year");
	}
		System.out.println("Is a  not leap year");
		
}
static void ifelseYear() {
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter a year");
	int year =s1.nextInt();
	if(year % 400==0) { 
		System.out.println("Is a leap year"); 
	}
		else {
		System.out.println("Is a  not leap year");
		
		}
}
}

