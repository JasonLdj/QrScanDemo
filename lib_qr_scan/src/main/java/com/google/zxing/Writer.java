package com.google.zxing;

import com.google.zxing.common.BitMatrix;

import java.util.Map;

/**
 * Created by Jsonliang on 2016/11/5.
 */

public interface Writer {
    BitMatrix encode(String var1, BarcodeFormat var2, int var3, int var4) throws WriterException;

    BitMatrix encode(String var1, BarcodeFormat var2, int var3, int var4, Map<EncodeHintType, ?> var5) throws WriterException;
}
