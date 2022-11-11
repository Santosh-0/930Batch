package moduleNameTestNg;

import org.testng.annotations.Test;

public class ClassA {
	
	
	@Test(invocationCount =5)   // to  skip multiple times
	public void demo1() {
		System.out.println("From Demo1");
	}
	
	
	@Test(enabled = false)   //to skip the execution
	public void demo2() {
		System.out.println("From Demo2");
	}
	
	
	@Test(priority =3)  // to set priority
	public void demo3() {
		System.out.println("From Demo3");
	}
}
