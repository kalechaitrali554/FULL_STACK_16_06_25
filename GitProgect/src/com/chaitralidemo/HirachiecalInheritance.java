package com.chaitralidemo;

public class HirachiecalInheritance {
	public static void main(String[] args) {
		Engineer.m3();
	}

}
class Coder{
	int cId;
	String cName;
	int cSalary;
	@Override
	public String toString() {
		return "Coder [cId=" + cId + ", cName=" + cName + ", cSalary=" + cSalary + "]";
	}
	public Coder(int cId, String cName, int cSalary) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cSalary = cSalary;
	}

}
class Tester extends Coder{
	String tWord;

	public Tester(int cId, String cName, int cSalary, String tWord) {
		super(cId, cName, cSalary);
		this.tWord = tWord;
	}

	@Override
	public String toString() {
		return "Tester [tWord=" + tWord + ", cId=" + cId + ", cName=" + cName + ", cSalary=" + cSalary + "]";
	}
	
}
class Developer extends Coder{
	int dApp;

	public Developer(int cId, String cName, int cSalary, int dApp) {
		super(cId, cName, cSalary);
		this.dApp = dApp;
	}

	@Override
	public String toString() {
		return "Developer [dApp=" + dApp + ", cId=" + cId + ", cName=" + cName + ", cSalary=" + cSalary + "]";
	}
	
}
class Engineer extends Coder{
	String eName;

	public Engineer(int cId, String cName, int cSalary, String eName) {
		super(cId, cName, cSalary);
		this.eName = eName;
	}

	@Override
	public String toString() {
		return "Engineer [eName=" + eName + ", cId=" + cId + ", cName=" + cName + ", cSalary=" + cSalary + "]";
	}
	
	static void m3() {
		Coder c = new Coder(01,"anu",2500);
		Tester t = new Tester(02,"hello",2600,"anju");
		Developer d = new Developer(03,"hey",2400,5);
		Engineer e = new Engineer(04,"bunny",2800,"bunty");
		System.out.println("coder="+c);
		System.out.println("Tester="+t);
		System.out.println("Developer="+d);
		System.out.println("Engineer="+e);
	}
}
