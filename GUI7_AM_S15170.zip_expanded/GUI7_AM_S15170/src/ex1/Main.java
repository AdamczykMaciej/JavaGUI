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

	public static void main(String[] args) {
		File file = new File("../Goods.txt");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.exists());
		Scanner scan;
		try {
			scan = new Scanner(file);
			Thread thread1 = new Thread(() -> {
				int count = 0;
				int numberOfObjects=0;
				while (scan.hasNext()) {
					String s = scan.next();
					String[] arr = s.split(" ");
					Good good = new Good(arr[0], Integer.parseInt(arr[1]));
					count++;
					if(count==200){
						numberOfObjects=count;
						count=0;
						System.out.println("created " + numberOfObjects + " objects");
					}
				}
			});
		}

		catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

	}
}
