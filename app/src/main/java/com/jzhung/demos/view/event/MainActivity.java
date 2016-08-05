package com.jzhung.demos.view.event;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jzhung.demos.R;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_transfer_main);
        View view = findViewById(android.R.id.content);
        View frameView = view.getRootView();
        ViewGroup frameVg = (ViewGroup)frameView;
        Log.i(TAG, "onCreate: " + frameVg);

        final TextView tv = (TextView) findViewById(R.id.tv);
        tv.post(new Runnable() {
            @Override
            public void run() {
                tv.setText("高：" + tv.getHeight()+" 宽：" + tv.getWidth());
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.v(TAG, "---------Activity dispatchTouchEvent:" + TouchEventUtil.getEvent(ev.getAction()));
        boolean ret = super.dispatchTouchEvent(ev);
        return ret;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean ret = super.onTouchEvent(event);
        Log.v(TAG, "onTouchEvent: " + TouchEventUtil.getEvent(event.getAction())  + " return:" + ret);
        return ret;
    }
}
