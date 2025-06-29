package practiceone;

public class PracticeDemo {
	public static void main(String[] args) {
		
		System.out.println("welcome first");
		System.out.println("hello world");
		
		m2();
		PracticeDemo p1 = new PracticeDemo();
		p1.m1();
	}
	int x = 5;//instance variable
	static int x1 = 6;//static variable
	
	
	void m1() {
	System.out.println("inside instance method");//instance method
	System.out.println(x);
	System.out.println(x1);
	
	}
	
	static void m2() {
	
		System.out.println("inside static method"); //static method
		PracticeDemo p2 = new PracticeDemo();
		System.out.println(p2.x);
		System.out.println(x1);
		
		
	}
	{
		System.out.println("inside instance block");
		
	}
	static{
		System.out.println("inside static block");
	}

}
