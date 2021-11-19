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

public class FirstActivity extends AppCompatActivity {
    public GameView2 gameview2 = null;

    Timer timer;
    Timer timer2;
    Random random=new Random();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        SurfaceView surfaceView = (SurfaceView)findViewById(R.id.SurfaceViewMain);
        gameview2 = new GameView2(this, surfaceView);

        timer = new Timer();
        timer2 = new Timer();

        timer.scheduleAtFixedRate(
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
                            timer.cancel();
                        }

                        if(timerCount==2) {
                            timer.cancel();
                        }


                    }
                }, 1000, 500);


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
}