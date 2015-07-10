package test.com.umitems;

import com.umitems.Main;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import static org.junit.Assert.assertEquals;

/**
 * Created by um2015 on 7/6/2015.
 */
public class ConstTest {
  public final static String GIVE = " give ";
  public final static String SHOULD_B = " should be ";
  final String CLASS_NAME = new Object() {
  }.getClass().getName();
  @Rule
  public TestName name = new TestName();
  int input1, input2;
  int output;

  @Test
  public void mainTest() {
    String testName = CLASS_NAME + "/" + name.getMethodName() + "\n";

    input1 = 1;
    input2 = 2;
    output = 3;

    assertEquals(testName + GIVE + input1 + "," + input2 + SHOULD_B + output, Main.plus(input1, input2), output);

  }

}
