package jp.co.jmas.fristprogram;

import android.content.Intent;
import android.net.Uri;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    private TextView aTextView;
    private String savedStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Log.d("MainActivity---------->", "taskのId"+getTaskId());
        if (savedInstanceState != null) {//防止被系统强制突然回收而防止保存好的状态丢失
            savedStr = savedInstanceState.getString("data");
            Log.d("MainActivity---------->", savedStr);
        }

        setContentView(R.layout.activity_main);
        aTextView = (TextView) findViewById(R.id.aTextView);
        Button toSecondActivityButton = (Button) findViewById(R.id.toSecondActivityButton);
        toSecondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = "Hello ThirdActivity";
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                intent.putExtra("data", data);
//                intent.setData(Uri.parse("tel:0702"));
//                startActivityForResult(intent, 1);
                startActivity(intent);

            }
        });

    }
    /**
     * 防止被系统强制突然回收而防止保存好的状态丢失
     * 重写该方法然后再onCreate方法中实现找回
     * */
    @Override
    public void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState, outPersistentState);
        outState.putString("data", "こんにちは");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String backStr = data.getStringExtra("backMessage");
                    aTextView.setText(backStr);
                    Log.d("MainActivity", backStr.toString());
                }
        }
    }
}
