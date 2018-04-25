package com.example.viswatejayetukuri.madproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class NewDoctor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_doctor);

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

        ArrayList<String> spin3=new ArrayList<>();
        spin3.add("Select Specialization");
        spin3.add("Neurology");
        spin3.add("Cardiology");
        spin3.add("Pediatrics");
        spin3.add("Gynacology");
        spin3.add("Oncology");
        spin3.add("Dermatology");
        spin3.add("Urology");
        Spinner s2=(Spinner)findViewById(R.id.spin3);
        ArrayAdapter adapter2=new ArrayAdapter(this,android.R.layout.simple_list_item_1,spin3);
        s2.setAdapter(adapter2);
    }

    public void sub1(View view) {
        Toast.makeText(this,"Doctor details Submitted",Toast.LENGTH_SHORT).show();
    }
}
