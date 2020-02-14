package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7,
            button8, button9, buttonAdd, buttonSub, buttonDivision, buttonMul,
            button10, buttonC, buttonEqual, buttonAC, buttonRoot, buttonSquare;

    TextView crunchifyTextView;

    float mValueOne, mValueTwo;

    boolean crunchifyAddition = false, mSubtract = false, crunchifyMultiplication = false,
            crunchifyDivision = false, crunchifyTakeRoot = false, crunchifyExponentiation = false, isError = false;
    String operation;

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
                if(crunchifyTextView.getText().equals("0") || isError){
                    crunchifyTextView.setText("1");
                    isError=false;
                }
                else crunchifyTextView.setText(crunchifyTextView.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(crunchifyTextView.getText().equals("0") || isError){
                    crunchifyTextView.setText("2");
                    isError=false;
                }
                else crunchifyTextView.setText(crunchifyTextView.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(crunchifyTextView.getText().equals("0") || isError){
                    crunchifyTextView.setText("3");
                    isError=false;
                }
                else crunchifyTextView.setText(crunchifyTextView.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(crunchifyTextView.getText().equals("0") || isError){
                    crunchifyTextView.setText("4");
                    isError=false;
                }
                else crunchifyTextView.setText(crunchifyTextView.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(crunchifyTextView.getText().equals("0") || isError){
                    crunchifyTextView.setText("5");
                    isError=false;
                }
                else crunchifyTextView.setText(crunchifyTextView.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(crunchifyTextView.getText().equals("0") || isError){
                    crunchifyTextView.setText("6");
                    isError=false;
                }
                else crunchifyTextView.setText(crunchifyTextView.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(crunchifyTextView.getText().equals("0") || isError){
                    crunchifyTextView.setText("7");
                    isError=false;
                }
                else crunchifyTextView.setText(crunchifyTextView.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(crunchifyTextView.getText().equals("0") || isError){
                    crunchifyTextView.setText("8");
                    isError=false;
                }
                else crunchifyTextView.setText(crunchifyTextView.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(crunchifyTextView.getText().equals("0") || isError){
                    crunchifyTextView.setText("9");
                    isError=false;
                }
                else crunchifyTextView.setText(crunchifyTextView.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!crunchifyTextView.getText().equals("0") || isError){
                    crunchifyTextView.setText(crunchifyTextView.getText() + "0");
                    isError=false;
                }
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!crunchifyTextView.getText().equals("") && crunchifyAddition == false) {
                    operation += "+";
                    mValueOne = Float.parseFloat(crunchifyTextView.getText() + "");
                    crunchifyAddition = true;
                    crunchifyTextView.setText(null);
                }
                else operation += "+";
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!crunchifyTextView.getText().equals("") && mSubtract == false){
                    operation += "-";
                    mValueOne = Float.parseFloat(crunchifyTextView.getText() + "");
                    mSubtract = true;
                    crunchifyTextView.setText(null);
                }
                else operation += "-";
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!crunchifyTextView.getText().equals("") && crunchifyMultiplication == false){
                    operation += "*";
                    mValueOne = Float.parseFloat(crunchifyTextView.getText() + "");
                    crunchifyMultiplication = true;
                    crunchifyTextView.setText(null);
                }
                else operation += "*";
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!crunchifyTextView.getText().equals("") && crunchifyDivision == false){
                    operation += "/";
                    mValueOne = Float.parseFloat(crunchifyTextView.getText() + "");
                    crunchifyDivision = true;
                    crunchifyTextView.setText(null);
                }
                else operation += "/";
            }
        });

        buttonRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!crunchifyTextView.getText().equals("") && crunchifyTakeRoot == false){
                    operation += "v";
                    mValueOne = Float.parseFloat(crunchifyTextView.getText() + "");
                    crunchifyTakeRoot = true;
                }
                else operation += "v";
            }
        });

        buttonSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!crunchifyTextView.getText().equals("") && crunchifyExponentiation == false){
                    operation += "s";
                    mValueOne = Float.parseFloat(crunchifyTextView.getText() + "");
                    crunchifyExponentiation = true;
                }
                else operation += "s";
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!crunchifyTextView.getText().equals("")){
                    mValueTwo = Float.parseFloat(crunchifyTextView.getText() + "");
                    NumberFormat nf = new DecimalFormat("#.######");

                    if (crunchifyAddition == true && operation.charAt(operation.length() - 1) == '+') {
                        crunchifyTextView.setText(nf.format(mValueOne + mValueTwo));
                        crunchifyAddition = false;
                    }

                    if (mSubtract == true  && operation.charAt(operation.length() - 1) == '-') {
                        crunchifyTextView.setText(nf.format(mValueOne - mValueTwo));
                        mSubtract = false;
                    }

                    if (crunchifyMultiplication == true  && operation.charAt(operation.length() - 1) == '*') {
                        crunchifyTextView.setText(nf.format(mValueOne * mValueTwo));
                        crunchifyMultiplication = false;
                    }

                    if (crunchifyDivision == true && operation.charAt(operation.length() - 1) == '/'){
                        crunchifyTextView.setText(nf.format(mValueOne / mValueTwo));
                        crunchifyDivision = false;
                    }

                    if (crunchifyTakeRoot == true  && operation.charAt(operation.length() - 1) == 'v') {
                        crunchifyTextView.setText(nf.format(Math.sqrt(mValueOne)));
                        crunchifyTakeRoot = false;
                    }

                    if (crunchifyExponentiation == true  && operation.charAt(operation.length() - 1) == 's') {
                        crunchifyTextView.setText(nf.format(mValueOne * mValueOne));
                        crunchifyExponentiation = false;
                    }
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!crunchifyTextView.getText().equals("")){
                    String s = crunchifyTextView.getText().toString();
                    s = s.substring(0, s.length()-1);
                    crunchifyTextView.setText(s);
                }
            }
        });

        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!crunchifyTextView.getText().equals("")){
                    crunchifyTextView.setText("");
                }
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