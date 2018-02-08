/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package ex2;



public class Writer implements Runnable {
	private Author author;
	

	public Writer(Author author) {
		this.author = author;
	}

	@Override
	public void run() {
		while (true){
			
			try {
				
				System.out.println(author.getQueue().take());
				if(author.getFlag()==true) break;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
