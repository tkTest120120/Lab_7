package com.example.lab_7;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Bai1Activity extends AppCompatActivity {
    ImageView imv_bai1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);

        imv_bai1 = findViewById(R.id.imv_bai1);
    }
    public void rotation_btn(View view){
       int dest = 360;
       if (imv_bai1.getRotation() == 360){
           System.out.println(imv_bai1.getAlpha());
           dest = 0;
       }
        ObjectAnimator animator = ObjectAnimator.ofFloat(imv_bai1 , "rotation" , dest);
       animator.setDuration(2000);
       animator.start();
    }
    public void btn_zoom(View view){
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.zoom);
        imv_bai1.startAnimation(animation);
    }
    public void btn_moving(View view){
        ObjectAnimator animator = ObjectAnimator.ofFloat(imv_bai1 , "translationY" , -1000f , 0f );
        animator.setDuration(2000);
        animator.start();
    }
}