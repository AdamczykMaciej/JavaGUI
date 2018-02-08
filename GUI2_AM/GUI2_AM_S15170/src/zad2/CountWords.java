/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package zad2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;

public class CountWords {
	private String fname;

	public CountWords(String fname) {
		this.fname = fname;
	}

	public ArrayList getResult() {
		ArrayList<String> list = new ArrayList<>();
		Map<String, Integer> map = new LinkedHashMap<>();
		Scanner scan;
		try {
			scan = new Scanner(new File(fname));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error");
			return list;
		}
		while (scan.hasNextLine()) {
			String[] arr = scan.nextLine().replaceAll("[^a-zA-Z ]","").split(" ");
			for (int i = 0; i < arr.length; i++) {
				
				if (map.containsKey(arr[i]))
					map.put(arr[i], map.get(arr[i])+1);
				else
					map.put(arr[i], 1);
			}

		}
		for(Map.Entry<String, Integer> entry :map.entrySet()){
			list.add(entry.getKey()+ " "+ entry.getValue());
		}
		return list;

	}
}
