package com.xworkz.core_java.constructor;

public class ConstructorDemo {
	public static void main(String[] args) {
		Medicine medicine=new Medicine();
		System.out.println(medicine.name);
		Medicine paracetamol=new Medicine("paracetamol",10.00);
		System.out.println(paracetamol.name);
	}
}
