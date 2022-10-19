package com.xworkz.core_java.inheritance.association;

public class HasARelationshipDemo {
       public static void main(String[] args) {
    	   library sharada=new library();
    	   
    	   sharada.name="Sharada";
    	   sharada.noOfBooks=100;
    	   sharada.location="Bengaluru";
    	   sharada.student=new Student();
    	   
    	   System.out.println("Library name : "+sharada.name);
    	   System.out.println("Student name : "+sharada.student.name);
    	   System.out.println("Student id : "+sharada.student.id);
    	   System.out.println("Student college : "+sharada.student.college);
       }
}
