package com.durante.franz.a115labproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class dont2nd extends AppCompatActivity {
    Button tbutton, tbutton2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donts2);
        tbutton= findViewById(R.id.Next1);
        tbutton2 = findViewById(R.id.Back1);
        //slidr = findViewById(R.id.slidable_content);
        //Slidr.attach(this);
    }

    public void DontsList3 (View v){
        Intent i = new Intent(this, dont3rd.class);
        startActivity(i);
    }
    public void DontsList1 (View v){
        Intent i = new Intent(this, dont1st.class);
        startActivity(i);
    }

}
