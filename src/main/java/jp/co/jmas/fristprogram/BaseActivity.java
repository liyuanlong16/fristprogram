package jp.co.jmas.fristprogram;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import jp.co.jmas.fristprogram.tool.ActivityCollector;

/**
 * Created by smyhvae on 2015/5/7.
 * 通过继承此类能得到当前活动的activity名称
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
        Log.e("BaseActivity-----><><", getClass().getSimpleName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        ActivityCollector.removeAll();
    }
}
