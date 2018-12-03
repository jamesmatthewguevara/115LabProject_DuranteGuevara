package com.durante.franz.a115labproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class dont5th extends AppCompatActivity {
    Button tbutton, tbutton2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donts5);

        //slidr = findViewById(R.id.slidable_content);
        //Slidr.attach(this);
    }
    public void DontFinish (View v){
        Intent i = new Intent(this, enddont.class);
        startActivity(i);
    }

}
