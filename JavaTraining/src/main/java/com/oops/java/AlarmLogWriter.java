package com.oops.java;

import org.apache.log4j.*;
import org.apache.log4j.varia.LevelRangeFilter;

public class AlarmLogWriter {

	public static void main(String[] args) {
		
		PatternLayout layout = new PatternLayout();
		String ConversionPattern="%d{dd MMM yyyy HH:mm:ss} %C{1}:%t  %x %-5p :%m%n";
		layout.setConversionPattern(ConversionPattern);
		
		LevelRangeFilter filter=new LevelRangeFilter();
		filter.setLevelMax(Level.DEBUG);
		filter.setLevelMin(Level.DEBUG);
		
		ConsoleAppender consoleAppender = new ConsoleAppender();
		consoleAppender.setLayout(layout);
		consoleAppender.addFilter(filter);
		consoleAppender.activateOptions();
		
		Logger logger=Logger.getLogger(AlarmLogWriter.class);
		//Logger logger=Logger.getRootLogger();
		logger.setLevel(Level.DEBUG);	
		logger.addAppender(consoleAppender);
		logger.debug("This is my first log4j log");
		logger.info("This is my first log4j log");
		logger.warn("This is my first log4j log");
	}
}
