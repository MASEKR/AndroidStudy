package com.mase.android;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_cal3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout container = new LinearLayout(this);
        container.setOrientation(LinearLayout.VERTICAL);

        LinearLayout firstNumLayout = new LinearLayout(this);
        firstNumLayout.setOrientation(LinearLayout.HORIZONTAL);
        TextView firstNumberText = new TextView(this);
        firstNumberText.setText("첫번째 숫자: ");
        firstNumLayout.addView(firstNumberText);
        EditText number1Field = new EditText(this);
        number1Field.setInputType(InputType.TYPE_CLASS_NUMBER);
        firstNumLayout.addView(number1Field);
        container.addView(firstNumLayout);

        LinearLayout secondNumLayout = new LinearLayout(this);
        secondNumLayout.setOrientation(LinearLayout.HORIZONTAL);
        TextView secondNumberText = new TextView(this);
        secondNumberText.setText("두번째 숫자: ");
        secondNumLayout.addView(secondNumberText);
        EditText number2Field = new EditText(this);
        number2Field.setInputType(InputType.TYPE_CLASS_NUMBER);
        secondNumLayout.addView(number2Field);
        container.addView(secondNumLayout);

        Button addBtn = new Button(this);
        addBtn.setText("더하기");
        container.addView(addBtn);

        Button subBtn = new Button(this);
        subBtn.setText("빼기");
        container.addView(subBtn);

        Button mulBtn = new Button(this);
        mulBtn.setText("곱하기");
        container.addView(mulBtn);

        Button divBtn = new Button(this);
        divBtn.setText("나누기");
        container.addView(divBtn);

        TextView resField = new TextView(this);
        resField.setText("결과: ");
        container.addView(resField);

        addBtn.setOnClickListener(v -> {
            double num1 = Double.parseDouble(number1Field.getText().toString());
            double num2 = Double.parseDouble(number2Field.getText().toString());
            double result = num1 + num2;
            resField.setText("결과: " + result);
        });

        subBtn.setOnClickListener(v -> {
            double num1 = Double.parseDouble(number1Field.getText().toString());
            double num2 = Double.parseDouble(number2Field.getText().toString());
            double result = num1 - num2;
            resField.setText("결과: " + result);
        });

        mulBtn.setOnClickListener(v -> {
            double num1 = Double.parseDouble(number1Field.getText().toString());
            double num2 = Double.parseDouble(number2Field.getText().toString());
            double result = num1 * num2;
            resField.setText("결과: " + result);
        });

        divBtn.setOnClickListener(v -> {
            double num1 = Double.parseDouble(number1Field.getText().toString());
            double num2 = Double.parseDouble(number2Field.getText().toString());
            if (num2 != 0) {
                double result = num1 / num2;
                resField.setText("결과: " + result);
            } else {
                resField.setText("오류: 0으로 나눌 수 없습니다.");
            }
        });

        setContentView(container);
    }
}
