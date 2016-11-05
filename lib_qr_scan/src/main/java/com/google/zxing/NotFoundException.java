package com.google.zxing;

/**
 * Created by Jsonliang on 2016/11/5.
 */

public final class NotFoundException extends ReaderException {
    private static final NotFoundException instance = new NotFoundException();

    private NotFoundException() {
    }

    public static NotFoundException getNotFoundInstance() {
        return instance;
    }
}
