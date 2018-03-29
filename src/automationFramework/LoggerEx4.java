package automationFramework;

import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LoggerEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	 BasicConfigurator.configure();
     Logger LoggerParent = LogManager.getLogger("LoggerParent");
	     try
	     {
	    	 // We will get a divide by zero exception 
	    	 int x = 200 / 0;
	    	 System.out.println("value of x is " + x);
	     }
	     catch(Exception exp)
	     {
	       LoggerParent.warn("Following exception was raised", exp);	 
	     } //LoggerEx4    
	}//main
	
}
