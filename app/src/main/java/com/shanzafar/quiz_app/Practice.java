package com.shanzafar.quiz_app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Practice extends AppCompatActivity {

    public void go1(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity1.class);
        startActivity(intent);
    }
    public void go2(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(intent);
    }
    public void go3(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(intent);
    }
    public void go4(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
        startActivity(intent);
    }
    public void go5(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity5.class);
        startActivity(intent);
    }
    public void go6(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity6.class);
        startActivity(intent);
    }
    public void go7(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity7.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


    }
}