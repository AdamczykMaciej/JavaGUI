package ex2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Text {
	private static final BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
	private static String[] text;
	
	public static void setText(String[] txt){
		text=txt;
	
	}
	public synchronized void createText(){
		
		for (int i = 0; i < text.length; i++) {
			try {
				Thread.sleep(1000);
				queue.put(text[i]);
				
				
			} catch (InterruptedException e) {
				System.out.println("Exception");
			}
		}
	}
	public  synchronized void takeAndwriteText(){
		while (!queue.isEmpty()){
			try {
				
				System.out.println(queue.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
