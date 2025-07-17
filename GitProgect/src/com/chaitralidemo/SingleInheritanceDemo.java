package com.chaitralidemo;

public class SingleInheritanceDemo {
public static void main(String[] args) {
	Child.m1();
}
}
class Parent{
	int sId;
	String sName;
	@Override
	public String toString() {
		return "Parent [sId=" + sId + ", sName=" + sName + "]";
	}
	public Parent(int sId, String sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}
	}
class Child extends Parent {
	int sMarks;
public Child(int sId, String sName, int sMarks) {
		super(sId, sName);//calling constructor of parent class of same class
		this.sMarks = sMarks;
	}
@Override
public String toString() {
	return "Child [sMarks=" + sMarks + ", sId=" + sId + ", sName=" + sName + "]";
}
static void m1() {
	Parent p = new Parent(1,"chaitrali");
	Child c = new Child(2,"hello",30);
	System.out.println("parent="+p);
	System.out.println("child="+c);
}
	}
