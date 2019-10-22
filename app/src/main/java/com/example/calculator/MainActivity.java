package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button2, button3, buttonSub ;
    EditText calculatorEditText;

    float mValueOne ;

    boolean mSubtract;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        buttonSub = (Button) findViewById(R.id.buttonsub);

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


    }
}
