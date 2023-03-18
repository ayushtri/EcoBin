package com.celes.ecobin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText loginID,password;
    TextView signUp,forgotPassword, fyp, noAcc, emailTextView;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.loginType, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String spinnerVal = parent.getItemAtPosition(position).toString();

                login = findViewById(R.id.buttonLogin);
                signUp = findViewById(R.id.signup);
                forgotPassword = findViewById(R.id.forgotPass);
                loginID = findViewById(R.id.emailEditText);
                password = findViewById(R.id.passwordEditText);
                fyp = findViewById(R.id.fypTextView);
                noAcc = findViewById(R.id.noAcc);
                emailTextView = findViewById(R.id.emailTextView);


                switch (spinnerVal) {
                    case "User":
                        Toast.makeText(MainActivity.this, spinnerVal, Toast.LENGTH_SHORT).show();
                        fyp.setText(R.string.passwordFor);
                        signUp.setText(R.string.create_account); //btn
                        forgotPassword.setText(R.string.forgotPassword); //btn
                        noAcc.setText(R.string.don_t_have_and_account);
                        emailTextView.setText(R.string.email);
                        loginID.setHint(R.string.emailHint);
                        signUp.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                signUpIntent();
                            }
                        });
                        forgotPassword.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                forgotPasswordDialog();
                            }
                        });
                        login.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                toUserActivity();
                            }
                        });
                        break;
                    case "Worker":
                        Toast.makeText(MainActivity.this, spinnerVal, Toast.LENGTH_SHORT).show();
                        fyp.setText("");
                        signUp.setText("");
                        forgotPassword.setText("");
                        noAcc.setText("");
                        emailTextView.setText(R.string.username);
                        loginID.setHint(R.string.usernameHint);
                        login.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                toWorkerActivity();
                            }
                        });
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void toWorkerActivity() {
        Toast.makeText(this, "Worker Activity", Toast.LENGTH_SHORT).show();
    }

    private void toUserActivity() {
        Toast.makeText(MainActivity.this, "User Login", Toast.LENGTH_SHORT).show();
    }

    private void signUpIntent() {
        Intent intent = new Intent(this,signupUserActivity.class);
        startActivity(intent);
    }

    private void forgotPasswordDialog() {
        Toast.makeText(MainActivity.this, "FYP", Toast.LENGTH_SHORT).show();
    }
}