package com.farhan.oops;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.addition(2, 2);
		cal.addition(2.4, 9.6);
		cal.addition(5.2, 6);
		cal.addition(6, 8.3);
		
		cal.difference(15, 4);
		cal.difference(7.3, 5.6);
		cal.difference(9.8, 4);
		cal.difference(8, 4.2);
		
		cal.multiplication(10, 9);
		cal.multiplication(3.6, 5.5);
		cal.multiplication(17.6, 5);
		cal.multiplication(3, 8.3);
		
    cal.division(8, 5);
    cal.division(11.9, 5.3);
    cal.division(13.8, 6);
    cal.division(20, 5.3);
  }
}
