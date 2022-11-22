package com.xworkz.core_java.inheritance.association.humanheart;

public class humanheartdemo {
    public static void main(String[] args) {
    	human human=new human();
    	
    	human.bodypart="heart";
    	human.temperature=35;
    	human.heart=new heart();
    	
    	System.out.println("human bodypart is : "+human.bodypart);
    	System.out.println("normal human temperature is : "+human.temperature);
        System.out.println("normal human heartbeat is :"+human.heart.heartbeat);
        System.out.println("bloodpump of heart is :"+human.heart.bloodpump);
    }
}
