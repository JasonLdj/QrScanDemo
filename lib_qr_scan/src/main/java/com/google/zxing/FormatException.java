package com.google.zxing;

/**
 * Created by Jsonliang on 2016/11/5.
 */

public final class FormatException extends ReaderException {
    private static final FormatException instance = new FormatException();

    private FormatException() {
    }

    public static FormatException getFormatInstance() {
        return instance;
    }
}
