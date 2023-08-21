package org.skovorodko.exceptions;

public class RequestMethodException extends Exception {

    public RequestMethodException(String s) {
        super(s);
    }

    public RequestMethodException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public void print() {
        System.err.println(getMessage());
        if (getCause() != null)
            getCause().printStackTrace();
    }

}