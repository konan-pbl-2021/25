package com.example.a25;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.view.animation.AlphaAnimation;
        import android.widget.Button;
        import android.widget.TextView;

        import org.w3c.dom.Text;

        import java.util.Timer;
        import java.util.TimerTask;

public class clear_scene extends AppCompatActivity {
    private TextView textView;
    Timer timer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clear_scene);

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

        textView = findViewById(R.id.game_clear);

        Button nextButton = (Button)findViewById(R.id.backbutton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(clear_scene.this, MainActivity.class);
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