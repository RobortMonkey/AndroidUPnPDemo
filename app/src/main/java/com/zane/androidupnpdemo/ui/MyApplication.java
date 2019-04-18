package com.zane.androidupnpdemo.ui;

import android.app.Application;
import android.content.Context;

import com.zane.androidupnpdemo.Config;
import com.zane.androidupnpdemo.util.Utils;

/**
 * @package com.zane.androidupnpdemo.ui
 * @file MyApplication
 * @date 2019/4/18  11:02 AM
 * @autor wangxiongfeng
 */
public class MyApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;

        Config.IP = Utils.getWIFIIP(this);
        Config.HostName = Utils.getWIFIIP(this);

    }

    public static Context getContext() {
        return mContext;
    }
}
