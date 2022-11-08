package com.example.c_rental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignInActivity extends AppCompatActivity {
    EditText username, password;
    Button signInBtn, callSignUpBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        username= findViewById(R.id.username);
        password= findViewById(R.id.password);
        signInBtn= findViewById(R.id.signInBtn);
        callSignUpBtn= findViewById(R.id.callSignUpBtn);

        callSignUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignInActivity.this, SignUpActivity.class));
            }
        });

    }
}