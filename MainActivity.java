package com.example.background;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.start1);
        btn2=findViewById(R.id.stop);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        if(view == btn1){

            startService(new Intent( this,background.class ) );
        }
        else if (view == btn2){

            stopService(new Intent( this, background.class ) );

        }

    }
}