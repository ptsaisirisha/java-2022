package com.xworkz.core_java.multipleinheritance;

public class User implements Fan,Lamp {
	public void light() {
		System.out.println("used for light");
	}
	
	public void air() {
		System.out.println("used for air");
	}
	

}
