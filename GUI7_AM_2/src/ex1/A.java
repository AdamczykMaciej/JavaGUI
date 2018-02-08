package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A extends Thread {
	private Good good;
	private static int count = 0;
	private static int numberOfObjects = 0;

	public A(Good good) {
		this.good = good;
	}

	public static int getNumOfOb(){
		return A.numberOfObjects;
	}
	
	@Override
	public void run() {
		File file = new File("../Goods.txt");
		Scanner scan = null;
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("Exception");
		}

		while (scan.hasNextLine()){
			good.setGood(scan.nextLine());
		count++;
		if (count == 200 ){
			numberOfObjects += count;
		count = 0;
		System.out.println("created " + numberOfObjects + " objects");
		}
		}
	}
}
