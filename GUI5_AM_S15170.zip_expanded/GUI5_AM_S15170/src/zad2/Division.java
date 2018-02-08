package zad2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Division extends Operators {
	String res = "";
	double num1 = 0;
	double num2 = 0;

	Division() {
	};

	@Override
	String getResult(String number1, String number2) {
		BigDecimal result = new BigDecimal("0");
		BigDecimal bd1 = new BigDecimal(number1);
		BigDecimal bd2 = new BigDecimal(number2);
		try {
			result = bd1.divide(bd2);
		} catch (ArithmeticException e) {

			result = bd1.divide(bd2, 10, RoundingMode.HALF_UP);

		}
		
		this.res = result + "";
		return this.res;
	}

	@Override
	public String toString() {

		return this.res;
	}
}
