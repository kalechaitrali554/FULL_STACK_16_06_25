package com.nayandemo;

public class Student2 {
   int sId;
   String sName;
   int sMark;
   public static void main(String[] args) {
	a1();
}
  static void a1() {
    Student2 s1 = new Student2();
    s1.setsId(1);
    s1.setsName("Nayan");
    s1.setsMark(80);
    System.out.println("s1=="+s1);
    System.out.println("Name=="+s1.getsName());
    Student2 s2 = new Student2();
    
    System.out.println("s2=="+s2);
   }
@Override
public String toString() {
	return "Student [sId=" + sId + ", sName=" + sName + ", sMark=" + sMark + "]";
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
public int getsMark() {
	return sMark;
}
public void setsMark(int sMark) {
	this.sMark = sMark;
}

  
}
