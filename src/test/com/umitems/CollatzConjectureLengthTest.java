package test.com.umitems;

import com.umitems.CollatzConjectureLength;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by um2015 on 7/6/2015.
 */
public class CollatzConjectureLengthTest {
  final String CLASS_NAME = new Object() {
  }.getClass().getName();

  @Test
  public void mainTest() {

    final String METHOD_NAME = new Object() {
    }.getClass().getEnclosingMethod().getName();
    String testName = CLASS_NAME + "/" + METHOD_NAME + "\n";

    assertEquals(testName + "when enter 1 it should be 1", CollatzConjectureLength.main(1), 1);
    assertEquals(testName + "when enter 2 it should be 2", CollatzConjectureLength.main(2), 2);
    assertEquals(testName + "when enter 3 it should be 8", CollatzConjectureLength.main(3), 8);
    assertEquals(testName + "when enter 4 it should be 3", CollatzConjectureLength.main(4), 3);
    assertEquals(testName + "when enter 5 it should be 6", CollatzConjectureLength.main(5), 6);
  }



  @Test
  public void bigNumTest() {

    final String METHOD_NAME = new Object() {
    }.getClass().getEnclosingMethod().getName();
    String testName = CLASS_NAME + "/" + METHOD_NAME + "\n";
    long bigNumber = 0;

    bigNumber = 123456789l;
    assertEquals(testName+bigNumber, CollatzConjectureLength.main(bigNumber), conjecture(bigNumber));
    //bigNumber = Long.MAX_VALUE; error
    //assertEquals(testName+bigNumber, CollatzConjectureLength.main(bigNumber), conjecture(bigNumber));
    bigNumber = 110101010101l;
    assertEquals(testName+bigNumber, CollatzConjectureLength.main(bigNumber), conjecture(bigNumber));
    bigNumber = 987654321123456789l;
    assertEquals(testName+bigNumber, CollatzConjectureLength.main(bigNumber), conjecture(bigNumber));
    bigNumber = 1000000000000000000l;
    assertEquals(testName+bigNumber, CollatzConjectureLength.main(bigNumber), conjecture(bigNumber));
    bigNumber = 1111111111111111111l;
    assertEquals(testName+bigNumber, CollatzConjectureLength.main(bigNumber), conjecture(bigNumber));

  }
  private long conjecture(long x) {
    //this algor comes from the solution's testcase however it got 1 when input =Long.MAX_VALUE(9223372036854775807)
    //while my algor got 513

    return x == 1 ? 1 : 1 + (x % 2 == 0 ? conjecture(x / 2) : conjecture(x * 3 + 1));
  }

}
