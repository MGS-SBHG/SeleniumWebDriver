package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeTables {
	
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://toolsqa.com/automation-practice-table");
	
	//Store value from cell ‘Dubai’ in to string variable; print it on the console
	String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
	System.out.println(sCellValue);
	
	// Click on link of first row and last column
	driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();        
	System.out.println("Link has been clicked otherwise an exception would have thrown");
	driver.close();
 }//main

} //PracticeTables

