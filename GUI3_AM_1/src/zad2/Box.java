package zad2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Box {
	private Customer customer;
	protected Map<Flower,Integer> map=new HashMap<>();
	
	public Box(){}
	
	public Box(Customer customer){
		this.customer=customer;
		
	}
	
	public Map getBoxMap(){
		return this.map;
	}
	
	@Override
	public String toString(){
		String s="";
		for(Map.Entry<Flower, Integer> entry : map.entrySet()){
			s=s+" "+entry.getKey().getName()+" "+entry.getValue();
		}
		return s;
	}

}
