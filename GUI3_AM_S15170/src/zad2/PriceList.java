package zad2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
// Singleton class
public class PriceList {
	private Map<String, Double> map=new ConcurrentHashMap<>();
	private static PriceList pricelist=new PriceList(); // a private static field of itself
	
	public PriceList(){}
	
	public void put(String flower, double price){	
		this.map.put(flower, price);
		
	}
	
	public Map<String, Double> getPriceListMap(){
		return map;
	}
	
	public static PriceList getInstance(){
		return pricelist;
		
	}

}
