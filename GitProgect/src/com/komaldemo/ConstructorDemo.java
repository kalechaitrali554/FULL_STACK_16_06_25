package com.komaldemo;

public class ConstructorDemo {
	
	public static void main (String[]args) {
		//Employee.m1();
		Employee.m2();
	}
}
	 class Employee {
		String ename;
		int eid;
		int esalary;
		
		static void m1() {
			Employee e1= new Employee();
			e1.setEname("komal");
			e1.setEid(1);
			e1.setEsalary(50000);
			System.out.println("e1=="+e1);
		}
			
		static void m2() {
			Employee e2= new Employee("ABC",2,5000);
			Employee e3= new Employee("XYZ",3,6000);
			System.out.println("e2=="+e2);
			System.out.println("e3=="+e3);
		}
			
		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		public int getEid() {
			return eid;
		}

		public void setEid(int eid) {
			this.eid = eid;
		}

		public int getEsalary() {
			return esalary;
		}

		public void setEsalary(int esalary) {
			this.esalary = esalary;
		}

		@Override
		public String toString() {
			return "Employee [ename=" + ename + ", eid=" + eid + ", esalary=" + esalary + "]";
		}
		
		Employee(){
			System.out.println("Inside noarg constructor");
		}
		
		Employee(int A){
			this();
			System.out.println("Inside single parameter");
		}
		
		Employee(int A,int B){
			this(1);
			System.out.println("Inside double parameter");
		}

		public Employee(String ename, int eid, int esalary) {
			//super();
			this(2,3);
			this.ename = ename;
			this.eid = eid;
			this.esalary = esalary;
			System.out.println("Inside constructor");
		}
		
		
	}
