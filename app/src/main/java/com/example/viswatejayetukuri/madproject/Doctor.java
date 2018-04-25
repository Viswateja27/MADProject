package com.example.viswatejayetukuri.madproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Doctor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);
    }

    public void nd(View view) {
        Intent intent = new Intent(getBaseContext(), NewDoctor.class);
        startActivity(intent);

    }

    public void dd(View view) {
        Intent intent = new Intent(getBaseContext(), DoctorDetails.class);
        startActivity(intent);
    }
}
