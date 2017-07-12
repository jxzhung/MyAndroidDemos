package com.jzhung.demos.activity.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

import com.jzhung.demos.R;

/**
 * Created by Jzhung on 2017/3/15.
 */

public class ViewPositionActivity extends Activity {
    private static final String TAG = "ViewPositionActivity";
    TextView tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_view_position);
        tv = (TextView) findViewById(R.id.tv);

        tv.setText("" + tv.getX());

        tv.post(new Runnable() {
            @Override
            public void run() {
                tv.setTranslationX(140f);
                tv.setText("getLeft:" + tv.getLeft() + " getX" + tv.getX());
            }
        });

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        String info = "Action:" + event.getAction()
                + "\nRawX:" + event.getRawX()
                +"\n____X:" + event.getX()
                +"\nRawY:" + event.getRawY()
                +"\n____Y:" + event.getY();
        tv.setText(info);
        //Log.i(TAG, info);
        return super.onTouchEvent(event);
    }
}
