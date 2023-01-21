package org.ncu.CalculatorApp;

public class AdditionService implements MathService {

	@Override
	public void operate(int x, int y) {
		System.out.println("Add: "+(x+y));

	}

}
