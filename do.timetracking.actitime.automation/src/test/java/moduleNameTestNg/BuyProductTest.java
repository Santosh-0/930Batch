package moduleNameTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyProductTest {
	 @Test(groups = "smoke")
	    public void loginTest() {
	    	System.out.println("LOgged in");
	    }
	    
	    @Test(groups = "regreesion")
	    public void searchForProductTest() {
	    	System.out.println("searchforproduct");
	    	Assert.fail();
	    }
	    
	    @Test(groups = "smoke")
	    public void  addToproductToCartTest() {
	    	System.out.println("addtoProductToCart");
	    }

	    @Test(groups = "smoke")
		public void PaymentTest() {
			System.out.println("payment was successfull");	    
	    
		}
	    @Test(groups= "regression")
		public void logoutTest() {
			System.out.println("logout sucees");
}
}