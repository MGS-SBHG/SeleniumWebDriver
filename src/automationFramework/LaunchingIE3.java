package automationFramework;

import java.io.File;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;


	public class LaunchingIE3 {

		public static void main(String[] args) {

			String exePath = "//home//mgssbhg//IEDriverServer.exe";
			InternetExplorerDriverService.Builder serviceBuilder = new InternetExplorerDriverService.Builder();
			serviceBuilder.usingPort(5555); // This specifies that sever should start at this port
			serviceBuilder.usingDriverExecutable(new File(exePath)); //Tell it where you server exe is
			serviceBuilder.withHost("25.211.174.237");
			InternetExplorerDriverService service = serviceBuilder.build(); //Create a driver service and pass it to Internet explorer driver instance
			InternetExplorerDriver driver = new InternetExplorerDriver(service);
			driver.get("http://toolsqa.com");
		}

	}
	
