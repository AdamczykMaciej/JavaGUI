/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package zad2;

public class Calc {
	private String res = "";

	String doCalc(String arg) {

		String[] arr = new String[3];
		arr = arg.split("\\s++");
		Operators.fillMap();
		try {
			res = ((Operators) Operators.getMap().get(arr[1])).getResult(arr[0], arr[2]);
		} catch (Exception e) {
			System.out.println("Invalid command to calc");
		}
		return this.res;
	}

	@Override
	public String toString() {

		return this.res;
	}

}
