package com.example.animationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout relativeLayout = findViewById(R.id.myLayout);

        Animation myAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_file);

        relativeLayout.setAnimation(myAnimation);

        myAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Toast.makeText(getApplicationContext(),"Animation end.",Toast.LENGTH_LONG);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
