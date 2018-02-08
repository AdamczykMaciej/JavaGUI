package zad2;

import java.util.HashMap;
import java.util.Map;

	abstract public class Operators {
	protected static Map <String,Operators> map =new HashMap<String, Operators>();
	
	Operators(){}
	
	static void fillMap(){
		Multiplication multi=new Multiplication();
		Division div=new Division();
		Addition add=new Addition();
		Subtraction sub=new Subtraction();
		Operators.map.put("*", multi);
		Operators.map.put("/", div);
		Operators.map.put("+", add);
		Operators.map.put("-", sub);
	}
	abstract String getResult(String number1, String number2);
	public static Map getMap(){
		return map;
		
	}
	
	public abstract String toString();

}
