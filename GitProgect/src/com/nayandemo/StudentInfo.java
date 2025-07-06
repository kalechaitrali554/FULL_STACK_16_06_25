package com.nayandemo;

public class StudentInfo {
 int sId;
 String sName;
 String sAddress;
 int sMark;
 public static void main(String[] args) {
	n1();
}

static void n1() {
	StudentInfo s1 = new StudentInfo();
 s1.setsId(1);
 s1.setsName("Nirved");
 s1.setsAddress("Pune");
 s1.setsMark(90);
 System.out.println("s1=="+s1);
 System.out.println("Name=="+s1.getsName() +    "Marks=="+s1.getsMark());
 StudentInfo s2 = new StudentInfo();
 s2.setsId(2);
 s2.setsName("Arush");
 s2.setsAddress("Pune");
 s2.setsMark(92);
 System.out.println("s2=="+s2);
 System.out.println("Name=="+s2.getsName() + "Marks=="+s2.getsMark());
}

@Override
public String toString() {
	return "StudentInfo [sId=" + sId + ", sName=" + sName + ", sAddress=" + sAddress + ", sMark=" + sMark + "]";
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

public String getsAddress() {
	return sAddress;
}

public void setsAddress(String sAddress) {
	this.sAddress = sAddress;
}

public int getsMark() {
	return sMark;
}

public void setsMark(int sMark) {
	this.sMark = sMark;
}

}
