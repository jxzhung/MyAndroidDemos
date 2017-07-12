package com.jzhung.demos.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.jzhung.demos.R;
import com.jzhung.demos.anim.viewanimation.AnimationActivity;
import com.jzhung.demos.view.customview.PathTestActivity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";
    private LinearLayout contentLL;
    private Map<String, Class> activityMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        initBtns();
        Handler handler = new Handler();
        handler.obtainMessage();
//        BatteryView battery = new BatteryView(this);
//        battery.setBatteryOrientation(BatteryView.BatteryOrientation.HORIZONTAL);
//        contentLL.addView(battery);
        //contentLL.addView(new CustomView1(this));
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "onDestroy: ");
        super.onDestroy();
    }

    private void initBtns() {
        activityMap = new HashMap<>();
        activityMap.put("缩放动画", AnimationActivity.class);
        activityMap.put("Path效果测试", PathTestActivity.class);


        Set<String> btnNames = activityMap.keySet();
        for (final String btnName : btnNames) {
            addButton(btnName, new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity(activityMap.get(btnName));
                }
            });
        }
    }

    private void findViews() {
        contentLL = (LinearLayout) findViewById(R.id.contentLL);
    }

    private void addButton(String text, View.OnClickListener onClick) {
        Button btn = new Button(this);
        btn.setTextColor(Color.BLACK);
        btn.setText(text);
        btn.setOnClickListener(onClick);
        contentLL.addView(btn);
    }

    private void openActivity(Class target) {
        startActivity(new Intent(this, target));
    }

}
