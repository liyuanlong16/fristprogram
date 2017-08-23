package jp.co.jmas.fristprogram.tool;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by smyhvae on 2015/5/7.
 * 一个活动事例的管理类能一下子全部退出程序等操作
 */
public class ActivityCollector {

    public static List<Activity> activities = new ArrayList<Activity>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void remove(Activity activity) {
        activities.remove(activity);
    }

    public static void removeAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
