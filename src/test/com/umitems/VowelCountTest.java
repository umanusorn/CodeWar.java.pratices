package test.com.umitems;

import com.umitems.VowelCount;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** 
* Main Tester. 
* 
* @author <Authors name> 
* @since <pre>Jul 4, 2015</pre> 
* @version 1.0 
*/ 
public class VowelCountTest {

 final String CLASS_NAME = new Object() {
  }.getClass().getName();
  String testString="";
@Test
public void mainTest ()  {
final String METHOD_NAME = new Object() {
    }.getClass().getEnclosingMethod().getName();
    String testName = CLASS_NAME + "/" + METHOD_NAME + "\n";

  testString =  "abracadabra";
	assertEquals(testName+testString, 5, VowelCount.main( testString ));

  testString =  "aeiou";
	assertEquals(testName+testString, 5, VowelCount.main( testString ));

   testString =  "aaa aaa";
	assertEquals(testName+testString, 6, VowelCount.main( testString ));

}

  @Test
  public void zeroVowelTest(){

    final String METHOD_NAME = new Object() {
    }.getClass().getEnclosingMethod().getName();
    String testName = CLASS_NAME + "/" + METHOD_NAME + "\n";

    testString =  "bbbbbbbbbb";
    assertEquals(testName+testString, 0, VowelCount.main( testString ));
    testString =  "";
    assertEquals(testName+testString, 0, VowelCount.main( testString ));
  }

} 
