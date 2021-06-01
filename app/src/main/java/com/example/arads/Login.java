package com.example.arads;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    //Variables
    Button callSignUp, callDash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Hooks to activity in activity_sign_up.xml
        callSignUp = findViewById(R.id.signup_screen);

        //Hook to activity in activity_dashboard
        callDash = findViewById(R.id.login_btn);

        callSignUp.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(Login.this, SignUp.class);
                startActivity(intent);
            }
        });

        callDash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Dashboard.class);
                startActivity(intent);
            }
        });

    }
}