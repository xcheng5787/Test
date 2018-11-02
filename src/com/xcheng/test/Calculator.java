package com.xcheng.test;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int substract(int a, int b) {
		return a - b; // Bug:result=result-n
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) throws Exception {
		if (0 == b) {
			throw new Exception("除数不能为0");
		}
		return a / b;
	}

	public int square(int n) {
		return n * n;
	}

	public void squareRoot(int n) {
		for (;;)
			;
	}
}
