package com.example.lab_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void show_bai1(View view){
        startActivity(new Intent(this , Bai1Activity.class));
    }
    public void show_bai2(View view){
        startActivity(new Intent(this , Bai2Activity.class));
    }
    public void show_bai3(View view){
        startActivity(new Intent(this , Bai3Activity.class));
    }
}