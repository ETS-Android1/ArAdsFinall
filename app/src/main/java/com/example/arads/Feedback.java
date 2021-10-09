package com.example.arads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class Feedback extends AppCompatActivity {

    //Variables
    TextInputLayout userFeedback;
    Button submitFeedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        //Hooks to all activities in activity_sign_up.xml
        userFeedback = findViewById(R.id.user_input);

        //Hooks to activity in activity_dashboard.xml
        submitFeedback = findViewById(R.id.feedback_submit);
    }
}