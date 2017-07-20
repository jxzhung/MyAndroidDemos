package com.jzhung.demos.view.position;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.socks.library.KLog;

/**
 * Created by Jzhung on 2017/3/15.
 */

public class PositionView extends View {
    private static final String TAG = "PositionView";
    private float touchX;
    private float touchY;

    public PositionView(Context context) {
        super(context);
    }

    public PositionView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int bgRedColor = (int) (touchX % 255);
        int bgGreenColor = (int) (touchY % 255);
        int bgBlueColor = (int) ((touchX + touchY) % 255);

        canvas.drawColor(Color.argb(255, bgRedColor, bgGreenColor, bgBlueColor));
        super.onDraw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        touchX = event.getX();
        touchY = event.getY();
        String info = "Action:" + event.getAction()
                + "\nRawX:" + event.getRawX()
                + "\n____X:" + event.getX()
                + "\nRawY:" + event.getRawY()
                + "\n____Y:" + event.getY();
        KLog.i(TAG, info);
        postInvalidate();
        return true;
    }
}
