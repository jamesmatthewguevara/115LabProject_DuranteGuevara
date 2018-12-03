package com.durante.franz.a115labproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Name extends AppCompatActivity {
    //Button tbutton;
    EditText tMsg;
    TextView tname;
    String name;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entername);
       // tbutton= findViewById(R.id.dos);
        tname = findViewById(R.id.editText2);
    }
    public void saveData(View v) {
        name = tname.getText().toString();


        SharedPreferences sp = getSharedPreferences("data", MODE_PRIVATE); //paper
        SharedPreferences.Editor writer = sp.edit(); //pen
        writer.putString("uname", name);

        writer.commit();
        Toast.makeText(this, "Welcome to our app, " + name, Toast.LENGTH_LONG).show();
        Intent i = new Intent(this, listofcontents.class);

        startActivity(i);
    }
}
