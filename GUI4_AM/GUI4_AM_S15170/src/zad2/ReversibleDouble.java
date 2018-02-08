package zad2;

public class ReversibleDouble implements Reversible {
	private double number;
	
	public ReversibleDouble(double number){
		this.number=number;
	}
	public double getNumber(){
		return this.number;
	}
	@Override
	public Reversible reverse() {
		this.number=1/number;
		return this;
		
	}
	
	@Override
	public String toString(){
		String s=""+this.number;
		return s;
	}

}
