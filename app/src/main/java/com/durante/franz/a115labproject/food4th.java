package com.durante.franz.a115labproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class food4th extends AppCompatActivity {
    Button tbutton, tbutton2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foodstoeat4);
        tbutton= findViewById(R.id.Next1);
        tbutton2 = findViewById(R.id.Back1);
        //slidr = findViewById(R.id.slidable_content);
        //Slidr.attach(this);
    }
    public void FoodList5 (View v){
        Intent i = new Intent(this, food5th.class);
        startActivity(i);
    }
    public void FoodList3 (View v){
        Intent i = new Intent(this, food3rd.class);
        startActivity(i);
    }
}
