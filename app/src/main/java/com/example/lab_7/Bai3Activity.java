package com.example.lab_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Bai3Activity extends AppCompatActivity {
    ImageView img_hour , img_minute , img_second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);

        img_hour = findViewById(R.id.imv_gio);
        img_minute = findViewById(R.id.imv_phut);
        img_second = findViewById(R.id.imv_giay);
    }

    public void start_clock(){
        Animation animation_hour = AnimationUtils.loadAnimation(this , R.anim.hour);
        Animation animation_minute = AnimationUtils.loadAnimation(this , R.anim.minute);
        Animation animation_second = AnimationUtils.loadAnimation(this , R.anim.second);

        img_hour.startAnimation(animation_hour);
        img_minute.startAnimation(animation_minute);
        img_second.startAnimation(animation_second);
    }

    public void btn_run(View view){
        start_clock();
    }
}