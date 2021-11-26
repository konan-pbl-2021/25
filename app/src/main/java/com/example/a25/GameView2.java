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

    public int rectY2=0;
    public int rectX2=0;
    public int rectB2=125;
    public int rectT2=125;

    public int rectY3=0;
    public int rectX3=0;
    public int rectB3=125;
    public int rectT3=125;

    public int rectY4=0;
    public int rectX4=0;
    public int rectB4=125;
    public int rectT4=125;

    public int rectY5=0;
    public int rectX5=0;
    public int rectB5=125;
    public int rectT5=125;

    public int rectY6=0;
    public int rectX6=0;
    public int rectB6=125;
    public int rectT6=125;

    public int rectY7=0;
    public int rectX7=0;
    public int rectB7=125;
    public int rectT7=125;

    public int rectY8=0;
    public int rectX8=0;
    public int rectB8=125;
    public int rectT8=125;
    public static int timerCount2=0;
    public static int timerCount3=0;

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
        Paint paint4 = new Paint();
        paint4.setColor(Color.WHITE);
        Paint paint5 = new Paint();
        paint5.setColor(Color.WHITE);
        Paint paint6 = new Paint();
        paint6.setColor(Color.WHITE);
        Paint paint7 = new Paint();
        paint7.setColor(Color.WHITE);
        Paint paint8 = new Paint();
        paint8.setColor(Color.WHITE);
        Paint paint9 = new Paint();
        paint9.setColor(Color.WHITE);
        Paint paint10 = new Paint();
        paint10.setColor(Color.WHITE);



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
        canvas.drawRect(rectX2, rectY2,rectT2, rectB2, paint4);
        canvas.drawRect(rectX3, rectY3,rectT3, rectB3, paint5);
        canvas.drawRect(rectX4, rectY4,rectT4, rectB4, paint6);
        canvas.drawRect(rectX5, rectY5,rectT5, rectB5, paint7);
        canvas.drawRect(rectX6, rectY6,rectT6, rectB6, paint8);
        canvas.drawRect(rectX7, rectY7,rectT7, rectB7, paint9);
        canvas.drawRect(rectX8, rectY8,rectT8, rectB8, paint10);

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
        Paint paint4 = new Paint();
        paint4.setColor(Color.TRANSPARENT);
        Paint paint5 = new Paint();
        paint5.setColor(Color.TRANSPARENT);
        Paint paint6 = new Paint();
        paint6.setColor(Color.TRANSPARENT);
        Paint paint7 = new Paint();
        paint7.setColor(Color.TRANSPARENT);
        Paint paint8 = new Paint();
        paint8.setColor(Color.TRANSPARENT);
        Paint paint9 = new Paint();
        paint9.setColor(Color.TRANSPARENT);
        Paint paint10 = new Paint();
        paint10.setColor(Color.TRANSPARENT);


        /*if(rectX>224&&rectX<826&&rectY>299&&rectY<901) {
            paint3.setColor(Color.RED);
        }
         */
        if(timerCount2==5||timerCount2==6){
            paint3.setColor(Color.RED);
        }
        if(timerCount2==1||timerCount2==3){
            paint3.setColor(Color.YELLOW);
        }
        if (timerCount2 == 2 || timerCount2 == 4) {
            paint3.setColor(Color.WHITE);
        }

        if(timerCount3>3) {
            if (timerCount2 == 5||timerCount2==6) {
                paint4.setColor(Color.RED);
            }
            if (timerCount2 == 1 || timerCount2 == 3) {
                paint4.setColor(Color.YELLOW);
            }
            if (timerCount2 == 2 || timerCount2 == 4) {
                paint4.setColor(Color.WHITE);
            }
        }

        if(timerCount3>6) {
            if (timerCount2 == 5||timerCount2==6) {
                paint5.setColor(Color.RED);
            }
            if (timerCount2 == 2 || timerCount2 == 4) {
                paint5.setColor(Color.WHITE);
            }
            if (timerCount2 == 1 || timerCount2 == 3) {
                paint5.setColor(Color.YELLOW);
            }
        }

        if(timerCount3>9) {
            if (timerCount2 == 5||timerCount2==6) {
                paint6.setColor(Color.RED);
            }
            if (timerCount2 == 2 || timerCount2 == 4) {
                paint6.setColor(Color.WHITE);
            }
            if (timerCount2 == 1 || timerCount2 == 3) {
                paint6.setColor(Color.YELLOW);
            }

        }
        if(timerCount3>11) {
            if (timerCount2 == 5||timerCount2==6) {
                paint7.setColor(Color.RED);
            }
            if (timerCount2 == 2 || timerCount2 == 4) {
                paint7.setColor(Color.WHITE);
            }
            if (timerCount2 == 1 || timerCount2 == 3) {
                paint7.setColor(Color.YELLOW);
            }
        }
        if(timerCount3>14) {
            if (timerCount2 == 5||timerCount2==6) {
                paint8.setColor(Color.RED);
            }
            if (timerCount2 == 2 || timerCount2 == 4) {
                paint8.setColor(Color.WHITE);
            }
            if (timerCount2 == 1 || timerCount2 == 3) {
                paint8.setColor(Color.YELLOW);
            }
        }


        if(timerCount3>17) {
            if (timerCount2 == 5||timerCount2==6) {
                paint9.setColor(Color.RED);
            }
            if (timerCount2 == 2 || timerCount2 == 4) {
                paint9.setColor(Color.WHITE);
            }
            if (timerCount2 == 1 || timerCount2 == 3) {
                paint9.setColor(Color.YELLOW);
            }
        }
        if(timerCount3>17) {
            if (timerCount2 == 5||timerCount2==6) {
                paint10.setColor(Color.RED);
            }
            if (timerCount2 == 2 || timerCount2 == 4) {
                paint10.setColor(Color.WHITE);
            }
            if (timerCount2 == 1 || timerCount2 == 3) {
                paint10.setColor(Color.YELLOW);
            }
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
        canvas.drawRect(rectX8, rectY8,rectT8, rectB8, paint10);
        canvas.drawRect(rectX7, rectY7,rectT7, rectB7, paint9);
        canvas.drawRect(rectX6, rectY6,rectT6, rectB6, paint8);
        canvas.drawRect(rectX5, rectY5,rectT5, rectB5, paint7);
        canvas.drawRect(rectX4, rectY4,rectT4, rectB4, paint6);
        canvas.drawRect(rectX3, rectY3,rectT3, rectB3, paint5);
        canvas.drawRect(rectX2, rectY2,rectT2, rectB2, paint4);
        canvas.drawRect(rectX, rectY,rectT, rectB, paint3);
        canvas.drawCircle(ballX, ballY,50, paint2);

        surfaceHolder.unlockCanvasAndPost(canvas);


    }
}