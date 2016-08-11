package com.jzhung.demos.view.customview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.jzhung.demos.R;

import java.util.Random;

/**
 * Created by Jzhung on 2016/8/10.
 */

public class CustomView1 extends View {
    private Paint mPaint;
    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };
    private int startX;
    private int startY;

    private int width;
    private int height;

    Random randomColor;

    Bitmap bm;

    public CustomView1(Context context) {
        super(context);
        init();
    }

    public CustomView1(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomView1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(500, 500);
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setStrokeWidth(2);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLUE);

        startX = 0;
        startY = 0;
        width = 50;
        height = 50;

        randomColor = new Random(255);

        Drawable pic = getResources().getDrawable(R.drawable.headicon);
        BitmapDrawable bd = (BitmapDrawable)pic;
        bm = bd.getBitmap();
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.argb(160,0,0,0));
        mPaint.setColor(Color.argb(255, randomColor.nextInt(), randomColor.nextInt(), randomColor.nextInt()));
        canvas.save();
        canvas.rotate(randomColor.nextInt(15));
        canvas.drawRect(startX, startY, startX + width, startY + height, mPaint);
        canvas.drawBitmap(bm, startX + width, startY + height, mPaint);
        canvas.restore();

        postDelayed(new Runnable() {
            @Override
            public void run() {

                if(startX > getMeasuredWidth() || startY >getMeasuredHeight()){
                    startX -= getMeasuredWidth();
                    startY -= getMeasuredHeight();
                }else{
                    startX += 10;
                    startY += 10;
                }
                invalidate();
            }
        }, 100);
    }


}
