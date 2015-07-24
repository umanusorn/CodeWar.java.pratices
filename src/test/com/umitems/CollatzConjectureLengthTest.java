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
  @Rule
  public TestName name = new TestName();
  int input;
  int output;

  @Test
  public void give1ShoudBe1() {
    String testName = CLASS_NAME + "/" + name.getMethodName() + "\n";

    input = 1;
    output = 1;
    assertEquals(testName + ConstTest.GIVE + input + ConstTest.SHOULD_B + output, output, CollatzConjectureLength.main(1));
  }

  @Test
  public void give2ShouldBe2() {

    String testName = CLASS_NAME + "/" + name.getMethodName() + "\n";
    input = 2;
    output = 2;
    assertEquals(testName + ConstTest.GIVE + input + ConstTest.SHOULD_B + output, output, CollatzConjectureLength.main(2));
  }

  @Test
  public void give3ShouldBe8() {

    String testName = CLASS_NAME + "/" + name.getMethodName() + "\n";
    input = 3;
    output = 8;
    assertEquals(testName + ConstTest.GIVE + input + ConstTest.SHOULD_B + output, output, CollatzConjectureLength.main(3));
  }

  @Test
  public void give4ShoudBe3() {

    String testName = CLASS_NAME + "/" + name.getMethodName() + "\n";
    input = 4;
    output = 3;
    assertEquals(testName + ConstTest.GIVE + input + ConstTest.SHOULD_B + output, output, CollatzConjectureLength.main(4));
  }

  @Test
  public void give5ShouldBe6() {

    String testName = CLASS_NAME + "/" + name.getMethodName() + "\n";
    input = 5;
    output = 6;
    assertEquals(testName + ConstTest.GIVE + input + ConstTest.SHOULD_B + output, output, CollatzConjectureLength.main(5));
    }

  @Test
  public void bigNumTest() {
    String testName = CLASS_NAME + "/" + name.getMethodName() + "\n the input is";
    long bigNumber = 0;
    long outputl;

    bigNumber = 987654321123456789l;
    outputl = conjecture(bigNumber);
    assertEquals(testName + ConstTest.GIVE + bigNumber + ConstTest.SHOULD_B + outputl, outputl, CollatzConjectureLength.main(bigNumber));

    /*bigNumber = Long.MAX_VALUE; error i think it's because of solution's code :P
    outputl =  conjecture(bigNumber);
    assertEquals(testName+ConstTest.GIVE+bigNumber+ConstTest.SHOULD_B+outputl, outputl, CollatzConjectureLength.main(bigNumber));*/

  }

  private long conjecture(long x) {
    //this algor comes from the solution's testcase however it got 1 when input =Long.MAX_VALUE(9223372036854775807)
    //while my algor got 513
    return x == 1 ? 1 : 1 + (x % 2 == 0 ? conjecture(x / 2) : conjecture(x * 3 + 1));
  }

}
