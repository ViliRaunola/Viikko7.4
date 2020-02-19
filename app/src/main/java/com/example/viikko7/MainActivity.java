package com.example.viikko7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView teksti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teksti = (TextView) findViewById(R.id.textView2);

    }

    public void Testi(View v) {
        System.out.println("Hello World!");
        teksti.setText("Hello World!");
    }
}