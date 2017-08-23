package jp.co.jmas.fristprogram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Log.d("SecondActivity---->", "taskのId"+getTaskId());
        setContentView(R.layout.activity_second);
        Button toThirdActivityButton = (Button)findViewById(R.id.toThirdActivityButton);
        TextView getDataTextVeiw = (TextView) findViewById(R.id.getDataTextVeiw);
        toThirdActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });

        Intent intent  = getIntent();
        String data = intent.getStringExtra("data");
        getDataTextVeiw.setText(data);
        Log.d("SecondActivity",data);
        getDataTextVeiw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_back= new Intent ();
                intent_back.putExtra("backMessage","もらった　こんにちは　MainActivity");
                setResult(RESULT_OK,intent_back);
                finish();
            }
        });
    }
}
