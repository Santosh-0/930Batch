package moduleNameTestNg;
import org.testng.annotations.Test;

public class SoftAssert {
     
	@Test 
	public void demo() {
		String expectedResult ="abc";
		String actualResult ="ewf";
		org.testng.asserts.SoftAssert soft = new org.testng.asserts.SoftAssert();
	
		soft.assertEquals(actualResult, expectedResult);
		//soft.assertAll();
		
		System.out.println("pass");
		}
	
}
