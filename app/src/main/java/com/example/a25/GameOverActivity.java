package com.example.a25;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class GameOverActivity extends AppCompatActivity {
    private TextView textView;
    Timer timer;

    // Sound
    private SoundPlayer soundPlayer;

    @SuppressLint("WrongViewCast")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        soundPlayer = new SoundPlayer(this);

        soundPlayer.playHitSound();

        timer = new Timer();

        timer.scheduleAtFixedRate(
                new TimerTask()
        {

            public void run()
            {
                fadein();
                timer.cancel();
            }
        }, 0, 3000);

        textView = findViewById(R.id.gameover);

        Button nextButton = (Button)findViewById(R.id.restart);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameOverActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void fadein() {
        // 透明度を0から1に変化
        AlphaAnimation alphaFadeIn = new AlphaAnimation(0.0f, 1.0f);
        // animation時間 msec
        alphaFadeIn.setDuration(6000);
        // animationが終わったそのまま表示にする
        alphaFadeIn.setFillAfter(true);

        textView.startAnimation(alphaFadeIn);
    }
}