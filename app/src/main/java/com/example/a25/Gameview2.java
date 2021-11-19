package com.example.a25;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;


class GameView2 implements SurfaceHolder.Callback {
    public int ballX=538;
    public int ballY=615;
    public static int timerCount=0;
    public int rectY=0;
    public int rectX=0;
    public int rectB=125;
    public int rectT=125;
    public static int timerCount2=0;

    private SurfaceHolder surfaceHolder;
    public GameView2(Context context, SurfaceView sv) {
        surfaceHolder = sv.getHolder();
        surfaceHolder.addCallback(this);

    }

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder holder) {
        Paint paint = new Paint();
        Paint paint2 = new Paint();
        paint2.setColor(Color.GREEN);
        Paint paint3 = new Paint();
        paint3.setColor(Color.WHITE);
        if(rectX>224&&rectX<826&&rectY>299&&rectY<901) {
            paint3.setColor(Color.RED);
        }


        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);

        Canvas canvas = surfaceHolder.lockCanvas();
        int w = canvas.getWidth();
        int h = canvas.getHeight();
        int l=225,t=300,r=350,b=425;
        int i=0,j=0;

        canvas.drawColor(Color.WHITE);
        for(i=0;i<5;i++,t=t+125,b=b+125){
            for(j=0;j<5;j++,l=l+125,r=r+125){
                canvas.drawRect(l, t,r, b, paint);
            }
            r=350;
            l=225;
        }
        canvas.drawCircle(ballX, ballY,50, paint2);
        canvas.drawRect(rectX, rectY,rectT, rectB, paint3);

        surfaceHolder.unlockCanvasAndPost(canvas);



    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {


    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

    }

    public void update() {
        Paint paint = new Paint();
        Paint paint2 = new Paint();
        paint2.setColor(Color.GREEN);
        Paint paint3 = new Paint();
        paint3.setColor(Color.WHITE);
        if(rectX>224&&rectX<826&&rectY>299&&rectY<901) {
            paint3.setColor(Color.RED);
        }



        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);

        Canvas canvas = surfaceHolder.lockCanvas();
        int w = canvas.getWidth();
        int h = canvas.getHeight();
        int l=225,t=300,r=350,b=425;
        int i=0,j=0;

        canvas.drawColor(Color.WHITE);
        for(i=0;i<5;i++,t=t+125,b=b+125){
            for(j=0;j<5;j++,l=l+125,r=r+125){
                canvas.drawRect(l, t,r, b, paint);
            }
            r=350;
            l=225;
        }
        canvas.drawRect(rectX, rectY,rectT, rectB, paint3);
        canvas.drawCircle(ballX, ballY,50, paint2);

        surfaceHolder.unlockCanvasAndPost(canvas);


    }
}