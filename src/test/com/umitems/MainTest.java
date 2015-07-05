package test.com.umitems;

import com.umitems.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Main Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jul 4, 2015</pre>
 */
public class MainTest {

  final String CLASS_NAME = new Object() {
  }.getClass().getName();


  @Test
  public void testPositive() {

    final String METHOD_NAME = new Object() {
    }.getClass().getEnclosingMethod().getName();
    String testName = CLASS_NAME + "/" + METHOD_NAME + "\n";

    assertEquals(testName + "1+2=3", Main.plus(1, 2), 3);
    assertEquals(testName + "2+3=5", Main.plus(2, 3), 5);
    assertEquals(testName + "1+3=4", Main.plus(1, 3), 4);

  }

  @Test
  public void testNegative() {
    final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
    assertEquals("ddd", Main.plus(1, -2), -1);
    assertEquals("ddd", Main.plus(-1, -2), -3);

    //VowelCountTest.mainTest ();
  }

  @Before
  public void before() throws Exception {
  }

  @After
  public void after() throws Exception {
  }

} 
