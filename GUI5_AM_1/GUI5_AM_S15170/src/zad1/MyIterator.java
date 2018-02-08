package zad1;

import java.util.Iterator;

public class MyIterator implements Iterator<Integer> {
	int startingValue;
	static int temp=0;

	public MyIterator(int startingValue) {
		this.startingValue = startingValue;
		
		
	}

	@Override
	public boolean hasNext() {
		if (this.startingValue != 1){
			temp++;
			return true;
		}
		
		return false;
	}

	@Override
	public Integer next() {
		if(temp==1) return startingValue;
		Integer nextValue = 0;
		if (this.startingValue % 2 == 0)
			nextValue = this.startingValue / 2;
		else nextValue = 3*this.startingValue +1;
		this.startingValue = nextValue;
		return nextValue;
	}

}
