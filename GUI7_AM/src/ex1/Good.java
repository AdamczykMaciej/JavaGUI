package ex1;

import java.util.ArrayList;

public class Good {
	private String id;
	private int weight;
	private static ArrayList<Good> arr = new ArrayList<>();

	public Good(String id, int weight){
		this.id=id;
		this.weight=weight;
		arr.add(this);
		
	}
	
	public static int getSize(){
		return arr.size();
	}
	
}
