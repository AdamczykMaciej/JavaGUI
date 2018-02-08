package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Objects {
	private int count2 = 0;
	private int countGoods = 0;
	private int countCreated = 0;
	private int sumOfWeights = 0;
	private int numberOfGoods = 0;
	private int numberOfObjects = 0;

	public synchronized void counter() {
		File file = new File("../Goods.txt");
		Scanner scan2 = null;

		try {
			scan2 = new Scanner(file);
		} catch (FileNotFoundException e1) {
			System.out.println("Exception");
		}

		while (scan2.hasNextLine()) {

			String s = scan2.nextLine();
			String[] arr = new String[2];
			arr = s.split(" ");
			sumOfWeights += Integer.parseInt(arr[1]);
			countGoods++;
			count2++;

			if (countGoods == 100) {
				numberOfGoods += countGoods;
				countGoods = 0;
				System.out.println("counted the weight of " + numberOfGoods + " goods");

			}

			while (count2 == 200) {
				notify();
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				count2 = 0;
			}

		}
		System.out.println(sumOfWeights);
		scan2.close();
	}

	public synchronized void createObjects() {
		File file = new File("../Goods.txt");
		Scanner scan = null;
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("Exception");
		}

		while (scan.hasNextLine()) {

			String s = scan.nextLine();
			String[] arr = new String[2];
			arr = s.split(" ");
			Good good = new Good(arr[0], Integer.parseInt(arr[1]));
			countCreated++;

			while (countCreated == 200) {
				notify();
				try {
					numberOfObjects += countCreated;
					System.out.println("created " + numberOfObjects + " objects");
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				countCreated = 0;

			}
		}
		notify();
		scan.close();

	}

}
