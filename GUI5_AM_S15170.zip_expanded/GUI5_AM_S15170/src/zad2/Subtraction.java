package zad2;

import java.math.BigDecimal;

public class Subtraction extends Operators {
	String res = "";
	double num1 = 0;
	double num2 = 0;

	Subtraction() {
	};

	@Override
	String getResult(String number1, String number2) {
		BigDecimal result = new BigDecimal("0");
		BigDecimal bd1 = new BigDecimal(number1);
		BigDecimal bd2 = new BigDecimal(number2);
		result = bd1.subtract(bd2);
		this.res = result + "";
		return this.res;
	}

	@Override
	public String toString() {
		return this.res;
	}

}
