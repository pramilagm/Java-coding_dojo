package com.codingdojo.calculator;

public class Calculator {
	private Double operandOne = 0.0;
	private Double operandTwo = 0.0;
	private Double mathTotal = 0.0;
	private String operation = "";
	public Calculator(Double operandOne, Double operandTwo, Double mathTotal, String operation) {
		super();
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
		this.mathTotal = mathTotal;
		this.operation = operation;
	}
	
	public Calculator() {
	
	}


	public void performOperation() {
		if(getOperation().equals("+")) {
			Double total = getOperandOne() + getOperandTwo();
			setMathTotal(total);
		}
		else if(getOperation().equals("-")) {
			Double total = getOperandOne() - getOperandTwo();
			setMathTotal(total);
		}
	}
	public void getResults() {
		System.out.println("Your total results is " +this.mathTotal);
	}
	public Double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(Double operandOne) {
		this.operandOne = operandOne;
	}
	public Double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(Double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public Double getMathTotal() {
		return mathTotal;
	}
	public void setMathTotal(Double mathTotal) {
		this.mathTotal = mathTotal;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	

}
