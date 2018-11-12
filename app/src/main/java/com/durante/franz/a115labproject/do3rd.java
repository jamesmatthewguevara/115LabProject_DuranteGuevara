package com.durante.franz.a115labproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class do3rd extends AppCompatActivity {
    Button tbutton, tbutton2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dos3);
        tbutton= findViewById(R.id.Next3);
        tbutton2 = findViewById(R.id.Back3);
    }
    public void DosList4(View v){
        Intent i = new Intent(this, do4th.class);
        startActivity(i);
    }
    public void DosList2 (View v){
        Intent i = new Intent(this, do2nd.class);
        startActivity(i);
    }
}
