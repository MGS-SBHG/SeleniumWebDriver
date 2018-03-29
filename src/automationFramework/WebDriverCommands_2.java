package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverCommands_2 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demoqa.com/frames-and-windows/");
		
		//click on a New Window button .//*[@id='ui-id-1']
		driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		
		driver.close();
	}
}
