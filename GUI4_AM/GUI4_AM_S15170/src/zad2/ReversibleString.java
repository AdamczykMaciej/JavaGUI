package zad2;

public class ReversibleString implements Reversible {
	private String name;
	
	public ReversibleString(String name){
		this.name=name;
		
	}
	
	@Override
	public Reversible reverse() {
		String s="";
		for(int i=this.name.length();i>0;i--){
	s=s+this.name.charAt(i-1);
		}
		this.name=s;
		return this;
		
	}
	
	@Override
	public String toString(){
		String s=this.name;
		return s;
	}

}
