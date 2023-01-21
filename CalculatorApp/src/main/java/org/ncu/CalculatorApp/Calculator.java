package org.ncu.CalculatorApp;

public class Calculator {
	AdditionService add;	// declaration
	SubtractionService sub;	// declaration
	
	//	MathService math;
	Calculator(AdditionService add, SubtractionService sub){
		
		  this.add = add; // initialization this.sub = sub;
		  this.sub = sub;
		// this.math = math;
	}
	public void compute(String operation, int x, int y) {
		if(operation.equals("add")) {
			this.add.operate(x, y);
		}else {
			//	operation.equals("sub")
			this.sub.operate(x, y);
		}
	}
}
