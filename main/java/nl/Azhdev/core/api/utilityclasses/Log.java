package nl.Azhdev.core.api.utilityclasses;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
	private static Logger logger = LogManager.getLogger("FML");
	private static String modId = "[ACORE]: ";
	
	public static void init(){
		logger.log(Level.INFO, modId + "Starting");
	}
	
	public static void addInfo(String info){
		logger.log(Level.INFO, modId + info);
	}
	
	public static void addError(String error){
		logger.log(Level.ERROR, modId + error);
	}
	
	public static void addWarning(String warn){
		logger.log(Level.WARN, modId + warn);
	}
}
