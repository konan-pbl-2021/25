package com.example.a25;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import static com.example.a25.GameView2.timerCount;
import android.view.View;
import android.widget.Button;

import android.os.CountDownTimer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class FirstActivity extends AppCompatActivity {
    public GameView2 gameview2 = null;

    Timer timer;
    Timer timer2;
    Random random=new Random();

    //追加
    private TextView timerText;
    private SimpleDateFormat dataFormat =
            new SimpleDateFormat("mm:ss", Locale.US);

    Timer timer3;
    //追加


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        SurfaceView surfaceView = (SurfaceView)findViewById(R.id.SurfaceViewMain);
        gameview2 = new GameView2(this, surfaceView);

        timer = new Timer();
        timer2 = new Timer();
        timer3 = new Timer();




        //追加
        // 1分= 60x1000 = 60000 msec
        long countNumber = 30000;
        // インターバル msec
        long interval = 10;
        timerText = findViewById(R.id.timer);
        timerText.setText(dataFormat.format(0));
        // インスタンス生成
        // CountDownTimer(long millisInFuture, long countDownInterval)
        final CountDown countDown = new CountDown(countNumber, interval);
        //終了

        timer3.scheduleAtFixedRate(
                new TimerTask()
                {
                    public void run()
                    {
                        gameview2.rectY=random.nextInt(5);
                        gameview2.rectX=random.nextInt(5);
                        gameview2.rectY=gameview2.rectY*125+300;
                        gameview2.rectX=gameview2.rectX*125+225;
                        gameview2.rectT=gameview2.rectX+125;
                        gameview2.rectB=gameview2.rectY+125;
                        gameview2.update();


                        if(gameview2.rectX<gameview2.ballX&&gameview2.rectX+125>gameview2.ballX&&gameview2.rectY<gameview2.ballY&&gameview2.rectY+125>gameview2.ballY){
                            timer3.cancel();
                            timer.cancel();

                            //追加
                            Intent intent = new Intent(FirstActivity.this, GameOverActivity.class);
                            startActivity(intent);
                            timerText.setText(dataFormat.format(0));
                            //終了
                        }

                        if(timerCount%60==0 && timerCount!=0) {
                            timer3.cancel();
                            timer.cancel();
                            Intent intent = new Intent(FirstActivity.this, clear_scene.class);
                            startActivity(intent);
                        }timerCount++;


                    }
                }, 1000, 500);

        timer.scheduleAtFixedRate(
                new TimerTask()
                {
                    public void run()
                    {
                        countDown.start();
                    }
                }, 1000, 60000);



        Button upButton = (Button)findViewById(R.id.up);
        Button leftButton = (Button)findViewById(R.id.left);
        Button downButton = (Button)findViewById(R.id.down);
        Button rightButton = (Button)findViewById(R.id.right);


        upButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(gameview2.ballY>365) {
                    gameview2.ballY -= 125;
                    gameview2.update();
                }
            }
        });
        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(gameview2.ballX>288) {
                    gameview2.ballX-= 125;
                    gameview2.update();
                }
            }
        });
        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gameview2.ballX<788) {
                    gameview2.ballX += 125;
                    gameview2.update();
                }
            }
        });
        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gameview2.ballY<865) {
                    gameview2.ballY += 125;
                    gameview2.update();
                }
            }
        });

    }



    //追加
    class CountDown extends CountDownTimer {

        CountDown(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onFinish() {
            // 完了
            timerText.setText(dataFormat.format(0));
        }

        // インターバルで呼ばれる
        @Override
        public void onTick(long millisUntilFinished) {
            // 残り時間を分、秒、ミリ秒に分割
            //long mm = millisUntilFinished / 1000 / 60;
            //long ss = millisUntilFinished / 1000 % 60;
            //long ms = millisUntilFinished - ss * 1000 - mm * 1000 * 60;
            //timerText.setText(String.format("%1$02d:%2$02d.%3$03d", mm, ss, ms));

            timerText.setText(dataFormat.format(millisUntilFinished));

        }
    }
    //終了
}