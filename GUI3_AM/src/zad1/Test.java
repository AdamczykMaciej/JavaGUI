/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package zad1;


public class Test {

  public static void main(String[] args) {
    Patient[] patients = { 
      new SickForHead("John"),
      new SickForLeg("Ed"),
      new SickForDyspepsia("Mary")
    };

    for (Patient p : patients) {
      System.out.println(
        "Patient:  " + p.surname() + '\n' +
        "Sick for: " + p.disease() + '\n' + 
        "Used:     " + p.treatment() + "\n" 
      );
    }
  }
} 
