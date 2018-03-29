package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeTable_2 {
	
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://toolsqa.com/automation-practice-table");
	
	String sRow = "1";
	String sCol = "2";

	//Get the value from cell ‘Dubai’ with using dynamic xpath by passing variables in the xpath
	// .//*[@id='content']/table/tbody/tr[1]/td[2]
	String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + sRow + "]/td[" + sCol + "]")).getText();
	System.out.println(sCellValue);

	
	//Print all the column values of row ‘Clock Tower Hotel’
	
	String sRowValue = "Financial Center";
	
	//String sRowValue = "Clock Tower Hotel";	
	
	//String sRowValue = "Taipei 101";
	
	//String sRowValue = "Burj Khalifa";
	
		//First loop will find the 'ClOCK TWER HOTEL' in the first column
		for (int i=1;i<=5;i++){
		String sValue = null;
		sValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/th")).getText();
		
		// If the sValue matches token sRowValue
		if(sValue.equalsIgnoreCase(sRowValue)){
			// inner loop to iterate all the columns of 'i' row 
			for (int j=1;j<=5;j++){
				String sColumnValue= driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/td["+ j +"]")).getText();
				System.out.println(sColumnValue);
				}
			break;
			}
		}
	driver.close();
  } //main
} //PracticeTable_2