package com.xworkz.core_java.methodoverriding.humaneat;

public class overridinghuman {
public static void main(String[] args) {
	human Human=new human();
	System.out.println(Human.eating());
	boy Boy=new boy();
	System.out.println(Boy.eating());
	girl Girl=new girl();
	System.out.println(Girl.eating());
	
}
}