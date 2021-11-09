package com.shanzafar.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Quiz extends AppCompatActivity {
    String a = "أ ہ";
    String b = "ع ح";
    String c = "غ خ";

    Button button0;
    Button button1;
    Button button2;
    Button button3;


    public void chooseAnswer(View view){
        if(a == (view.getTag().toString())){
            button0.setBackgroundColor(Color.GREEN);
        }
        else {
            button0.setBackgroundColor(Color.RED);
        }
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        TextView textView = (TextView) findViewById(R.id.textView2);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

    }
}