package com.jzhung.demos.anim.viewanimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.jzhung.demos.R;

public class AnimationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        //缩放动画
        final Animation scaleAnim = AnimationUtils.loadAnimation(this, R.anim.scale);
        TextView animTv = (TextView) findViewById(R.id.animTv);
        animTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(scaleAnim);
            }
        });
    }
}
