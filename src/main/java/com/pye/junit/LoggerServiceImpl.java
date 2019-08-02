package com.pye.junit;


public class LoggerServiceImpl implements LoggerService{
	
	public LoggerWrapper getLoggerWrapper() {
		return new LoggerWrapper("Just loggerWrapper");	
	}

}
