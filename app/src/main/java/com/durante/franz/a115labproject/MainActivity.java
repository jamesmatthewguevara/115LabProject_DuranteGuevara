package com.durante.franz.a115labproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button tbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tbutton= findViewById(R.id.button);
    }
    public void nextActivity(View v) {
        Intent i = new Intent(this, Name.class);
        startActivity(i);
    }

}
