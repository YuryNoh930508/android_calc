package com.example.yurynoh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        View.OnClickListener clickButton = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String x_str = num1.getText().toString();
                String y_str = num2.getText().toString();

                if(x_str.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "num1 is empty", Toast.LENGTH_SHORT).show();
                } else if(y_str.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "num2 is empty", Toast.LENGTH_SHORT).show();
                } else {
                    double x = Double.parseDouble(x_str);
                    double y = Double.parseDouble(y_str);

                    switch (v.getId()) {
                        case R.id.op1_plus:
                            result.setText(x + " + " + y + " = " + (double)(x+y));
                            break;
                        case R.id.op2_minus:
                            result.setText(x + " - " + y + " = " + (double)(x-y));
                            break;
                        case R.id.op3_multiply:
                            result.setText(x + " * " + y + " = " + (double)(x*y));
                            break;
                        case R.id.op4_divide:
                            if(y_str.equals("0")) {
                                Toast.makeText(getApplicationContext(), "num1 can not be divided by 0", Toast.LENGTH_SHORT).show();
                            } else {
                                result.setText(x + " / " + y + " = " + (double) (x / y));
                            }
                            break;
                        case R.id.op5_modulo:
                            if(y_str.equals("0")) {
                                Toast.makeText(getApplicationContext(), "num1's remainder does not exist if num2 is 0", Toast.LENGTH_SHORT).show();
                            } else {
                                result.setText(x + " % " + y + " = " + (double) (x % y));
                            }
                            break;
                    }
                }
            }

        };

        // assign click events to buttons
        Button[] operator = new Button[]{op1_plus, op2_minus, op3_multiply, op4_divide, op5_modulo};

        for(int i=0;i<operator.length;i++) {
            operator[i].setOnClickListener(clickButton);
        }
    }
}
