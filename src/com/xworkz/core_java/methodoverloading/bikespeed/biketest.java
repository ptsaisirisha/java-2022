package com.xworkz.core_java.methodoverloading.bikespeed;

public class biketest {
public static void main(String[] args) {
	bike hero=new bike();
	high high=new high();
	slow slow=new slow();
	hero.speed(high);
	hero.speed(slow);
}
}
