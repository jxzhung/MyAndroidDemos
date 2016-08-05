package com.jzhung.demos;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;

import com.jzhung.demos.view.customview.MaoBiTextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MaoBiTextView mbTv = (MaoBiTextView) findViewById(R.id.mbTv);
        mbTv.setText("风一样的男人");
        mbTv.setTextSize(50);
        Typeface fontFace = Typeface.createFromAsset(getAssets(),
                "font/huawenxingkai.ttf");
        mbTv.setTypeface(fontFace);
        //setContentView(mbTv);
        /*
       Intent intent = new Intent(this, com.jzhung.demos.view.event_transfer.MainActivity.class);
        startActivity(intent);*/
    }
}
