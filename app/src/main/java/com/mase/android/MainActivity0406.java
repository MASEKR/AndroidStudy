package com.mase.android;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity0406 extends AppCompatActivity {
//    TextView tv1, tv2, tv3;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_0406);
//        tv1 = (TextView) findViewById(R.id.tv1);
//        tv2 = (TextView) findViewById(R.id.tv2);
//        tv3 = (TextView) findViewById(R.id.tv3);
//
//        tv1.setText("자바 코드로 변경하였습니다.");
//        tv2.setTextColor(Color.BLUE);
//        tv2.setTextSize(60);
//        tv3.setTextSize(60);
//        tv3.setTypeface(Typeface.SERIF, Typeface.ITALIC);
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_0406_2);
        ImageView imageview = (ImageView) findViewById(R.id.imageView);
        ImageButton button1 = (ImageButton) findViewById(R.id.imageButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageview.setImageResource(R.drawable.pic);
            }
        });
        ImageButton button2 = (ImageButton) findViewById(R.id.imageButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imageview.setImageResource(R.drawable.pic2);
            }
        }
        });
}
