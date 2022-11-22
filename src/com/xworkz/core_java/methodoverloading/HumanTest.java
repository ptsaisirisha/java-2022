package com.xworkz.core_java.methodoverloading;

public class HumanTest {
public static void main(String[] args) {
	Human siri=new Human();
	unknown unknown=new unknown();
	friend friend=new friend();
	siri.speak(unknown);
	siri.speak(friend);
}
}
