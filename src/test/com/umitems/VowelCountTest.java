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

@Test
public void mainTest ()  {
//TODO: Test goes here...
final String METHOD_NAME = new Object() {
    }.getClass().getEnclosingMethod().getName();
    String testName = CLASS_NAME + "/" + METHOD_NAME + "\n";

  String testString =  "abracadabra";
	assertEquals(testName+testString, 5, VowelCount.main( testString ));

} 


} 
