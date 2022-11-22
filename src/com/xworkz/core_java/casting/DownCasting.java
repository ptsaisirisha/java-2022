package com.xworkz.core_java.casting;

public class DownCasting {
public static void main(String[] args) {
	Tree tree=new Mango();
	Mango mango=(Mango)tree;
	mango.provideOxygen();
	mango.providesMangoFruits();
}
}
