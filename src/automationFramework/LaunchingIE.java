package automationFramework;

import org.openqa.selenium.ie.InternetExplorerDriver;


	public class LaunchingIE {

		public static void main(String[] args) {
	        //Path to the folder where you have extracted the IEDriverServer executable
			//String service = "//home//mgssbhg//IEDriverServer.exe";
			
			// System.setProperty is used to set a webdriver.ie.driver property to the path of IE driver server executable. 
			//System.setProperty("webdriver.ie.driver", service);
			
			InternetExplorerDriver  driver = new InternetExplorerDriver();

			driver.get("http://yahoo.com");
		}

	}
	
