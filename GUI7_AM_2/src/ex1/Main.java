/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	 public static void main(String[] args) throws InterruptedException {
		 Good good = new Good();
		Thread threadA = new A(good);
		Thread threadB = new B(good);
		threadA.start();
		threadB.start();
		Thread.sleep(1300);
		System.out.println(B.getWeight());
		

	}
}
