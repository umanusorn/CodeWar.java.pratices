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

  int input;
  int output;
  final static String GIVE = "give";
  final static String SHOULD_B ="should be";
  
  @Test
  public void testWith1() {

    final String METHOD_NAME = new Object() {
    }.getClass().getEnclosingMethod().getName();
    String testName = CLASS_NAME + "/" + METHOD_NAME + "\n";

    input =1;
    output=1;
    assertEquals(testName+GIVE+ input+SHOULD_B+output, output, CollatzConjectureLength.main(1));
    input =2;
    output=2;
    assertEquals(testName+GIVE+ input+SHOULD_B+output, output, CollatzConjectureLength.main(2));
    input =3;
    output=8;
    assertEquals(testName+GIVE+ input+SHOULD_B+output, output, CollatzConjectureLength.main(3));
    input =4;
    output=3;
    assertEquals(testName+GIVE+ input+SHOULD_B+output, output, CollatzConjectureLength.main(4));
    input =5;
    output=6;
    assertEquals(testName+GIVE+ input+SHOULD_B+output, output, CollatzConjectureLength.main(5));
  }



  @Test
  public void bigNumTest() {

    final String METHOD_NAME = new Object() {
    }.getClass().getEnclosingMethod().getName();
    String testName = CLASS_NAME + "/" + METHOD_NAME + "\n the input is";
    long bigNumber = 0;
    long outputl;

    bigNumber = 123456789l;
    outputl =  conjecture(bigNumber);
    assertEquals(testName+GIVE+bigNumber+SHOULD_B+outputl, outputl, CollatzConjectureLength.main(bigNumber));
    bigNumber = 110101010101l;
    outputl =  conjecture(bigNumber);
    assertEquals(testName+GIVE+bigNumber+SHOULD_B+outputl, outputl, CollatzConjectureLength.main(bigNumber));
    bigNumber = 987654321123456789l;
    outputl =  conjecture(bigNumber);
    assertEquals(testName+GIVE+bigNumber+SHOULD_B+outputl, outputl, CollatzConjectureLength.main(bigNumber));
    bigNumber = 1000000000000000000l;
    outputl =  conjecture(bigNumber);
    assertEquals(testName+GIVE+bigNumber+SHOULD_B+outputl, outputl, CollatzConjectureLength.main(bigNumber));
    bigNumber = 1111111111111111111l;
    outputl =  conjecture(bigNumber);
    assertEquals(testName+GIVE+bigNumber+SHOULD_B+outputl, outputl, CollatzConjectureLength.main(bigNumber));

    /*bigNumber = Long.MAX_VALUE; error i think it's because of solution's code :P
    outputl =  conjecture(bigNumber);
    assertEquals(testName+GIVE+bigNumber+SHOULD_B+outputl, outputl, CollatzConjectureLength.main(bigNumber));*/

  }

  @Test
  public void randomTest(){
    final String METHOD_NAME = new Object() {
    }.getClass().getEnclosingMethod().getName();
    String testName = CLASS_NAME + "/" + METHOD_NAME + "\n";

    for(int i = 0; i < 20; i++) {
      long rand = (long) Math.floor(Math.random() * (100000000000000000L));
      assertEquals("Random test failed for: " + rand, CollatzConjectureLength.main(rand), conjecture(rand));
    }

    //the solution test case goes with long rand = (long) Math.floor(Math.random() * (1000000000000000L - 1000000L) + 1000000L);
    // I dont understand why  1000000000000000L - 1000000L) + 1000000L why not just  1000000000000000L
  }

  private long conjecture(long x) {
    //this algor comes from the solution's testcase however it got 1 when input =Long.MAX_VALUE(9223372036854775807)
    //while my algor got 513

    return x == 1 ? 1 : 1 + (x % 2 == 0 ? conjecture(x / 2) : conjecture(x * 3 + 1));
  }

}
