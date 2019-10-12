package com.peacewebsoft.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_Add, btn_Sub, btn_Mul, btn_Div, btn_calc, btn_dec, btn_clear, btn_singleDelete;
    EditText ed1;


    float Value1, Value2, Value3 ;
    int one,two,three;
    Float answer, secondValue;

    boolean mAddition, mSubtract, mMultiplication, mDivision;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_Add = (Button) findViewById(R.id.btn_Add);
        btn_Div = (Button) findViewById(R.id.btn_Div);
        btn_Sub = (Button) findViewById(R.id.btn_Sub);
        btn_Mul = (Button) findViewById(R.id.btn_Mul);
        btn_calc = (Button) findViewById(R.id.btn_calc);
        btn_dec = (Button) findViewById(R.id.btn_dec);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_singleDelete=(Button) findViewById(R.id.btn_singleDelete);
        ed1 = (EditText) findViewById(R.id.edText1);




        btn_singleDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length=ed1.getText().length();
                if (length >0){
                    ed1.getText().delete(length -1,length);
                }
            }
        });


            btn_0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(ed1.getText()+"0");
                }
            });


        try {
            btn_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(ed1.getText()+"1");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            btn_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(ed1.getText()+"2");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            btn_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(ed1.getText()+"3");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });

        try {
            btn_5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(ed1.getText()+"5");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            btn_6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(ed1.getText()+"6");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            btn_7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(ed1.getText()+"7");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            btn_8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(ed1.getText()+"8");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            btn_9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(ed1.getText()+"9");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            btn_dec.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(ed1.getText()+".");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            btn_Add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (ed1 == null){
                        ed1.setText("");
                    }else {

                        if (ed1.getText().length() > 0) {

                            Value1 = Float.parseFloat(ed1.getText().toString() +"");


                            mAddition = true;
                            ed1.setText(Value1+Value2 +"");

                            ed1.setText(null);

                        } else {
                            Toast.makeText(MainActivity.this, "Test", Toast.LENGTH_SHORT);
                        }
                    }
                }
            });
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
//comment

        try {
            btn_Sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ed1.getText().length()>0) {
//                        Value1 = Float.parseFloat(ed1.getText().toString() + "");
                        mSubtract = true;
                       ed1.setText(Value1-Value2 +"");
                        calculate();

                    }else {

                        Toast.makeText(MainActivity.this, "Test", Toast.LENGTH_SHORT).show();
                    }
                }

            });
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        try {
            btn_Mul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ed1.getText().length()>0) {
                        Value1 = Float.parseFloat(ed1.getText().toString() );
                        mMultiplication = true;
                        ed1.setText(null);
                    }else {
                        Toast.makeText(MainActivity.this, "Test", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        try {
            btn_Div.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ed1.getText().length()>0) {
                        Value1 = Float.parseFloat(ed1.getText().toString() + "");
                        mDivision = true;
                        ed1.setText(null);
                    }else{
                        Toast.makeText(MainActivity.this, "Test", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


        try {
            btn_calc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(String.valueOf(answer));
                   // answer=null;

                }
            });
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
        }


        try {
            btn_clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText("");
                }
            });
            Value1=0;
            Value2=0;
           // answer=null;
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    void calculate(){
        if (ed1.getText().length()>0) {


            Value2 = Float.parseFloat(ed1.getText().toString());

            if (mAddition == true) {


                ed1.setText(Value1 + Value2 + "");

                mAddition = false;


            }


            if (mSubtract) {
                if(answer==null){
                    answer = Float.parseFloat(ed1.getText().toString());
                }else{
                    answer -= Float.parseFloat(ed1.getText().toString());
                }
                //ed1.setText(String.valueOf(answer));
                mSubtract = false;
                ed1.setText(String.valueOf(answer));
            }

            if (mMultiplication == true) {
                ed1.setText(Value1 * Value2 + "");
                mMultiplication = false;
            }

            if (mDivision == true) {
                ed1.setText(Value1 / Value2 + "");
                mDivision = false;
            }
        }else {
            Toast.makeText(MainActivity.this, "Test", Toast.LENGTH_SHORT);
        }
    }
}
