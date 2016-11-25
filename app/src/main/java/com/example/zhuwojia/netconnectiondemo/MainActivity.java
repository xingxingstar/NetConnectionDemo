package com.example.zhuwojia.netconnectiondemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.zhuwojia.netconnectiondemo.utils.HttpUtils;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bnt1:
                if (HttpUtils.hasNetWork(this)) {
                    textView.setText("此时网络有网");
                } else {
                    textView.setText("此时网络无网");
                }

                break;
            case R.id.bnt2:
                if (HttpUtils.isNetworkConnected(this)) {
                    textView.setText("此网络可用");
                } else {
                    textView.setText("此网络不可用");
                }
                break;
            case R.id.bnt3:
                textView.setText(HttpUtils.getCurrentNetworkType(this));
        }
    }
}
