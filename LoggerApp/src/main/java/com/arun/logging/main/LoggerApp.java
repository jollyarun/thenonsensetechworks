package com.arun.logging.main;

import org.apache.log4j.Logger;



public class LoggerApp {

	public static Logger logger = Logger.getLogger(LoggerApp.class);
	public static Logger testLogger = Logger.getLogger("testlogger");
	
	
	public void tryTraceLogs() {
		
		logger.trace("Trace Logs");
	}
	
	public void tryDebugLogs() {
		
		logger.debug("Debug Logs");
	}
	
	public void tryInfoLogs() {
		
		logger.info("Info Logs");
	}
	
	public void tryErrorLogs() {
		
		logger.error("Error Logs");
	}
	
	public void tryFatalLogs() {
		
		logger.fatal("Fatal Logs");
	}
	
	public void tryTestCategory() {
		
		testLogger.debug("test logs");
	}
	
	public static void main(String[] args) {
		
		LoggerApp loggerApp = new LoggerApp();
		
		loggerApp.tryTraceLogs();
		loggerApp.tryDebugLogs();
		loggerApp.tryInfoLogs();
		loggerApp.tryErrorLogs();
		loggerApp.tryFatalLogs();
		
		loggerApp.tryTestCategory();
	}
}
