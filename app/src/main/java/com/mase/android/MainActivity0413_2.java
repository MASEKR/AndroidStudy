package com.mase.android;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity0413_2 extends AppCompatActivity {
    ImageView imageview1, imageview2, imageview3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0413_2);
        imageview1 = (ImageView) findViewById(R.id.imageView1);
        imageview2 = (ImageView) findViewById(R.id.imageView2);
        imageview3 = (ImageView) findViewById(R.id.imageView3);

    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.checkBox:
                if (checked) imageview1.setImageResource(R.drawable.sand1);
                else imageview1.setImageResource(0);
                break;
            case R.id.checkBox2:
                if (checked) imageview2.setImageResource(R.drawable.sand2);
                else imageview2.setImageResource(0);
                break;
            case R.id.checkBox3:
                if (checked) imageview3.setImageResource(R.drawable.sand3);
                else imageview3.setImageResource(0);
                break;
        }
    }
}
