/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package zad1;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String fname = System.getProperty("user.home") + "/tab.txt";
		ArrayList<Integer> list = new ArrayList<>();

		File file = new File(fname);
		Scanner scan;
		int mx = 0;
		String mxi = "";
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("***");
			return;
		}
		while (scan.hasNextLine()) {
			String s = scan.nextLine();
			String[] arr = s.split(" ");
			for (int i = 0; i < arr.length; i++) {
				try {
					list.add(Integer.parseInt(arr[i]));
				} catch (NumberFormatException e) {
					System.out.println("***");
					System.exit(0);
				}
			}
			for (int i = 0; i < list.size(); i++) {
				if (i == 0)
					mx = list.get(i);
				else {
					if (list.get(i) > mx)
						mx = list.get(i);

				}

			}

		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == mx)
				mxi = mxi + " " + i;
		}

		for (int i = 0; i < list.size(); i++)
		System.out.print(list.get(i) + " ");
		System.out.println();
		System.out.println(mx);
		System.out.println(mxi.replaceAll("^ ", ""));

	}
}