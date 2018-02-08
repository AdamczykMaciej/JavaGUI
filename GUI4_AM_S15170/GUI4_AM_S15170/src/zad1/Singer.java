/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package zad1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Singer {
	private String surname;
	private static int count=0;
	private int startnumber;
	
	public Singer(String surname){
		this.surname=surname;
		startnumber=++count;
	}
	
	abstract String sing();
	
	@Override
	public String toString(){
		String s="("+this.startnumber+") "+this.surname+": "+ this.sing();
		return s;
		
	}
	static Singer loudest(Singer[] arr) {
		
		Pattern pattern=Pattern.compile("[A-Z]");
		Matcher matcher;
		int occ=0, mxocc=0, iloudest=0;
		for(int i=0;i<arr.length;i++){
			occ=0;
			matcher= pattern.matcher(arr[i].sing());
			while(matcher.find()) occ++;
			if(occ>mxocc) {
				mxocc=occ;	
				iloudest=i;
			}
		}
		return arr[iloudest];
		
	}
	
}
