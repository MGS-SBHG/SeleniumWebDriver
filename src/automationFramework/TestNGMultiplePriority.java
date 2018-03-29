package automationFramework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestNGMultiplePriority {
	public WebDriver driver;
	 
	//TestNG will execute the @Test annotation with the lowest priority value 0 up to the largest 3.
	  @Test(priority = 0)	 
	  public void One() {	 
	      System.out.println("This is the Test Case number One");	 
	  }
	 
	  @Test(priority = 1)	 
	  public void Two() {	 
		  System.out.println("This is the Test Case number Two");	 
	  }
	 
	  @Test(priority = 2)	 
	  public void Three() {	 
		  System.out.println("This is the Test Case number Three");	 
	  }
	 
	  @Test(priority = 3)	 
	  public void Four() {	 
		  System.out.println("This is the Test Case number Four");	 
	  }
}
