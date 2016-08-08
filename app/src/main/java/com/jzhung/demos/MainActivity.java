package com.jzhung.demos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.jzhung.demos.anim.viewanimation.AnimationActivity;

public class MainActivity extends Activity {
    private LinearLayout contentLL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        initBtns();
    }

    private void initBtns() {
        addButton("缩放动画", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity(AnimationActivity.class);
            }
        });
    }

    private void findViews() {
        contentLL = (LinearLayout) findViewById(R.id.contentLL);
    }

    private void addButton(String text, View.OnClickListener onClick) {
        Button btn = new Button(this);
        btn.setText(text);
        btn.setOnClickListener(onClick);
        contentLL.addView(btn);
    }

    private void openActivity(Class target){
        startActivity(new Intent(this, target));
    }

//    private void textUseCustomeFont(){
//        MaoBiTextView mbTv = (MaoBiTextView) findViewById(R.id.mbTv);
//        mbTv.setText("风一样的男人");
//        mbTv.setTextSize(50);
//        Typeface fontFace = Typeface.createFromAsset(getAssets(),
//                "font/huawenxingkai.ttf");
//        mbTv.setTypeface(fontFace);
//    }
}
