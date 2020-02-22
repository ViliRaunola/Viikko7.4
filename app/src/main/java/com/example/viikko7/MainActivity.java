package com.example.viikko7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

//https://www.youtube.com/watch?v=DivBp_9ZeK0

public class MainActivity extends AppCompatActivity {

    TextView teksti;
    EditText txt;
    String muuttuja;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        teksti = (TextView) findViewById(R.id.textView2);
        txt = (EditText) findViewById(R.id.Syote);
        button = (Button) findViewById(R.id.button);

        txt.setOnEditorActionListener(kuuntelija);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String haeTeksti = txt.getText().toString();
                teksti.setText(haeTeksti);
            }
        });

    }

    TextView.OnEditorActionListener kuuntelija = new TextView.OnEditorActionListener() {
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            switch (actionId){
                case EditorInfo.IME_ACTION_SEND:
                    Toast.makeText(MainActivity.this, "send", Toast.LENGTH_SHORT).show();
                    String haeTeksti = txt.getText().toString();
                    teksti.setText(haeTeksti);
                    break;
            }
            return false;
        }
    };

}