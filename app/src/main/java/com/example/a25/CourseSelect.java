package com.example.a25;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CourseSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Button course1;
        course1=(Button)findViewById(R.id.button);
        course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView1=(TextView)findViewById(R.id.text);
                textView1.setText("OK Button Clicked!");

            }
        });
        */
        //コース１へ
        Button course1=(Button)findViewById(R.id.course1);
        course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourseSelect.this,Course1.class);
                startActivity(intent);

            }
        });
        course1.setAlpha(0.3f);
        course1.setRotation(15f);
        //コース2へ
        Button course2=(Button)findViewById(R.id.course2);
        course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourseSelect.this,Course2.class);
                startActivity(intent);

            }
        });
        course2.setAlpha(0.3f);
        course2.setRotation(15f);
        //コース3へ
        Button course3=(Button)findViewById(R.id.course3);
        course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourseSelect.this,Course3.class);
                startActivity(intent);

            }
        });
        course3.setAlpha(0.3f);
        course3.setRotation(15f);
    }
}