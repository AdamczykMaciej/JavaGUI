package zad2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ShoppingCart {
	private Map<Flower,Integer> map= new ConcurrentHashMap<>();
	
	
	public Map<Flower, Integer> getShoppingCartMap(){
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
