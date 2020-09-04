package com.mnblog;

/** Created by milan.nikic on 9/2/2016. */
public class MyLoggerImpl extends MyLogger {

  public void trace(String message) {
    System.out.println("TRACE: " + message);
  }

  public void debug(String message) {
    System.out.println("DEBUG: " + message);
  }

  public void log(String message) {
    System.out.println("INFO: " + message);
  }
}
