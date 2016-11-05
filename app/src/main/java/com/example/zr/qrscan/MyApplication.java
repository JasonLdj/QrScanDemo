package com.example.zr.qrscan;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

import com.netease.scan.QrScan;
import com.netease.scan.QrScanConfiguration;

/**
 * @author hzzhengrui
 * @Date 16/10/27
 * @Description
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

//        // 默认配置
//        QrScanConfiguration configuration = QrScanConfiguration.createDefault(this);

        // 自定义配置
        Drawable drawable = getDrawable(R.mipmap.capture_add_scanning);
        drawable.setColorFilter(Color.RED, PorterDuff.Mode.OVERLAY);
        QrScanConfiguration configuration = new QrScanConfiguration.Builder(this)
                .setTitleHeight(53)
                .setTitleText("扫一扫")
                .setTitleTextSize(18)
                .setTitleTextColor(R.color.white)
                .setTipText("将二维码放入框内自动扫描~")
                .setTipTextSize(14)
                .setTipMarginTop(40)
                .setTipTextColor(R.color.white)
                //.setSlideIcon(R.mipmap.capture_add_scanning)
                .setSlideIcon(drawable)
                .setAngleColor(R.color.gray)   // 四个角落的颜色
                .setMaskColor(R.color.black_80)
                .setScanFrameRectRate((float) 0.8) //置扫描框长度相对屏幕宽度的比例

                .build();
        QrScan.getInstance().init(configuration);
    }
}
