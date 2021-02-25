package com.example.lab_7;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Bai2Activity extends AppCompatActivity {
    ImageView imv_bai2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);

        imv_bai2 = findViewById(R.id.imv_bai2);
    }

    public void show_all(View view){
        show_image("All");
    }

    public void show_doraemon(View view){
        show_image("doraemon");
    }

    public void show_nobita(View view){
        show_image("nobita");
    }
    public void show_Shizuka(View view){
        show_image("Shizuka");
    }
    public void show_suneo(View view){
        show_image("suneo");
    }
    public void show_chaien(View view){
        show_image("chaien");
    }
    public void show_image(String img){
//      hide image
        ObjectAnimator animator = ObjectAnimator.ofFloat(imv_bai2 , "translationX" , 0f , 700f);
        animator.setDuration(1000);
        ObjectAnimator animator_1 = ObjectAnimator.ofFloat(imv_bai2 , "alpha" , 1f , 0f);
        animator_1.setDuration(2000);
//        show image
        ObjectAnimator animator_2 = ObjectAnimator.ofFloat(imv_bai2 , "translationX" , -600f , 0f);
        animator_2.setDuration(1000);
        ObjectAnimator animator_3 = ObjectAnimator.ofFloat(imv_bai2 , "alpha" , 0f , 1f);
        animator_3.setDuration(2000);
//        config slide show
        AnimatorSet animatorSet = new AnimatorSet();
//        animatorSet.play(animator_2).with(animator_3).after(animator).before(animator_1);
//        animatorSet.play(animator_2).with(animator_3).after(animator);
//        animatorSet.start();
        final String img_name = img;
        if (img_name.equalsIgnoreCase("all")){
            imv_bai2.setImageResource(R.drawable.all);
            animatorSet.play(animator_2).with(animator_3);
            animatorSet.start();
        }
        else if (img_name.equalsIgnoreCase("nobita")){
            imv_bai2.setImageResource(R.drawable.nobita);
            ObjectAnimator animator_4 = ObjectAnimator.ofFloat(imv_bai2 , "translationY" , 1000f , 0f);
            animator_4.setDuration(1000);
            animatorSet.play(animator_4).with(animator_3);
            animatorSet.start();
        }
        else if (img_name.equalsIgnoreCase("doraemon")){
            imv_bai2.setImageResource(R.drawable.doraemon);
            ObjectAnimator animator_4 = ObjectAnimator.ofFloat(imv_bai2 , "translationX" , 600f , 0f);
            animator_4.setDuration(1000);
            animatorSet.play(animator_4).with(animator_3);
            animatorSet.start();
        }
        else if (img_name.equalsIgnoreCase("Shizuka")){
            imv_bai2.setImageResource(R.drawable.shizuka);
            animatorSet.play(animator_2).with(animator_3);
            animatorSet.start();
        }
        else if (img_name.equalsIgnoreCase("suneo")){
            imv_bai2.setImageResource(R.drawable.suneo);
            ObjectAnimator animator_4 = ObjectAnimator.ofFloat(imv_bai2 , "translationX" , 600f , 0f);
            animator_4.setDuration(1000);
            animatorSet.play(animator_4).with(animator_3);
            animatorSet.start();
        }
        else if (img_name.equalsIgnoreCase("chaien")){
            imv_bai2.setImageResource(R.drawable.chaien);
            ObjectAnimator animator_4 = ObjectAnimator.ofFloat(imv_bai2 , "translationY" , 1000f , 0f);
            animator_4.setDuration(1000);
            animatorSet.play(animator_4).with(animator_3);
            animatorSet.start();
        }
    }
}