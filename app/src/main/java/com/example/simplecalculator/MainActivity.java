package com.example.simplecalculator;

import static android.view.View.*;
import static com.example.simplecalculator.R.id.btn5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt_result=findViewById(R.id.txt1);
        EditText editText1=findViewById(R.id.txt2);
        EditText editText2=findViewById(R.id.txt3);
        Button btn_sum=findViewById(R.id.btn1);
        Button btn_mul=findViewById(R.id.btn2);
        Button btn_diff=findViewById(R.id.btn3);
        Button btn_div=findViewById(R.id.btn4);
        Button btn_equal=findViewById(R.id.btn6);
        Button btn_clear=findViewById(R.id.btn5);
        btn_sum.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 =Double.parseDouble(editText1.getText().toString());
                double num2 =Double.parseDouble(editText2.getText().toString());
                double sum = num1 + num2;
                txt_result.setText(Double.toString(sum));
            }
        });

        Button btn_clear=findViewById(R.id.btn5);
        btn_clear.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText("");
                editText2.setText("");
            }
        }









    }
}