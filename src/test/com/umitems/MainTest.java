package test.com.umitems;

import com.umitems.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
  final String CLASS_NAME = new Object() {
  }.getClass().getName();

  int input1,input2;
  int output;
  final static String GIVE = "give";
  final static String SHOULD_B ="should be";

  @Test
  public void testPositive1() {
    final String METHOD_NAME = new Object() {
    }.getClass().getEnclosingMethod().getName();
    String testName = CLASS_NAME + "/" + METHOD_NAME + "\n";

    input1=1;
    input2=2;
    output=3;

    assertEquals(testName + GIVE+input1+","+input2+SHOULD_B+output, Main.plus(input1, input2), output);

  }

  @Test
  public void testPositive2(){
    final String METHOD_NAME = new Object() {
    }.getClass().getEnclosingMethod().getName();
    String testName = CLASS_NAME + "/" + METHOD_NAME + "\n";

    input1=1111;
    input2=1234;
    output=2345;

    assertEquals(testName + GIVE+input1+","+input2+SHOULD_B+output, Main.plus(input1, input2), output);
  }

  @Test
  public void testNegative1() {
    final String METHOD_NAME = new Object() {
    }.getClass().getEnclosingMethod().getName();
    String testName = CLASS_NAME + "/" + METHOD_NAME + "\n";

    input1=-1;
    input2=1;
    output=0;

    assertEquals(testName + GIVE+input1+","+input2+SHOULD_B+output, Main.plus(input1, input2), output);
  }

  @Test
  public void testNegative2() {
    final String METHOD_NAME = new Object() {
    }.getClass().getEnclosingMethod().getName();
    String testName = CLASS_NAME + "/" + METHOD_NAME + "\n";

    input1=-1111;
    input2=-1010;
    output=-2121;

    assertEquals(testName + GIVE+input1+","+input2+SHOULD_B+output, Main.plus(input1, input2), output);
  }

} 
