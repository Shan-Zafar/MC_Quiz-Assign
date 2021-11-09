package com.shanzafar.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void startQuiz(View view){
        Intent intent = new Intent(getApplicationContext(),Quiz.class);
        startActivity(intent);
    }

    public void gotoURl(View view){
        String url = "https://github.com/Shan-Zafar/MC_Quiz-Assignment.git";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}