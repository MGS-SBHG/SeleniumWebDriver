package automationFramework;

/*
import java.util.Enumeration;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;

import org.apache.log4j.ConsoleAppender;
 
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;  
 
import org.apache.log4j.Layout;

//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;

import org.apache.log4j.PatternLayout;


public class LogManagerSample {
	
	//mainLogger: logger object got from LogManager.  
    //All loggers use this method. 
    //We can consider LogManager as a factory to create Logger objects
	// created a logger named mainLogger using the LogManager static class. 
	// use it to write logs.
	
	static Logger mainLogger = LogManagerSample.getLogger(LogManagerSample.class.getName());

public static void main(String[] args) {

	 // mainLogger.info(“Comments that you want to log”) statement which logs the string.
			BasicConfigurator.configure();
	
	//Create a console appender and attach it to our mainLogger
			ConsoleAppender appender = new ConsoleAppender();
			mainLogger.addAppender(appender);
			mainLogger.info("This is just a logger");		
	
			appender.activateOptions();
			PatternLayout layoutHelper = new PatternLayout();
			layoutHelper.setConversionPattern("%-5p [%t]: %m%n");
			layoutHelper.activateOptions();
	        mainLogger.getAppender("ConsoleAppender").setLayout(layoutHelper);	
			appender.setLayout(layoutHelper);
			
		//	mainLogger.addAppender(appender);
			//Create a console appender and attach it to our mainLogger
		//	mainLogger.info("Pattern 1 is displayed like this");
		//	layoutHelper.setConversionPattern("%C %m%n");
		//	mainLogger.info("Pattern 2 is displayed like this");
	 			
		}		
}

*/
