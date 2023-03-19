package com.celes.ecobin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signupUserActivity extends AppCompatActivity {
    EditText fname,emailEditText,passwordEditText,repasswordEditText;
    Button signup;
    TextView loginInstead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_user);

        fname = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        repasswordEditText = findViewById(R.id.conPasswordEditText);
        signup = findViewById(R.id.buttonSignUp);
        loginInstead = findViewById(R.id.loginPg);

        loginInstead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(signupUserActivity.this, MainActivity.class));
            }
        });
    }
}