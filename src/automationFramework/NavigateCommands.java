package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateCommands {
	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();
 
		// Open ToolsQA web site
		String appUrl = "http://www.DemoQA.com";
		driver.get(appUrl);

		String title = driver.getTitle();
		System.out.println("Title of page is : " + title);

		
		// Click on Registration link
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
 
		Thread.sleep(10);

		// Go back to Home Page
		driver.navigate().back();
		String title1 = driver.getTitle();
		System.out.println("Title of page is : " + title1);

		
		Thread.sleep(10);

		// Go forward to Registration page
		driver.navigate().forward();
		String title2 = driver.getTitle();
		System.out.println("Title of page is : " + title2);
		
		Thread.sleep(10);

		// Go back to Home page
		driver.navigate().to(appUrl);
		String title4 = driver.getTitle();
		System.out.println("Title of page is : " + title4);

		Thread.sleep(10);

		// Refresh browser
		driver.navigate().refresh();
		String title5 = driver.getTitle();
		System.out.println("Title of page is : " + title5);

		Thread.sleep(10);

		// Close browser
		driver.close();
	}
}
