/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package ex2;


public class Main {
  public static void main(String[] args) {
    Author autor = new Author(args);
    new Thread(autor).start();
    new Thread(new Writer(autor)).start();
  }
}
