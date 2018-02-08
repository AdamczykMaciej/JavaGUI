package zad1;

import java.util.Iterator;

public class Hailstone implements Iterable<Integer> {
	int value;
	
	public Hailstone(int value){
		this.value=value;
	}

	@Override
	 public Iterator<Integer> iterator() {
        return new MyIterator(value);
	}


	

}
