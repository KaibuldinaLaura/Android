package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual, buttonAC, buttonRoot, buttonSquare;
    TextView crunchifyTextView;

    float mValueOne, mValueTwo;

    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision, crunchifyTakeRoot, crunchifyExponentiation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        buttonAC = (Button) findViewById(R.id.buttonAC);
        buttonRoot = (Button) findViewById(R.id.buttonRoot);
        buttonSquare = (Button) findViewById(R.id.buttonSquare);
        crunchifyTextView = (TextView) findViewById(R.id.textView);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(crunchifyTextView.getText().equals("0")){
                    crunchifyTextView.setText("1");
                }
                else crunchifyTextView.setText(crunchifyTextView.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(crunchifyTextView.getText().equals("0")){
                    crunchifyTextView.setText("2");
                }
                else crunchifyTextView.setText(crunchifyTextView.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(crunchifyTextView.getText().equals("0")){
                    crunchifyTextView.setText("3");
                }
                else crunchifyTextView.setText(crunchifyTextView.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(crunchifyTextView.getText().equals("0")){
                    crunchifyTextView.setText("4");
                }
                else crunchifyTextView.setText(crunchifyTextView.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(crunchifyTextView.getText().equals("0")){
                    crunchifyTextView.setText("5");
                }
                else crunchifyTextView.setText(crunchifyTextView.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(crunchifyTextView.getText().equals("0")){
                    crunchifyTextView.setText("6");
                }
                else crunchifyTextView.setText(crunchifyTextView.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(crunchifyTextView.getText().equals("0")){
                    crunchifyTextView.setText("7");
                }
                else crunchifyTextView.setText(crunchifyTextView.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(crunchifyTextView.getText().equals("0")){
                    crunchifyTextView.setText("8");
                }
                else crunchifyTextView.setText(crunchifyTextView.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(crunchifyTextView.getText().equals("0")){
                    crunchifyTextView.setText("9");
                }
                else crunchifyTextView.setText(crunchifyTextView.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!crunchifyTextView.getText().equals("0")){
                    crunchifyTextView.setText(crunchifyTextView.getText() + "0");
                }
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (crunchifyTextView == null) {
                    crunchifyTextView.setText("");
                } else {
                    mValueOne = Float.parseFloat(crunchifyTextView.getText() + "");
                    crunchifyAddition = true;
                    crunchifyTextView.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyTextView.getText() + "");
                mSubtract = true;
                crunchifyTextView.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyTextView.getText() + "");
                crunchifyMultiplication = true;
                crunchifyTextView.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyTextView.getText() + "");
                crunchifyDivision = true;
                crunchifyTextView.setText(null);
            }
        });

        buttonRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyTextView.getText() + "");
                crunchifyTakeRoot = true;
            }
        });

        buttonSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyTextView.getText() + "");
                crunchifyExponentiation = true;
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(crunchifyTextView.getText() + "");

                if (crunchifyAddition == true) {
                    crunchifyTextView.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                }

                if (mSubtract == true) {
                    crunchifyTextView.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) {
                    crunchifyTextView.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {
                    crunchifyTextView.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }

                if (crunchifyTakeRoot == true) {
                    crunchifyTextView.setText(Math.sqrt(mValueOne) + "");
                    crunchifyTakeRoot = false;
                }

                if (crunchifyExponentiation == true) {
                    crunchifyTextView.setText(mValueOne * mValueOne + "");
                    crunchifyExponentiation = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = crunchifyTextView.getText().toString();
                s = s.substring(0, s.length()-1);
                crunchifyTextView.setText(s);
            }
        });

        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyTextView.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!crunchifyTextView.getText().toString().contains(".")) {
                    if (crunchifyTextView.getText().equals("")) {
                        crunchifyTextView.setText(crunchifyTextView.getText() + "0.");
                    } else crunchifyTextView.setText(crunchifyTextView.getText() + ".");
                }
            }
        });
    }
}
