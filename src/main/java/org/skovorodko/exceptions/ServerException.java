package org.skovorodko.exceptions;

public class ServerException extends Exception {

    public ServerException(String s) {
        super(s);
    }

    public ServerException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public void print() {
        System.err.println(getMessage());
        if (getCause() != null)
            getCause().printStackTrace();
    }

}