package com.jzhung.demos.view.customview;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.jzhung.demos.util.PaintUtil;

/**
 * Created by Jzhung on 2016/8/11.
 */

public class CustomeProgresbar extends View {
    private int mFirstColor;
    private int mSecondColor;

    private int lineWidth;//线宽
    private int mProgress;//进度

    private int sleepTime;
    private Paint mPaint;

    public CustomeProgresbar(Context context) {
        super(context);
        mPaint = PaintUtil.getPaint();
    }

    public CustomeProgresbar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomeProgresbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


}
