package com.example.viswatejayetukuri.madproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Discharge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discharge);
    }

    public void back(View view) {
        Intent intent=new Intent(this,PatientButton.class);
        startActivity(intent);
    }
}
