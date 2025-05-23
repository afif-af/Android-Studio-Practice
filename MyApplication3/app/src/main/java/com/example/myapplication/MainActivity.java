package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox milkCheckBox,sugarCheckBox,waterCheckBox;
    private Button showButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milkCheckBox= (CheckBox)findViewById(R.id.milkText);
        sugarCheckBox=(CheckBox) findViewById((R.id.sugarText));
        waterCheckBox=(CheckBox)findViewById(R.id.waterText);

        showButton=(Button) findViewById(R.id.sugarText);
        resultTextView=(TextView) findViewById((R.id.resulTextViewId));


        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder stringBuilder=new StringBuilder();
                if(milkCheckBox.isChecked())
                {
                    String value =milkCheckBox.getText().toString();
                    stringBuilder.append(value + " is ordered ");
                }
                if(sugarCheckBox.isChecked())
                {
                    String value =sugarCheckBox.getText().toString();
                    stringBuilder.append(value + " is ordered ");
                }
                if(waterCheckBox.isChecked())
                {
                    String value =waterCheckBox.getText().toString();
                    stringBuilder.append(value + " is ordered ");
                }
                resultTextView.setText(stringBuilder);
            }
        });


    }
}