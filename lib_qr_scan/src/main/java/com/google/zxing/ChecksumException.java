package com.google.zxing;

/**
 * Created by Jsonliang on 2016/11/5.
 */

public class ChecksumException extends ReaderException {
    private static final ChecksumException instance = new ChecksumException();

    private ChecksumException() {
    }

    public static ChecksumException getChecksumInstance() {
        return instance;
    }
}
