package com.example.viswatejayetukuri.madproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void signin(View v)
    {
        EditText username=(EditText)findViewById(R.id.eun);
        EditText password=(EditText)findViewById(R.id.epw);
        if(username.getText().toString().equals("MADPro")&&password.getText().toString().equals("123456"))
        {
            Intent intent=new Intent(this,HomePage.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this,"please enter correct credentials",Toast.LENGTH_SHORT).show();
        }
    }
}
