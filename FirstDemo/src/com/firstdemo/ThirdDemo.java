package com.firstdemo;

public class ThirdDemo {
	public static void main(String[] args) {
		
		System.out.println("hello");
		System.out.println("pink");
		System.out.println("gold");
		var1();
		ThirdDemo t1 = new ThirdDemo();
		t1.var(); 
		
	}
	int num1 = 5;//instance variable
	static int num2 = 15; //static variable
	 private int num3 =20;// private modifier
	 public String num4 = "word";//public modifier
     protected char C = '@';//protected modifier
		
	
	
	void var() {
		System.out.println("instance method");// instance method
		System.out.println(num1);//instance - instance no need to create object
		System.out.println(num2);// static -instance directly call
	}
	static void var1  () {
		System.out.println("static method");//static method
		ThirdDemo t2 =new ThirdDemo(); //create object with class name
		System.out.println(t2.num1);// static -instance need to create object
		System.out.println(num2);// static is directly call
	}
	
	{
		System.out.println("instance block");
		System.out.println(num1);
		System.out.println(num2);
	}
	
	static{
		System.out.println("static block");
		ThirdDemo t3 =new ThirdDemo(); 
		System.out.println(t3.num1);
		System.out.println(num2);
	}


}
 
class FourthDemo {// other class
	void var2() {
		 System.out.println("inside instance method"); 
		ThirdDemo t3 =new ThirdDemo();//object which we have create
		System.out.println(t3.num1);//instance -instance in other class will not call directl  need to create object
 System.out.println(ThirdDemo.num2);//instance -static in other class will not call directly need to create object with classname	
	}
	 static void n2() {  
		 System.out.println("inside static method");  
		} 
	 
	{  
		System.out.println("inside instance block");  
		}  
	static {  
		System.out.println("inside static block");  
		} 
	
		
}
