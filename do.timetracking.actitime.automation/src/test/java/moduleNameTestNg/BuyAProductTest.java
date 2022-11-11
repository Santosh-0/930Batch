package moduleNameTestNg;


import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyAProductTest {
	

    @Test(priority =1)
    public void loginTest() {
    	System.out.println("LOgged in");
    }
    
    @Test(priority = 2)
    public void searchForProductTest() {
    	System.out.println("searchforproduct");
    	Assert.fail();
    }
    
    @Test(dependsOnMethods = "searchForProduct")
    public void  addToproductToCartTest() {
    	System.out.println("addtoProductToCart");
    }
	@Test(dependsOnMethods = "addtoProductToCart")
	public void PaymentTest() {
		System.out.println("payment was successfull");
	}
	@Test(priority = 3)
	public void logoutTest() {
		System.out.println("logout sucees");
	}
}
