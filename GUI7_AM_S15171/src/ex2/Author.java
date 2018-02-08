/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package ex2;

public class Author implements Runnable {
	private String[] arr;
	private String txt;
	private boolean bool;

	public Author(String[] arr) {
		this.arr = arr;
	}

	public void setText(String s) {
		while (bool) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				System.out.println("Exception");
			}
			this.txt = s;
			bool = true;
			this.notify();
		}
	}
	synchronized public String getText() {
		 while (!bool) { // not if!!!
		 try {
		 wait(); // invoked on 'this'
		 } catch(InterruptedException exc) {}
		 }
		 bool = false;
		 notify();
		 return txt;
		 }
		 

	@Override
	public void run() {
		for (int i = 0; i < arr.length; i++) {
			try {
				// writing a new text takes some time...

				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
			this.setText(arr[i]);
		}
	}
}
