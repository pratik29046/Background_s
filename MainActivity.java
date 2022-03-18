package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2;
    Thread thread=null;
    boolean isRunning=true;
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

         thread=new Thread(new Runnable() {
             @Override
             public void run() {
                 while(isRunning) {
                     try {
                         thread.sleep(100);
                         if (view == btn1) {
                             Intent i = new Intent(getApplicationContext(), background.class);
                             startService(i);
                         }
                     } catch (Exception e) {
                         e.printStackTrace();
                     }

                 }

//
             }
         });
         thread.start();


//        if(view == btn1){
//            Intent i=new Intent(getApplicationContext(),background.class);
//            startService(i);
//        }
//        else if (view == btn2){
//            Intent i=new Intent(getApplicationContext(),background.class);
//            stopService(i);
//
//        }

    }
}