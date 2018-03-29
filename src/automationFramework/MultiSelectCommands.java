package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
 
public class MultiSelectCommands {
 
	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();
 
		// Put an Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
		// Launch the URL
		driver.get("http://toolsqa.com/automation-practice-form");
 
		// Step 3: Select 'Selenium Commands' Multiple select box ( Use Name locator to id  element )
		Select oSelect = new Select(driver.findElement(By.name("selenium_commands")));
		System.out.println("'Selenium Commands' selected");
		
		// Step 4: Select option 'Browser Commands'then de-select it (Use selectByIndex and deselectByIndex)
		oSelect.selectByIndex(0); 
		System.out.println(" 'Browser Commands' option Selected ");
		
		Thread.sleep(2000);
		
		oSelect.deselectByIndex(0);
		System.out.println(" 'Browser Commands' option de-Selected ");
		
		// Step 5: Select option 'Navigation Commands'  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
		oSelect.selectByVisibleText("Navigation Commands");
		System.out.println(" 'Navigation Commands' option Selected ");
		
		Thread.sleep(2000);

		oSelect.deselectByVisibleText("Navigation Commands");
		System.out.println(" 'Navigation Commands' option de-Selected ");
		
		// Step 6: Print and select all the options for the selected Multiple selection list.
		List<WebElement> oSize = oSelect.getOptions();
		int iListSize = oSize.size();
 
		System.out.println("Print and select all the options for the selected Multiple selection list:");
		// Setting up the loop to print all the options
		for(int i =0; i < iListSize ; i++){
			// Storing the value of the option	
			String sValue = oSelect.getOptions().get(i).getText();
 
			// Printing the stored value
			System.out.println(sValue);
 
			// Selecting all the elements one by one
			oSelect.selectByIndex(i);
			Thread.sleep(2000);
			}
 
		// Step 7: Deselect all
		oSelect.deselectAll();
		System.out.println("All objects Deselected");
		
		
		// Kill the browser
		driver.close();
		}
}