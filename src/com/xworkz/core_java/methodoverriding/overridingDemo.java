package com.xworkz.core_java.methodoverriding;

public class overridingDemo {
public static void main(String[] args) {
	RBI rbi=new RBI();
	SBI sbi=new SBI();
	HDFC hdfc=new HDFC();
	System.out.println(rbi.getInterestRate());
	System.out.println(sbi.getInterestRate());
	System.out.println(hdfc.getInterestRate());
	
}
}
