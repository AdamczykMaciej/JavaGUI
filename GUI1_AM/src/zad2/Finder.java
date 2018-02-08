/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package zad2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Finder {
	private String fname;

	public Finder(String fname) {
		this.fname = fname;
	}

	public int getIfCount() {
		Scanner scan;						
		Pattern pattern = Pattern.compile("\\bif\\b");
		try {
			scan = new Scanner(new File(fname));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		int count = 0;
		while (scan.hasNextLine()) {
			String s = scan.nextLine().replaceAll("//.*",""); 
			s=s.replaceAll("\".*\"","");
			Matcher matcher = pattern.matcher(s);
			while (matcher.find())
				count++;

		}
		scan.close();
		return count;

	}

	public int getStringCount(String s1) {
		Scanner scan;
		Pattern pattern = Pattern.compile(s1);
		try {
			scan = new Scanner(new File(fname));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		int count = 0;
		while (scan.hasNextLine()) {
			String s = scan.nextLine();
			Matcher matcher = pattern.matcher(s);
			while(matcher.find())
				count++;

		}
		scan.close();
		return count;

	}

}
