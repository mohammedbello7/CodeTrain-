package com.peacewebsoft.calculatorapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        private Button zero;
        private Button one;
        private Button two;
        private Button three;
        private Button four;
        private Button five;
        private Button six;
        private Button seven;
        private Button eight;
        private Button nine;
        private Button add;
        private Button sub;
        private Button mul;
        private Button div;
        private Button clear;

        private Button  equal;

        private TextView info;
        private TextView result;
        private final char ADDITION ='+';
        private final  char SUBTRACTION='-';
        private final char MULTIPLICATION ='*';
        private final  char DIVISION='/';
        private final char EQU =0;
        private double val1=Double.NaN;
        private double val2;
        private char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpUIView();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().length() >0){
                    compute();
                    ACTION=ADDITION;
                    result.setText(String.valueOf(val1) + "+");
                    info.setText(null);
                }else{
                    Toast.makeText(MainActivity.this, "Test", Toast.LENGTH_SHORT);
                }

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().length() >0) {
                    compute();
                    ACTION = SUBTRACTION;
                    result.setText(String.valueOf(val1) + "-");
                    info.setText(null);
                }else{
                    Toast.makeText(MainActivity.this, "Test", Toast.LENGTH_SHORT);
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().length() >0) {
                    compute();
                    ACTION = MULTIPLICATION;
                    result.setText(String.valueOf(val1) + "*");
                    info.setText(null);
                }else{
                    Toast.makeText(MainActivity.this, "Test", Toast.LENGTH_SHORT);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().length() >0) {
                compute();
                ACTION=DIVISION;
                result.setText(String.valueOf(val1) + "/");
                info.setText(null);
                }else{
                    Toast.makeText(MainActivity.this, "Test", Toast.LENGTH_SHORT);
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().length() >0) {
                compute();
                ACTION=EQU;
                result.setText(result.getText().toString() + String.valueOf(val2) +"="+ String.valueOf(val1));
               // 5+4=9;
                info.setText(null);
                }else{
                    Toast.makeText(MainActivity.this, "Test", Toast.LENGTH_SHORT);
                }
            }

        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (info.getText().length()>0){
                    CharSequence name= info.getText().toString();
                    info.setText(name.subSequence(0,name.length() -1));

                }else {
                    val1=Double.NaN;
                    val2=Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }
            }
        });
    }
    private void setUpUIView(){
        one=(Button)findViewById(R.id.btn_1);
        zero=(Button)findViewById(R.id.btn_0);
        two=(Button)findViewById(R.id.btn_2);
        three=(Button)findViewById(R.id.btn_3);
        four=(Button)findViewById(R.id.btn_4);
        five=(Button)findViewById(R.id.btn_5);
        six=(Button)findViewById(R.id.btn_6);
        seven=(Button)findViewById(R.id.btn_7);
        eight=(Button)findViewById(R.id.btn_8);
        nine=(Button)findViewById(R.id.btn_9);
        add=(Button)findViewById(R.id.btn_Add);
        sub=(Button)findViewById(R.id.btn_Sub);
        mul=(Button)findViewById(R.id.btn_Mul);
        div=(Button)findViewById(R.id.btn_Div);
        clear=(Button)findViewById(R.id.btn_clear);

        equal=(Button) findViewById(R.id.btn_calc) ;

        info=(TextView)findViewById(R.id.textViewControl);
        result=(TextView)findViewById(R.id.textViewResult);

    }

    private void compute(){
        if (!Double.isNaN(val1)){
            val2=Double.parseDouble( info.getText().toString());

            switch(ACTION){
                case ADDITION:
                    val1=val1 + val2;
                    break;
                case SUBTRACTION:
                    val1=val1 - val2;
                    break;
                case MULTIPLICATION:
                    val1=val1 * val2;
                    break;
                case DIVISION:
                    val1=val1 / val2;
                    break;
                case EQU:
                    break;
            }
        }else {
            val1=Double.parseDouble(info.getText().toString());
        }
    }
}
