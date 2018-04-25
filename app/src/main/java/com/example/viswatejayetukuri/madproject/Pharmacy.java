package com.example.viswatejayetukuri.madproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pharmacy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy);
    }

    public void ns(View view) {
        Intent intent = new Intent(getBaseContext(), NewStock.class);
        startActivity(intent);
    }

    public void pa(View view) {
        Intent intent = new Intent(getBaseContext(), PatientsMedical.class);
        startActivity(intent);
    }

    public void md(View view) {
        Intent intent = new Intent(getBaseContext(), MedicineDetails.class);
        startActivity(intent);
    }
}
