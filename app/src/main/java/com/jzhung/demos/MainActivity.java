package com.jzhung.demos;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.jzhung.demos.view.customview.MaoBiTextView;

import java.util.List;
import java.util.Map;

public class MainActivity extends Activity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mListView = (ListView) findViewById(R.id.lv);
//        mListView.setAdapter();

        /*MaoBiTextView mbTv = (MaoBiTextView) findViewById(R.id.mbTv);
        mbTv.setText("风一样的男人");
        mbTv.setTextSize(50);
        Typeface fontFace = Typeface.createFromAsset(getAssets(),
                "font/huawenxingkai.ttf");
        mbTv.setTypeface(fontFace);*/

    }

    class ListAdapter extends SimpleAdapter{

        public ListAdapter(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to) {
            super(context, data, resource, from, to);
        }


    }
}
