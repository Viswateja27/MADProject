package com.example.viswatejayetukuri.madproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PatientButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_button);
    }

    public void newapplicant(View view) {
        Intent intent = new Intent(this, Emergency.class);
        startActivity(intent);
    }

    public void discharge(View view) {

        Intent intent=new Intent(this,Discharge.class);
        startActivity(intent);
    }

    public void appointments(View view) {
        Intent intent=new Intent(this,Appointment.class);
        startActivity(intent);
    }

    public void Details(View view) {
        Intent intent=new Intent(this,PatientDetails.class);
        startActivity(intent);
    }

    public void Billing(View view) {
        Intent intent=new Intent(this,Billing.class);
        startActivity(intent);
    }
}
