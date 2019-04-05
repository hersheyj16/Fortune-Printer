package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String FORTUNE = "Fortune";
//    public static final String FORTUNE_VAL = "Today Tiggs wrote a resume. And he is a great tiger.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getFortune(View view) {
        Intent intent = new Intent(this, FortuneActivity.class);
        FortuneTeller ft = new FortuneTeller();
        String fortune = ft.getFortune();
        intent.putExtra(FORTUNE, fortune);
        startActivity(intent);
    }
}
