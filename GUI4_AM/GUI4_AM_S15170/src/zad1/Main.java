/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package zad1;


public class Main {
  public static void main(String[] args)
  {
    Singer s1 = new Singer("Carrey"){
      @Override
	String sing() {
		String text="oooooooooooo";
		return text;
	}
    };

    Singer s2 = new Singer("Houston"){
    	@Override
		String sing() {
			String text="a4iBBiii";
			return text;
		}
    };

    Singer s3 = new Singer("Madonna"){
      @Override
	String sing() {
		String text="aAa";
		return text;
	}
    };

    Singer sp[] = {s1, s2, s3};

    for (Singer s : sp)
      System.out.println(s);


    System.out.println("\n" + Singer.loudest(sp));
  }
}
