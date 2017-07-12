package com.jzhung.demos.activity.shape;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Jzhung on 2017/3/15.
 */

public class ShapeView extends View {
    public ShapeView(Context context) {
        super(context);
    }

    public ShapeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Shape shape = new Shape() {
            @Override
            public void draw(Canvas canvas, Paint paint) {

            }
        };
    }
}
