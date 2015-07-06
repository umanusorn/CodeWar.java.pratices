package test.com.umitems;

import com.umitems.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by um2015 on 7/6/2015.
 */
public class TemplateTest {
  final String CLASS_NAME = new Object() {
  }.getClass().getName();

  @Test
  public void mainTest() {

    final String METHOD_NAME = new Object() {
    }.getClass().getEnclosingMethod().getName();
    String testName = CLASS_NAME + "/" + METHOD_NAME + "\n";

    assertEquals(testName + "1+2=3", Main.plus(1,2), 3);

  }

}
