package automationFramework;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LogMgr3 {
	public static void main(String[] args) {
		// LogManager lets us retrieve an existing logger object by name. 
		// try to create a logger object with the same name 
		// as an existing logger object, it will pass on the 
		// reference of the existing logger object instead of creating one. 	
		
		Logger logger1 = LogManager.getLogger("Logger1");
		Logger logger2 = LogManager.getLogger("Logger2");
		Logger logger3 = LogManager.getLogger("Logger3");
		BasicConfigurator.configure();
		logger1.info("This is logger 1");
		logger2.info("This is logger 2");
		logger3.info("This is logger 3");	
 
		
		Logger logger1_2 = LogManager.getLogger("Logger1");
		Logger logger1_3 = LogManager.getLogger("Logger1");
		
		//You will see that LogManager doesnt create a new instance of logger
		//Object with name Logger1, instead passes on the reference to the 
		//existing Logger1 object. We can confirm this with following lines
		logger1_2.info("The name of this logger is " + logger1_2.getName());
 
        if(logger1_3.equals(logger1))
        {
        	logger1_3.info("Both objects are same");
        }
        else
        {
        	logger1_3.info("Logger1 and logger1_2 are different objects");
        }
 
	}
}
