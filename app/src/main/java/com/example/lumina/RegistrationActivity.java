package com.example.lumina;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {

    private EditText nameEditText, phoneEditText, usernameEditText, passwordEditText;
    private Button submitButton, loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.writer_register);

        // Initialize Firestore

        nameEditText = findViewById(R.id.name);
        phoneEditText = findViewById(R.id.Number);
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        submitButton = findViewById(R.id.button);
        loginButton = findViewById(R.id.loginButton); // The newly added button

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrationActivity.this, LoginActivity.class)); // Redirect to LoginActivity
            }
        });
    }

    private void registerUser() {
        String name = nameEditText.getText().toString();
        String phone = phoneEditText.getText().toString();
        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(phone) || TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            Toast.makeText(RegistrationActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!phone.matches("\\d{10}")) {
            Toast.makeText(RegistrationActivity.this, "Please enter a valid 10-digit phone number", Toast.LENGTH_SHORT).show();
            return;
        }




    }
}
