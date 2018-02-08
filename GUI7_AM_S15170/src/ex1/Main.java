/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package ex1;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Objects object = new Objects();
		ThreadA threadA = new ThreadA(object);
		ThreadB threadB = new ThreadB(object);
		threadA.start();
		
		threadB.start();
	}
}
