package jp.co.jmas.fristprogram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import jp.co.jmas.fristprogram.tool.ActivityCollector;

public class ThirdActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Log.d("ThirdActivity--->", "taskのId"+getTaskId());
        setContentView(R.layout.activity_third);
        TextView getDataTextVeiw = (TextView) findViewById(R.id.getDataTextVeiw);
//        Intent intent  = getIntent();
//        String data = intent.getStringExtra("data");
//        getDataTextVeiw.setText(data);
////        Log.d("ThirdActivity",data);
//        getDataTextVeiw.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent_back= new Intent ();
//                intent_back.putExtra("backMessage","もらった　こんにちは　MainActivity");
//                setResult(RESULT_OK,intent_back);
//                finish();
//            }
//        });
    }

//    @Override
//    public void onBackPressed() {
////        super.onBackPressed();
//        Intent intent_back = new Intent();
//        intent_back.putExtra("backMessage", "もらった　こんにちは　MainActivity");
//        setResult(RESULT_OK, intent_back);
//        finish();
//    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeAll();
    }
}
