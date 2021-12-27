package com.farhan.oops;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.addition(2, 2);
		cal.addition(2.4, 9.6);
		cal.addition(5.2f, 6f);
		
		cal.difference(15, 4);
		cal.difference(7.3, 5.6);
		cal.difference(9.8f, 4f);

		cal.multiplication(10, 9);
		cal.multiplication(3.6, 5.5);
		cal.multiplication(17.6f, 5f);
		
                cal.division(8, 5);
                cal.division(11.9, 5.3);
                cal.division(13.8f, 6f);
  }
}
