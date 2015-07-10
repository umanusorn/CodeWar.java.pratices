package test.com.umitems;

import com.umitems.Main;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import static org.junit.Assert.assertEquals;

public class MainTest {
  final String CLASS_NAME = new Object() {
  }.getClass().getName();

  @Rule
  public TestName name = new TestName();
  int input1, input2;
  int output;

  @Test
  public void testPositive1() {
    String testName = CLASS_NAME + "/" + name.getMethodName() + "\n";

    input1 = 1;
    input2 = 2;
    output = 3;

    assertEquals(testName + ConstTest.GIVE + input1 + "," + input2 + ConstTest.SHOULD_B + output, Main.plus(input1, input2), output);

  }

  @Test
  public void testPositive2() {
    String testName = CLASS_NAME + "/" + name.getMethodName() + "\n";

    input1 = 1111;
    input2 = 1234;
    output = 2345;

    assertEquals(testName + ConstTest.GIVE + input1 + "," + input2 + ConstTest.SHOULD_B + output, Main.plus(input1, input2), output);
  }

  @Test
  public void testNegative1() {
    String testName = CLASS_NAME + "/" + name.getMethodName() + "\n";

    input1 = -1;
    input2 = 1;
    output = 0;

    assertEquals(testName + ConstTest.GIVE + input1 + "," + input2 + ConstTest.SHOULD_B + output, Main.plus(input1, input2), output);
  }

  @Test
  public void testNegative2() {
    String testName = CLASS_NAME + "/" + name.getMethodName() + "\n";

    input1 = -1111;
    input2 = -1010;
    output = -2121;

    assertEquals(testName + ConstTest.GIVE + input1 + "," + input2 + ConstTest.SHOULD_B + output, Main.plus(input1, input2), output);
  }

} 
