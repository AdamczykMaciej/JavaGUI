import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
		PrintWriter pw= new PrintWriter("../Goods.txt", "UTF-8");
		int id=0;
		int weight=100;
		Random random= new Random();
		for (int i =0; i<11000;i++){
			weight=random.nextInt(2000);
			id++;
			
			pw.println(id + " " + weight);	
		}
		pw.close();
		
	}

}
