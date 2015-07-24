package test.com.umitems;
import com.umitems.TenMinWalk;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import static org.junit.Assert.assertEquals;
/**
 * Created by um2015 on 7/24/2015.
 * Problem source http://www.codewars.com/kata/take-a-ten-minute-walk/java
 */
public class TenMinWalkTest {

  final String CLASS_NAME = new Object() {
  }.getClass().getName();
  @Rule
  public TestName name = new TestName();

    @Test
    public void Test() {
      String testName = CLASS_NAME + "/" + name.getMethodName() + "\n";
      assertEquals("Should return true", true, TenMinWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
      assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
      assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'w'}));
      assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }

  @Test
  public void give1DirectionShouldBeFalse(){
    String testName = CLASS_NAME + "/" + name.getMethodName() + "\n";
    assertEquals(testName,false,TenMinWalk.isValid(new char[]{'w'}));
  }

  @Test
  public void give11DirectionShouldBeFalse(){
    String testName = CLASS_NAME + "/" + name.getMethodName() + "\n";
    assertEquals(testName,false,TenMinWalk.isValid(new char[]{'n','n','n','n','e','w','s','n','e','s','s'}));
  }

  @Test
  public void giveNNNNNSSSSS_ShouldBeTrue(){
    String testName = CLASS_NAME + "/" + name.getMethodName() + "\n";
    assertEquals(testName,true,TenMinWalk.isValid(new char[]{'n','n','n','n','n','s','s','s','s','s'}));
  }


  @Test
  public void giveEWEWEWEWEW_ShouldBeTrue(){
    String testName = CLASS_NAME + "/" + name.getMethodName() + "\n";
    assertEquals(testName,true,TenMinWalk.isValid(new char[]{'e','w','e','w','e','w','e','w','e','w'}));
  }


  @Test
  public void giveNEWSNEWSWE_ShouldBeTrue(){
    String testName = CLASS_NAME + "/" + name.getMethodName() + "\n";
    assertEquals(testName,true,TenMinWalk.isValid(new char[]{'n','e','w','s','n','e','w','s','w','e'}));
  }


  @Test
  public void giveNNNNSSSSSS_ShouldBeFalse(){
    String testName = CLASS_NAME + "/" + name.getMethodName() + "\n";
  assertEquals(testName,false,TenMinWalk.isValid(new char[]{'n','n','n','n','s','s','s','s','s','s'}));
  }
}
