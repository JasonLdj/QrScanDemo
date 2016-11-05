package com.netease.scan;

import android.content.Context;

/**
 * Created by Jsonliang on 2016/11/5.
 */

public interface IScanModuleCallBack {
    void OnReceiveDecodeResult(Context context, String result);
}
