package cn.gavinliu.open.gamepad.helper;

import android.app.Application;

import cn.gavinliu.open.gamepad.helper.db.DBManager;
import cn.gavinliu.open.gamepad.helper.utils.ScreenUtils;

/**
 * Created by Gavin on 16-2-19.
 */
public class HelperApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        DBManager.createInstance(this);
        ScreenUtils.createInstance(this);
    }
}
