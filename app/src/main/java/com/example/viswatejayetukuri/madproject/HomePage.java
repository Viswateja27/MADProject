package com.example.viswatejayetukuri.madproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }


    public void patients(View view) {
        Intent intent = new Intent(this, PatientButton.class);
        startActivity(intent);

    }

    public void doctors(View view) {
        Intent intent = new Intent(this, Doctor.class);
        startActivity(intent);
    }

    public void pharmacy(View view) {
        Intent intent = new Intent(this, Pharmacy.class);
        startActivity(intent);
    }

    public void emerg(View view) {
        Intent i = new Intent(this, Emergency.class);
        startActivity(i);
    }
}
