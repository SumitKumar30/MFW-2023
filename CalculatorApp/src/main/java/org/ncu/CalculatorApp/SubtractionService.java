package org.ncu.CalculatorApp;

public class SubtractionService implements MathService {

	@Override
	public void operate(int x, int y) {
		System.out.println("Sub: "+(x-y));

	}

}
