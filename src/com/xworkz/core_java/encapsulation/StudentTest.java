package com.xworkz.core_java.encapsulation;

public class StudentTest {
	public static void main(String args[]) {
		
		Student student=new Student();
		System.out.println(student.getName());
		
		student.setName("siri");
		student.setUsn("3VC17EC041");
		student.setCollage("RYMEC");
		student.setAge(23);
		
		System.out.println("Studentname:"+ student.getName());
		System.out.println("Studentusn:"+ student.getUsn());
		System.out.println("Studentcollage:"+ student.getCollage());
		System.out.println("Studentage:"+ student.getAge());
		
			
			
		}
}
