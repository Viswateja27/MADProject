package com.example.viswatejayetukuri.madproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MedicineDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_details);
    }

    public void sub(View view) {
        Toast.makeText(this,"Medicine Details Submitted",Toast.LENGTH_SHORT).show();
    }
}
