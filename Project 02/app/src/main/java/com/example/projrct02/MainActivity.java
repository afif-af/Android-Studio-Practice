package com.example.projrct02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText editText1,editText2;
    private Button addButton,subButton;
    private  TextView resultTextView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 =(EditText) findViewById(R.id.ediText1Id);
        editText2=(EditText) findViewById(R.id.ediText2Id);
        addButton=(Button) findViewById(R.id.addButtonId);
        subButton=(Button) findViewById(R.id.subButtonId);
        resultTextView = (TextView) findViewById(R.id.resultTextViewId);
        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        try{

            String number1= editText1.getText().toString();
            String number2 = editText2.getText().toString();
            //conver string to double

            double num1 =Double.parseDouble(number1);
            double num2= Double.parseDouble(number2);

            if(v.getId()==R.id.addButtonId)
            {
                double sum=num1+num2;
                resultTextView.setText("Result is: "+sum);
            }
            if(v.getId()==R.id.subButtonId)
            {
                double sum=num1-num2;
                resultTextView.setText("Result is: "+sum);

            }


        }catch (Exception e)
        {
            Toast toast=Toast.makeText(MainActivity.this,"Please Enter Numbers ",Toast.LENGTH_SHORT);
            toast.show();

        }

    }
}