package zad2;

import java.util.Iterator;
import java.util.Map;

public class Customer {
	private String name;
	private double balance;
	private ShoppingCart shoppingcart = new ShoppingCart();

	public Customer(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}

	public double getCash() {
		return this.balance;

	}

	public void pay() {
		double pay = 0;
		for(Iterator<Map.Entry<Flower, Integer>> it =shoppingcart.getContent().entrySet().iterator(); it.hasNext(); ) {
		      Map.Entry<Flower, Integer> entrySC = it.next();
		
			if (!(PriceList.getInstance().getPriceListMap().containsKey(entrySC.getKey().getName()))){
				it.remove();
				
			}
			if (pay > this.balance)
				break;
			//nice method of iterating through a map, using an Iterator (to avoid ConcurrentModificationException)
			for(Iterator<Map.Entry<String, Double>> it2=PriceList.getInstance().getPriceListMap().entrySet().iterator();it2.hasNext();) {
				Map.Entry<String,Double> entryPriceList =it2.next();
				if (entrySC.getKey().getName().equals(entryPriceList.getKey())) {
					pay = pay + entryPriceList.getValue() * entrySC.getValue();
					if (pay > this.balance) {
						pay -= entryPriceList.getValue() * entrySC.getValue();
						it.remove();
						break;
					}

				}

			}
		}
		this.balance = this.balance - pay;

	}

	public void get(Flower flower) {
		shoppingcart.getContent().put(flower, flower.getQuantity());

	}

	public ShoppingCart getShoppingCart() {
		return this.shoppingcart;

	}

	public void pack(Box box) {
		box.getContent().putAll(shoppingcart.getContent());
		shoppingcart.getContent().clear();
		

	}
	static int valueOf(Box box, String color) {
		  int cost=0;
		  for (Map.Entry<Flower, Integer> entry : box.getContent().entrySet()){
			  if(entry.getKey().getColor().equals(color)){
				  for (Map.Entry<String, Double> entryPriceList : PriceList.getInstance().getPriceListMap().entrySet()) {
					  if(entryPriceList.getKey().equals(entry.getKey().getName())){
						  cost+=entry.getValue()*entryPriceList.getValue();
					  }
				  }
			  } 
		  }
	       return cost;
	       
	}
	
}
