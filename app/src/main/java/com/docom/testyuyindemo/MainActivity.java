package com.docom.testyuyindemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.docom.docom_tts.TtsDemo;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mMainBtn;
    private TtsDemo ttsDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        ttsDemo = new TtsDemo(this);


    }

    private void initView() {
        mMainBtn = (Button) findViewById(R.id.main_btn);

        mMainBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_btn:
                ttsDemo.startSpeak("测试语音朗读功能");
                break;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        ttsDemo.stopSpeak();
    }
}
