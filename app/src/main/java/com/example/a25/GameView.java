package com.example.a25;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

public class GameView implements SurfaceHolder.Callback {
    private SurfaceHolder surfaceHolder;
    public GameView(Context context, SurfaceView sv) {
        surfaceHolder = sv.getHolder();
        surfaceHolder.addCallback(this);

    }

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder holder) {
        Paint paint = new Paint();



        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);

        Canvas canvas = surfaceHolder.lockCanvas();
        int w = canvas.getWidth();
        int h = canvas.getHeight();
        int l=225,t=200,r=350,b=325;


        int i=0,j=0;
        canvas.drawColor(Color.WHITE);
        for(i=0;i<5;i++,t=t+125,b=b+125){
            for(j=0;j<5;j++,l=l+125,r=r+125){
                canvas.drawRect(l, t,r, b, paint);
            }
            r=350;
            l=225;
        }

        surfaceHolder.unlockCanvasAndPost(canvas);


    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

    }
}
