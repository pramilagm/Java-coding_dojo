package com.codingdojo.calculator;

public class CalculatorTest {
	public static void main(String [] args) {
		Calculator testCalc1 = new Calculator(10.5,5.2,(double) 0,"+");
		Calculator testCalc2 = new Calculator();
		Calculator testCalc3 = new Calculator(2019.32,32.99, (double) 0,"-");
		testCalc1.performOperation();
		testCalc1.performOperation();
		testCalc2.performOperation();
		testCalc3.performOperation();
		testCalc1.getResults();
		testCalc1.getResults();

		testCalc2.getResults();
		testCalc3.getResults();
	}

}
