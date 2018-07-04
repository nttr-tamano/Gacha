package com.example.nttr.gacha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnExec = (Button) findViewById(R.id.btnExec);
        btnExec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click(v);
            }
        });
    }

    // https://qiita.com/Reyurnible/private/4a2d3d203ccecf83259d
    public void click(View view) {
        // 画面の遷移にはIntentというクラスを使用します。
        // Intentは、Android内でActivity同士やアプリ間の通信を行う際の通信内容を記述するクラスです。
        Intent intent = new Intent(this, SecondActivity.class);
        // startActivityで、Intentの内容を発行します。
        startActivity(intent);
    }

}
