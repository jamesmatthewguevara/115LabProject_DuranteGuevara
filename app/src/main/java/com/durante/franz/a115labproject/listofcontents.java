package com.durante.franz.a115labproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class listofcontents extends AppCompatActivity {
    Button tbutton;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_contents);
        tbutton= findViewById(R.id.dos);
    }
    public void DosList(View v) {
        Intent i = new Intent(this, do1st.class);
        startActivity(i);
    }
}
