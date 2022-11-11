package moduleNameTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
 

public class ClassC {
	
	    @Parameters("broswer")
     	@Test
	    public void demo(String broswer) 
	   {
    	if (broswer.equals("chrome")) 
    	{
		WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.google.com/");
    }
	if (broswer.equals("firefox"))
	{
		WebDriverManager.chromedriver().setup();
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.google.com/");

    
     }    
    
	 }
}
