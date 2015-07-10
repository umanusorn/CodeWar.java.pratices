package test.com.umitems;

import com.umitems.CollatzConjectureLength;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import static org.junit.Assert.assertEquals;

/**
 * Created by um2015 on 7/6/2015.
 */
public class CollatzConjectureLengthTest {
  final String CLASS_NAME = new Object() {
  }.getClass().getName();

  int input;
  int output;
  @Rule
  public TestName name = new TestName();
  @Test
  public void testWith1() {
    String testName = CLASS_NAME + "/" + name.getMethodName() + "\n";

    input =1;
    output=3;
    assertEquals(testName+ConstTest.GIVE+ input+ConstTest.SHOULD_B+output, output, CollatzConjectureLength.main(1));
    input =2;
    output=2;
    assertEquals(testName+ConstTest.GIVE+ input+ConstTest.SHOULD_B+output, output, CollatzConjectureLength.main(2));
    input =3;
    output=8;
    assertEquals(testName+ConstTest.GIVE+ input+ConstTest.SHOULD_B+output, output, CollatzConjectureLength.main(3));
    input =4;
    output=3;
    assertEquals(testName+ConstTest.GIVE+ input+ConstTest.SHOULD_B+output, output, CollatzConjectureLength.main(4));
    input =5;
    output=6;
    assertEquals(testName+ConstTest.GIVE+ input+ConstTest.SHOULD_B+output, output, CollatzConjectureLength.main(5));
  }



  @Test
  public void bigNumTest() {
    String testName = CLASS_NAME + "/" +name.getMethodName() + "\n the input is";
    long bigNumber = 0;
    long outputl;

    bigNumber = 123456789l;
    outputl =  conjecture(bigNumber);
    assertEquals(testName+ConstTest.GIVE+bigNumber+ConstTest.SHOULD_B+outputl, outputl, CollatzConjectureLength.main(bigNumber));
    bigNumber = 110101010101l;
    outputl =  conjecture(bigNumber);
    assertEquals(testName+ConstTest.GIVE+bigNumber+ConstTest.SHOULD_B+outputl, outputl, CollatzConjectureLength.main(bigNumber));
    bigNumber = 987654321123456789l;
    outputl =  conjecture(bigNumber);
    assertEquals(testName+ConstTest.GIVE+bigNumber+ConstTest.SHOULD_B+outputl, outputl, CollatzConjectureLength.main(bigNumber));
    bigNumber = 1000000000000000000l;
    outputl =  conjecture(bigNumber);
    assertEquals(testName+ConstTest.GIVE+bigNumber+ConstTest.SHOULD_B+outputl, outputl, CollatzConjectureLength.main(bigNumber));
    bigNumber = 1111111111111111111l;
    outputl =  conjecture(bigNumber);
    assertEquals(testName+ConstTest.GIVE+bigNumber+ConstTest.SHOULD_B+outputl, outputl, CollatzConjectureLength.main(bigNumber));

    /*bigNumber = Long.MAX_VALUE; error i think it's because of solution's code :P
    outputl =  conjecture(bigNumber);
    assertEquals(testName+ConstTest.GIVE+bigNumber+ConstTest.SHOULD_B+outputl, outputl, CollatzConjectureLength.main(bigNumber));*/

  }

  @Test
  public void randomTest(){
    String testName = CLASS_NAME + "/" + name.getMethodName()+ "\n";
    final long INIT_17DIGIT = 100000000000000000L;

    for(int i = 0; i < 20; i++) {
      long rand17Digit = (long) Math.floor(Math.random() * (INIT_17DIGIT));
      long outputl = conjecture(rand17Digit);
      assertEquals(testName+ConstTest.GIVE+rand17Digit+ConstTest.SHOULD_B+outputl,outputl, CollatzConjectureLength.main(rand17Digit)) ;
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
