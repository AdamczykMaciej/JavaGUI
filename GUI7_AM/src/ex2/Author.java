/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package ex2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Author implements Runnable {
	private String[] text;
	private final BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
	private boolean flag;
	
	public Author(String[] arr){
		this.text=arr;
	}
	
	public BlockingQueue<String> getQueue(){
		return this.queue;
	}
	public boolean getFlag(){
		return this.flag;
	}
	
	
	@Override
	public void run() {
		for (int i = 0; i < text.length; i++) {
			try {
				Thread.sleep(1000);
				queue.put(text[i]);
				
				
			} catch (InterruptedException e) {
				System.out.println("Exception");
			}
			if(i==text.length-1) flag=true;
		}
	}
}
