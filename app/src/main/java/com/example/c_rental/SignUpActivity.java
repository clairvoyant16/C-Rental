package com.example.c_rental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {
    EditText regName, regUsername, regEmail, regPhoneNumber, regPassword;
    Button callSignIn, signUpBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }

        regName= findViewById(R.id.regName);
        regUsername= findViewById(R.id.regUsername);
        regEmail= findViewById(R.id.regEmail);
        regPhoneNumber= findViewById(R.id.regPhoneNumber);
        regPassword= findViewById(R.id.regPassword);
        callSignIn= findViewById(R.id.callSignInBtn);

        callSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
            }
        });

    }
}