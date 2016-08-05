package com.jzhung.demos.view.measure;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Jzhung on 2016/7/27.
 */
public class MeasureView extends View {

    public MeasureView(Context context) {
        super(context);
    }

    public MeasureView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MeasureView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int w = MeasureSpec.getSize(widthMeasureSpec);
        int h = MeasureSpec.getSize(heightMeasureSpec);

        int wmode = MeasureSpec.getMode(widthMeasureSpec);
        int hmode = MeasureSpec.getMode(heightMeasureSpec);

//        w = 100;
//        h = 100;

        setMeasuredDimension(w, h);

        //super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(final Canvas canvas) {
        final Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setDither(true);
        paint.setStrokeWidth(3);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(20, 20, 500, 500, paint);

        //canvas.drawPaint(paint);
       /* String text = "ad";
        paint.setStrokeWidth(1);
        canvas.drawText(text, 50, 150, paint);*/

        canvas.save();
        canvas.translate(50, 350);
        canvas.restore();
        canvas.rotate(20);
        canvas.drawRect(20, 20, 500, 500, paint);

        /*paint.setStrokeWidth(3);
        canvas.drawCircle(100, 100, 60, paint);*/
        //super.onDraw(canvas);

    }

    @Override
    public void onScreenStateChanged(int screenState) {
        super.onScreenStateChanged(screenState);
    }
}
