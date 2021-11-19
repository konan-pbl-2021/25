package com.example.a25;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    GameView gameview = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        gameview = new GameView(this);
        setContentView(gameview);
      
      
        setContentView(R.layout.activity_main);

         Button nextButton = (Button)findViewById(R.id.button2);
         nextButton.setOnClickListener(new View.OnClickListener() {
                     @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, GameOverActivity.class);
                 startActivity(intent);
             }
         });

    }
   }

   
