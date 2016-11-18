package com.example.yurynoh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText num1, num2;
    Button op1_plus, op2_minus, op3_multiply, op4_divide, op5_modulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instantiate content components
        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        op1_plus  = (Button)findViewById(R.id.op1_plus);
        op2_minus = (Button)findViewById(R.id.op2_minus);
        op3_multiply = (Button)findViewById(R.id.op3_multiply);
        op4_divide = (Button)findViewById(R.id.op4_divide);
        op5_modulo = (Button)findViewById(R.id.op5_modulo);
        result = (TextView)findViewById(R.id.result);

        // assign click events to buttons
        op1_plus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double x = Double.parseDouble(num1.getText().toString());
                double y = Double.parseDouble(num2.getText().toString());

                result.setText(x + " + " + y + " = " + (double)(x+y));
            }
        });
        op2_minus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double x = Double.parseDouble(num1.getText().toString());
                double y = Double.parseDouble(num2.getText().toString());

                result.setText(x + " - " + y + " = " + (double)(x-y));
            }
        });
        op3_multiply.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double x = Double.parseDouble(num1.getText().toString());
                double y = Double.parseDouble(num2.getText().toString());

                result.setText(x + " * " + y + " = " + (double)(x*y));
            }
        });
        op4_divide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double x = Double.parseDouble(num1.getText().toString());
                double y = Double.parseDouble(num2.getText().toString());

                result.setText(x + " / " + y + " = " + (double)(x/y));
            }
        });
        op5_modulo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double x = Double.parseDouble(num1.getText().toString());
                double y = Double.parseDouble(num2.getText().toString());

                result.setText(x + " % " + y + " = " + (double)(x%y));
            }
        });
    }
}
