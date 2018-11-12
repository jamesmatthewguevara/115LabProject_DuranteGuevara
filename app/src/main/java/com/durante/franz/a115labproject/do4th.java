package com.durante.franz.a115labproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class do4th extends AppCompatActivity {
    Button tbutton, tbutton2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dos4);
        tbutton= findViewById(R.id.Next4);
        tbutton2 = findViewById(R.id.Back4);

    }
    public void DosList5(View v){
        Intent i = new Intent(this, do5th.class);
        startActivity(i);
    }
    public void DosList3(View v){
        Intent i = new Intent(this, do3rd.class);
        startActivity(i);
    }

}
