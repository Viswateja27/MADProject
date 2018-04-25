package com.example.viswatejayetukuri.madproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Emergency extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

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

        ArrayList<String> spin2=new ArrayList<>();
        spin2.add("Select Room No");
        spin2.add("101");
        spin2.add("102");
        spin2.add("103");
        spin2.add("104");
        spin2.add("105");
        spin2.add("106");
        spin2.add("107");
        spin2.add("108");
        Spinner s1=(Spinner)findViewById(R.id.spin2);
        ArrayAdapter adapter1=new ArrayAdapter(this,android.R.layout.simple_list_item_1,spin2);
        s1.setAdapter(adapter1);

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


    public void rset(View view) {
        EditText ed1=(EditText)findViewById(R.id.eedt1);
        EditText ed2=(EditText)findViewById(R.id.eedt2);
        EditText ed3=(EditText)findViewById(R.id.eedt3);
        ed1.setText(" ");
        ed2.setText(" ");
        ed3.setText(" ");
    }

    public void sin(View view) {
        Toast.makeText(this,"Patient Details Saved",Toast.LENGTH_SHORT).show();
    }
}
