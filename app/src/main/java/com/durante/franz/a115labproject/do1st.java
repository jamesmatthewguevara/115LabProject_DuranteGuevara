package com.durante.franz.a115labproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

public class do1st extends AppCompatActivity {

    //private SlidrInterface slidr;
    Button tbutton, tbutton2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dos1);
        tbutton= findViewById(R.id.Next1);
        tbutton2 = findViewById(R.id.Back1);
        //slidr = findViewById(R.id.slidable_content);
        //Slidr.attach(this);
    }

    public void DosList2 (View v){
        Intent i = new Intent(this, do2nd.class);
        startActivity(i);
    }
    public void Home (View v){
        Intent i = new Intent(this, listofcontents.class);
        startActivity(i);
    }


}
