package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.myapplication.MainActivity.FORTUNE;

public class FortuneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortune);

        Intent intent = getIntent();
        String fortune = intent.getStringExtra(FORTUNE);
        TextView textView = findViewById(R.id.FortuneTextView);
        textView.setText(fortune);
    }

    public void toPrint() {
        Toast toast=Toast.makeText(getApplicationContext(),"Hello Printing Stub",Toast.LENGTH_SHORT);
        toast.setMargin(50,50);
        toast.show();
    }
}
