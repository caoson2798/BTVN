package com.example.daiphongpc.gd3.sharepredferences;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.daiphongpc.gd3.R;
import com.example.daiphongpc.gd3.sharepredferences.util.AppConfig;

import java.util.Timer;
import java.util.TimerTask;

public class WaitActivity extends AppCompatActivity {
    ImageView imgShose;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wait);
        addControls();

    }

    private void addControls() {
        animation=AnimationUtils.loadAnimation(this,R.anim.transfer);
        imgShose = findViewById(R.id.img_shoes);
        imgShose.startAnimation(animation);
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                boolean kt = AppConfig.getKeepLogin(WaitActivity.this);
                if (kt == true) {
                    Intent intent = new Intent(WaitActivity.this, HomeActivity.class);
                    startActivity(intent);
                    finish();

                } else {
                    Intent intent = new Intent(WaitActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();

                }
            }
        };
        Timer timer=new Timer();
        timer.schedule(timerTask,3500);
    }

}
