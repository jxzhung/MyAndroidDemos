package com.jzhung.demos.view.event;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * MyLinearLayout1
 */
public class MyLinearLayout2 extends LinearLayout {
    private static final String TAG = "ViewGroup2";

    public MyLinearLayout2(Context context) {
        super(context);
    }

    public MyLinearLayout2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLinearLayout2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        Log.i(TAG, "onInterceptTouchEvent: " + TouchEventUtil.getEvent(event.getAction()) /*+ " return: super.onInterceptHoverEvent(event)"*/);
        boolean ret = super.onInterceptTouchEvent(event);
//        if(event.getAction() == MotionEvent.ACTION_DOWN){
//            ret = true;
//        }else {
//            ret = false;
//        }
        Log.w(TAG, "返回:" + ret);
        return ret;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i(TAG, "onTouchEvent: " + TouchEventUtil.getEvent(event.getAction()) + " return: super.onTouchEvent(event)");
        boolean ret = super.onTouchEvent(event);
        //Log.w(TAG, "返回:" + ret);
        return ret;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i(TAG, "dispatchTouchEvent: " + TouchEventUtil.getEvent(ev.getAction()) + " return: super.dispatchTouchEvent(ev)");
        boolean ret = super.dispatchTouchEvent(ev);
        //Log.w(TAG, "返回:" + ret);
        return ret;
    }
}
