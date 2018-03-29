package automationFramework;

import org.openqa.selenium.WebDriver; // References WebDriver interface reqd to instantiate new web browser.
import org.openqa.selenium.firefox.FirefoxDriver; //References FirefoxDriver class reqd instantiate a Firefox specific driver on browser instance instantiated using WebDriver interface.

public class FirstTestCase {
 
	public static void main(String[] args) throws InterruptedException {
		
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		
        //Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");
				
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
 
		String Title = driver.getTitle();
		System.out.println( "website title " + Title);

		String CurrentUrl = driver.getCurrentUrl();	
		System.out.println( "website CurrentUrl " + CurrentUrl);

		String PageSource = driver.getPageSource();
		System.out.println( "Source Code of the page " + PageSource);

		
		//Wait for 5 Secs
		Thread.sleep(5);
		
        
		// Close only the current window the WebDriver is currently controlling.
		//driver.close();
		
		// Closes all windows opened by the WebDriver. 
        driver.quit();
    }
}