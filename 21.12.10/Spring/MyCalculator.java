package com.javalec.ex;

public class MyCalculator {
	
	Calculator calculator = null;
	int firstNum;
	int SecondNum;
	
	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public void add() {
	calculator.addition(firstNum, SecondNum);
	}
	
	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return SecondNum;
	}

	public void setSecondNum(int secondNum) {
		SecondNum = secondNum;
	}

	public MyCalculator() {}
	
	

}