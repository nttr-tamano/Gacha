package com.example.nttr.gacha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // ① ImageViewの関連付けを行います。
        ImageView resultImage = findViewById(R.id.imageResult);
        // ② どの画像を表示するかランダムに指定します。
        // ランダムなデータを生成するにはRandomクラスを使用します。
        Random random = new Random();
        // 整数を取得したいのでnextIntというメソッドを呼び出します。
        // 引数に数字を指定すると、0から指定した数字までの中で整数を生成します。
        int number = random.nextInt(5);

        // ④ if文ではなく、switch文を使用して画像を指定してみます
        switch (number) {
            case 0:
                resultImage.setImageResource(R.mipmap.soccer);
                break;
            case 1:
                resultImage.setImageResource(R.mipmap.baseball);
                break;
            case 2:
                resultImage.setImageResource(R.mipmap.volleyball);
                break;
            case 3:
                resultImage.setImageResource(R.mipmap.tennis);
                break;
            case 4:
                resultImage.setImageResource(R.mipmap.golf);
                break;
        }

    }

}
