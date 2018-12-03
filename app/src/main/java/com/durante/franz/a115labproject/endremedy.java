package com.durante.franz.a115labproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class endremedy extends AppCompatActivity {
    TextView tMsg;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.remediesdone);
        tMsg = findViewById(R.id.editText);
        SharedPreferences sp = getSharedPreferences("data", MODE_PRIVATE);
        String name = sp.getString("uname", null); // s = key, s1 = defvalue
        String message =  name + "!";
        tMsg.setText(message);

        //setContentView(textView);


    }
    public void Home (View v){

        Intent i = new Intent(this, listofcontents.class);
        startActivity(i);
    }
}
