package com.mnblog;

/**
 * Created by milan.nikic on 9/2/2016.
 */
public abstract class MyLogger {

    public abstract void trace(String message);
    public abstract void debug(String message);
    public abstract void log(String message);

    public static MyLogger create() {
        // return new MyLoggerImpl();
        return new CommonsLogAdapter();
    }
}
