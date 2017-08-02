package com.example.androidsunsun.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import java.lang.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mNumber1;
    EditText mNumber2;
    TextView mTextView;
    public double num1;
    public double num2;
    public double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 =(Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 =(Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 =(Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4 =(Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);

        mNumber1 = (EditText)findViewById(R.id.number1);
        mNumber2 = (EditText)findViewById(R.id.number2);
        mTextView = (TextView)findViewById(R.id.textView);
    }
    @Override
    public void onClick(View v){
        num1 = Double.parseDouble(this.mNumber1.getText().toString());
        num2 = Double.parseDouble(this.mNumber2.getText().toString());

        this.result = 0.0;
        if(v.getId()== R.id.button1){
            result = num1 + num2 ;
        }else if(v.getId()== R.id.button2){
            result = num1 - num2;
        }else if(v.getId()== R.id.button3){
            result = num1 * num2;
        }else if(v.getId()== R.id.button4){
            result = num1 / num2;
        }
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("VALUE1",result);
        startActivity(intent);
    }
}
