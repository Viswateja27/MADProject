package com.example.viswatejayetukuri.madproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class Patient extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);

        ArrayList<String> spin=new ArrayList<>();
        spin.add("Select Blood Group");
        spin.add("O+");
        spin.add("O-");
        spin.add("A+");
        spin.add("A-");
        spin.add("B+");
        spin.add("B-");
        spin.add("AB+");
        spin.add("AB-");
        Spinner s=(Spinner)findViewById(R.id.spin);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,spin);
        s.setAdapter(adapter);

    }
}
