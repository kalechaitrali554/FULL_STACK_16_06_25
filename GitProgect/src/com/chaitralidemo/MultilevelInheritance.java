package com.chaitralidemo;

public class MultilevelInheritance {
public static void main(String[] args) {
	NewStudent.m2();
	
}
}
class Teacher{
	int tSalary;
	String tTeaching;
	@Override
	public String toString() {
		return "Teacher [tSalary=" + tSalary + ", tTeaching=" + tTeaching + "]";
	}
	public Teacher(int tSalary, String tTeaching) {
		super();
		this.tSalary = tSalary;
		this.tTeaching = tTeaching;
	}
	
}
class OldStudent extends Teacher{
	String oKnowledge;

	public OldStudent(int tSalary, String tTeaching, String oKnowledge) {
		super(tSalary, tTeaching);
		this.oKnowledge = oKnowledge;
	}

	@Override
	public String toString() {
		return "OldStudent [oKnowledge=" + oKnowledge + ", tSalary=" + tSalary + ", tTeaching=" + tTeaching + "]";
	}
	
}
class NewStudent extends OldStudent{
	int nMarks;

	public NewStudent(int tSalary, String tTeaching, String oKnowledge, int nMarks) {
		super(tSalary, tTeaching, oKnowledge);
		this.nMarks = nMarks;
	}

	@Override
	public String toString() {
		return "NewStudent [nMarks=" + nMarks + ", oKnowledge=" + oKnowledge + ", tSalary=" + tSalary + ", tTeaching="
				+ tTeaching + "]";
	}
	static void m2() {
		Teacher t= new Teacher(2500,"good");
		OldStudent o =new OldStudent(2300,"very good","better");
		NewStudent n= new NewStudent(2800,"best","excellent",99);
		System.out.println("Teacher="+t);
		System.out.println("OldStudent ="+o);
		System.out.println("NewStudent="+n);
	}
}
