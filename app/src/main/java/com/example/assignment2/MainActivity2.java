package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {
    String name,weight,height,gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();
        name=intent.getStringExtra("NAME");
        gender=intent.getStringExtra("GENDER");
        weight=intent.getStringExtra("WEIGHT");
        height=intent.getStringExtra("HEIGHT");




    }

    public void onClickUserDetails(View view) {
        Intent intent=new Intent(this,UserDetailsActivity.class);
        intent.putExtra("NAME",name);
        intent.putExtra("WEIGHT",weight);
        intent.putExtra("HEIGHT",height);
        intent.putExtra("GENDER",gender);
        startActivity(intent);

    }

    public void onClickAct(View view) {
        Intent intent=new Intent(this,TimerPickerActivity.class);
        startActivity(intent);


    }
}