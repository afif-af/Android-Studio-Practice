package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView imageView1,imageView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1= (ImageView)findViewById(R.id.imageView1ID);
        imageView2=(ImageView)findViewById(R.id.imageView2ID);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.imageView1ID)
        {
            Toast.makeText(MainActivity.this,"Hamim ",Toast.LENGTH_SHORT).show();


        }
        if(v.getId()==R.id.imageView2ID)
        {
            Toast toast=Toast.makeText(MainActivity.this,"Tanzim ",Toast.LENGTH_SHORT);
             toast.show();

        }

    }
}