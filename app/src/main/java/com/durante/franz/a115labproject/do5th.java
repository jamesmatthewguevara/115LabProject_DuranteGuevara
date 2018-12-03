package com.durante.franz.a115labproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class do5th extends AppCompatActivity {

    public final static String MESSAGE_KEY ="com.durante.franz.a115labproject.message_key";

    EditText tMsg;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dos5);


    }

    public void DoFinish (View v){



        Intent i = new Intent(this, enddo.class);

        startActivity(i);
    }
}
