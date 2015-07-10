package test.com.umitems;

import com.umitems.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by um2015 on 7/6/2015.
 */
public class ConstTest {
  final String CLASS_NAME = new Object() {
  }.getClass().getName();

  int input1,input2;
  int output;
  public final static String GIVE = " give ";
  public final static String SHOULD_B =" should be ";

  @Test
  public void mainTest() {

    final String METHOD_NAME = new Object() {
    }.getClass().getEnclosingMethod().getName();
    String testName = CLASS_NAME + "/" + METHOD_NAME + "\n";

    input1=1;
    input2=2;
    output=3;

    assertEquals(testName + GIVE +input1+","+input2+SHOULD_B+output, Main.plus(input1, input2), output);

  }

}
