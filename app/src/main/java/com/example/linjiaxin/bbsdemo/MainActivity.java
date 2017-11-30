package com.example.linjiaxin.bbsdemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by linjiaxin on 2017/11/29.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        ImageView mimageView = (ImageView) findViewById(R.id.head_pic);
        Bitmap mbitmap = BlurBitmap.blur(this, BitmapFactory.decodeResource(getResources(),R.drawable.title_page));
        mimageView.setImageBitmap(mbitmap);
    }
}
