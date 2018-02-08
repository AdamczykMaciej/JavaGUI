/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package ex2;

public class Writer implements Runnable {
	private Author author;
	private boolean bool;
	private String arr;

	public Writer(Author author) {
		this.author = author;
	}

	@Override
	public void run() {
		String txt = null;
		while ((txt = author.getText()) != null) {
			System.out.println("-> " + txt);

		}
	}
}
