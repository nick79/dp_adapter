package com.mnblog;

/** Created by milan.nikic on 9/2/2016. */
public class AdapterDemo {

  public static void main(String[] args) {
    MyLogger logger = MyLogger.create();
    logger.trace("Trace message");
    logger.debug("Debug message");
    logger.log("Info message");
  }
}
