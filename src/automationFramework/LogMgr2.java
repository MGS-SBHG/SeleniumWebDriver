package automationFramework;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LogMgr2 {
	public static void main(String[] args) {
		// retrieve all the logger objects inside LogManager at a particular instance 
		// by using the getCurrentLoggers() method.
 
		Logger logger1 = LogManager.getLogger("Logger1");
		Logger logger2 = LogManager.getLogger("Logger2");
		Logger logger3 = LogManager.getLogger("Logger3");
		BasicConfigurator.configure();
		logger1.info("This is logger 1");
		logger2.info("This is logger 2");
		logger3.info("This is logger 3");	
 
	//	Enumeration loggers = LogManager.getCurrentLoggers();
	//	while(loggers.hasMoreElements())
		{
	//		logger3.info("Logger name is " + loggers.nextElement().getName());			
		}
	}
}
