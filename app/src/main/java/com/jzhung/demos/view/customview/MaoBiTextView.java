package com.jzhung.demos.view.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Jzhung on 2016/8/4.
 */

public class MaoBiTextView extends TextView {
    public MaoBiTextView(Context context) {
        super(context);
    }

    public MaoBiTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MaoBiTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint=new Paint();
        paint.setColor(getCurrentTextColor());  //设置画笔颜色
        String aline = getText().toString();
        paint.setTypeface(getTypeface());
        float tsize = getTextSize();
        paint.setTextSize(getTextSize());

        float[] pos = new float[2 * aline.length()];

        float bx = 80;
        float by = 0;
        float xOffset = 0;

        char curChar;
        for (int i = 0; i < pos.length; i++) {
            //curChar = aline.charAt(i);
            /*if("，".equals(curChar+"") || "。".equals(curChar+"") ){
                xOffset += tsize;
            }*/

            if(i%2 == 0){
                pos[i] = bx + xOffset;
            }else{
                pos[i] = by + tsize + tsize/2*i;
            }

        }
        canvas.drawPosText(aline, pos, paint);

    }
}
