package com.example.a25;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

import static android.view.animation.Animation.*;

public class MainActivity extends AppCompatActivity {
    GameView gameview = null;
    private TextView txtView;
    private long offset;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SurfaceView surfaceView = (SurfaceView)findViewById(R.id.SurfaceViewMain);
        gameview = new GameView(this, surfaceView);
//        gameview = new GameView(this);
//        setContentView(gameview);


         Button nextButton = (Button)findViewById(R.id.button2);
         nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, FirstActivity.class);
                 startActivity(intent);


             }
         });

    }

}

   
