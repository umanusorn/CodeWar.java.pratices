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
  String input ="";
  int output;

@Test
public void mainTest ()  {
final String METHOD_NAME = new Object() {
    }.getClass().getEnclosingMethod().getName();
    String testName = CLASS_NAME + "/" + METHOD_NAME + "\n";

  input =  "abracadabra";
  output = 5;
	assertEquals(testName+ ConstTest.GIVE+ input+ ConstTest.SHOULD_B+output, output, VowelCount.main(input));

  input =  "aeiou";
  output = 5;
  assertEquals(testName+ ConstTest.GIVE+ input+ ConstTest.SHOULD_B+output, output, VowelCount.main(input));

   input =  "aaa aaa";
  output = 6;
  assertEquals(testName+ ConstTest.GIVE+ input+ ConstTest.SHOULD_B+output, output, VowelCount.main(input));

}

  @Test
  public void zeroVowelTest(){

    final String METHOD_NAME = new Object() {
    }.getClass().getEnclosingMethod().getName();
    String testName = CLASS_NAME + "/" + METHOD_NAME + "\n";

    input =  "bbbbbbbbbb";
    output = 0;
    assertEquals(testName+ ConstTest.GIVE+ input+ ConstTest.SHOULD_B+output, output, VowelCount.main(input));
    input =  "";
    output = 0;
    assertEquals(testName+ ConstTest.GIVE+ input+ ConstTest.SHOULD_B+output, output, VowelCount.main(input));
  }

} 
