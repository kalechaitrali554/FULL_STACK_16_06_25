package com.chaitralidemo;

public class Student1 {
  int sId;
  String sName;
  int sMarks;
  
  public static void main(String[] args) {
	   
	  } 
  void  m1() {
	  Student1 s1 =new Student1();
	  s1.setsId(1);
	  s1.setsName("chaitrali");
	  s1.setsMarks(70);
	  System.out.println("s1=="+s1);
	  System.out.println("name=="+s1.getsName());
	  Student1 s2 = new Student1();
	  System.out.println("s2=="+s2);
  }
@Override
public String toString() {
	return "Student1 [sId=" + sId + ", sName=" + sName + ", sMarks=" + sMarks + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public int getsId() {
	return sId;
}
public void setsId(int sId) {
	this.sId = sId;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public int getsMarks() {
	return sMarks;
}
public void setsMarks(int sMarks) {
	this.sMarks = sMarks;
}

  
}	  
	 