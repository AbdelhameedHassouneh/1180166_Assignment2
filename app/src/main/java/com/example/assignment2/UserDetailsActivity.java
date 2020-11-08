package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class UserDetailsActivity extends AppCompatActivity {
    TextView genderView, weightView, heightView, bmiView, nameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String weigtString = intent.getStringExtra("WEIGHT");
        String heightString = intent.getStringExtra("HEIGHT");
        String gender = intent.getStringExtra("GENDER");



        bmiView = findViewById(R.id.txtBMI);
        genderView = findViewById(R.id.txtGender);
        heightView = findViewById(R.id.txtHeight);
        weightView = findViewById(R.id.txtWeight);
        nameView = findViewById(R.id.txtName);
        double weight = Double.parseDouble(weigtString);
        double height = Double.parseDouble(heightString);
        genderView.setText("Gender:" + gender);
        heightView.setText("Height:" + height);
        weightView.setText("Weight:" + weight);
        nameView.setText("Name:" + name);
        double bmi = weight / (height * height);
        bmiView.setText(String.format("BMI:%.2f",bmi));


    }
}