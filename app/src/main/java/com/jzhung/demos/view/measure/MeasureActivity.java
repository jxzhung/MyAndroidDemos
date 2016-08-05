package com.jzhung.demos.view.measure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MeasureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = new MeasureView(this);
        setContentView(view);
    }
}
