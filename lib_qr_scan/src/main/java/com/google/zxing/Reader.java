package com.google.zxing;

import java.util.Map;

/**
 * Created by Jsonliang on 2016/11/5.
 */

public interface Reader {
    Result decode(BinaryBitmap var1) throws NotFoundException, ChecksumException, FormatException;

    Result decode(BinaryBitmap var1, Map<DecodeHintType, ?> var2) throws NotFoundException, ChecksumException, FormatException;

    void reset();
}
