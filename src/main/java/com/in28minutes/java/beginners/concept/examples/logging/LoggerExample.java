package com.in28minutes.java.beginners.concept.examples.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExample {

	private final static Logger LOGGER = Logger
			.getLogger(LoggerExample.class.getName());

	public static void main(String[] args) {
		//SEVERE,WARNING,INFO,CONFIG,FINE,FINER,FINEST

		//This doesn't publish it (It only creates the records)
		LOGGER.setLevel(Level.FINE);
		Handler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.FINEST);
		LOGGER.addHandler(consoleHandler);
		LOGGER.severe("severe");
		LOGGER.warning("warning");
		LOGGER.info("info");
		LOGGER.fine("fine");
	}
}
