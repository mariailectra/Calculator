package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button2, button3, buttonSub, button4, button5, buttonAdd, buttonEqual ;
    EditText calculatorEditText;

    float mValueOne, mValueTwo ;

    boolean calculatorAddition, mSubtract, calculatorMultiplication, calculatorDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        calculatorEditText = (EditText) findViewById(R.id.edt1);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorEditText.setText(calculatorEditText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorEditText.setText(calculatorEditText.getText() + "3");
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(calculatorEditText.getText() + "");
                mSubtract = true;
                calculatorEditText.setText(null);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorEditText.setText(calculatorEditText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorEditText.setText(calculatorEditText.getText() + "5");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (calculatorEditText == null) {
                    calculatorEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(calculatorEditText.getText() + "");
                    calculatorAddition = true;
                    calculatorEditText.setText(null);
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(calculatorEditText.getText() + "");

                if (calculatorAddition == true) {
                    calculatorEditText.setText(mValueOne + mValueTwo + "");
                    calculatorAddition = false;
                }

                if (mSubtract == true) {
                    calculatorEditText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (calculatorMultiplication == true) {
                    calculatorEditText.setText(mValueOne * mValueTwo + "");
                    calculatorMultiplication = false;
                }

                if (calculatorDivision == true) {
                    calculatorEditText.setText(mValueOne / mValueTwo + "");
                    calculatorDivision = false;
                }
            }
        });


    }
}
