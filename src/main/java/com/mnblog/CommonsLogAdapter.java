package com.mnblog;

import org.apache.log4j.Logger;

/**
 * Created by milan.nikic on 9/2/2016.
 */
public class CommonsLogAdapter extends MyLogger {

    private Logger logger = Logger.getLogger(CommonsLogAdapter.class);

    public void trace(String message) {
        logger.trace(message);
    }

    public void debug(String message) {
        logger.debug(message);
    }

    public void log(String message) {
        logger.info(message);
    }
}
