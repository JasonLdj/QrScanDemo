package com.google.zxing;

/**
 * Created by Jsonliang on 2016/11/5.
 */

public abstract  class ReaderException extends Exception {
    ReaderException() {
    }

    public final Throwable fillInStackTrace() {
        return null;
    }
}
