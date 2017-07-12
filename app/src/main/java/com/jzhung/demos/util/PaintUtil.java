package com.jzhung.demos.util;

import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by Jzhung on 2016/8/11.
 */

public class PaintUtil {
    public static Paint getPaint(){
        return getPaint(Color.RED);
    }

    public static Paint getPaint(int color){
        Paint paint = new Paint();
        paint.setColor(color);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        return paint;
    }
}
