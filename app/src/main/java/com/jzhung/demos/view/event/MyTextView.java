package com.jzhung.demos.view.event;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by Jzhung on 2016/7/21.
 */
public class MyTextView extends TextView {
    private static final String TAG = "View";
    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG, "onTouchEvent: " + TouchEventUtil.getEvent(event.getAction()));
/*
        boolean ret = false;
        if(event.getAction() == MotionEvent.ACTION_DOWN){
            ret = false;
        }else {
            ret = true;
        }*/
        boolean ret = super.onTouchEvent(event);
        //Log.w(TAG, "返回:" + ret);
        return ret;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Log.e(TAG, "onDraw: ");
        super.onDraw(canvas);
    }
}
