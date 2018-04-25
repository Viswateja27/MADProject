package com.example.viswatejayetukuri.madproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Appointment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);
    }

    public void app(View view) {
        Toast.makeText(this,"Appointment Booked",Toast.LENGTH_SHORT).show();
    }
}
