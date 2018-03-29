package automationFramework;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LoggerEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	 BasicConfigurator.configure();
     Logger LoggerParent = LogManager.getLogger("LoggerParent");
     Logger LoggerChild = LogManager.getLogger("LoggerParent.Child");
     //Setting up the log level of both loggers
      LoggerParent.setLevel(Level.WARN);      
     LoggerParent.trace("This is the trace log - PARENT");
     LoggerParent.debug("This is debug log - PARENT");
     LoggerParent.info("This is info log - PARENT");
     LoggerParent.warn("This is Warn log - PARENT");
     LoggerParent.error("This is error log - PARENT");
     LoggerParent.fatal("This is Fatal log - PARENT");
     LoggerChild.trace("This is the trace log - CHILD");
     LoggerChild.debug("This is debug log - CHILD");
     LoggerChild.info("This is info log - CHILD");
     LoggerChild.warn("This is Warn log - CHILD");
     LoggerChild.error("This is error log - CHILD");
     LoggerChild.fatal("This is Fatal log - CHILD"); 
     
	}
	
}
