package zad2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Container {
	private Map<Flower,Integer> map= new ConcurrentHashMap<>();
	
	public Map<Flower, Integer> getContent(){
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
