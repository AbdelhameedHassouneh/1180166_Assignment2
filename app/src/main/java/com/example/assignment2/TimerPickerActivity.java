package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.Toast;

public class TimerPickerActivity extends AppCompatActivity {
    NumberPicker hrsPiceker,minutesPicker,secondsPicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer_picker);
        hrsPiceker=findViewById(R.id.hrsPicker);
        minutesPicker=findViewById(R.id.minPicker);
        secondsPicker=findViewById(R.id.secPicker);
        hrsPiceker.setMinValue(0);
        hrsPiceker.setMaxValue(23);
        minutesPicker.setMinValue(0);
        minutesPicker.setMaxValue(59);
        secondsPicker.setMinValue(0);
        secondsPicker.setMaxValue(59);



    }

    public void continueOnClick(View view) {
        int secs=secondsPicker.getValue();
        int mins=minutesPicker.getValue();
        int hrs=hrsPiceker.getValue();
        int wholeseconds=secs+(60*mins)+(60*60*hrs);
        Intent intent=new Intent(this,ActionActivity.class);
        intent.putExtra("SECONDS",wholeseconds);
        startActivity(intent);




    }
}