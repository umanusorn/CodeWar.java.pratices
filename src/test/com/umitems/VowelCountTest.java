package test.com.umitems;

import com.umitems.VowelCount;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

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
  @Rule
  public TestName name = new TestName();

  @Test
public void mainTest ()  {

    String testName = CLASS_NAME + "/" + name.getMethodName() + "\n";

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
    String testName = CLASS_NAME + "/" + name.getMethodName() + "\n";

    input =  "bbbbbbbbbb";
    output = 0;
    assertEquals(testName+ ConstTest.GIVE+ input+ ConstTest.SHOULD_B+output, output, VowelCount.main(input));
    input =  "";
    output = 0;
    assertEquals(testName+ ConstTest.GIVE+ input+ ConstTest.SHOULD_B+output, output, VowelCount.main(input));
  }

} 
