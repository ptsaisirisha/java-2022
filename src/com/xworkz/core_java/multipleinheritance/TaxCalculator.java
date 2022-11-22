package com.xworkz.core_java.multipleinheritance;

public class TaxCalculator implements StateTax, CentralTax {
public void incomeTax() {
	System.out.println("Income tax is 100 rs");
	
}
public void electricityTax() {
	System.out.println("Electricity tax is 50 rs");
	
}
}
