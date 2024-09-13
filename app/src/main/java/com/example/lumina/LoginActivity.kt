package com.example.lumina;

import com.example.lumina.writer.WriterActivity;
import com.example.lumina.admin.AdminActivity;
import com.example.lumina.vi.VIActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText, passwordEditText;
    private Button submitButton;
    private RadioButton adminRadioButton, writerRadioButton, studentRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.editTextText2);
        passwordEditText = findViewById(R.id.editTextText);
        submitButton = findViewById(R.id.button);


        adminRadioButton = findViewById(R.id.radioButton4);
        writerRadioButton = findViewById(R.id.radioButton5);
        studentRadioButton = findViewById(R.id.radioButton6);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
                    Toast.makeText(LoginActivity.this, "Please enter both username and password", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!adminRadioButton.isChecked() && !writerRadioButton.isChecked() && !studentRadioButton.isChecked()) {
                    Toast.makeText(LoginActivity.this, "Please select a role", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent intent = null;
                if (adminRadioButton.isChecked()) {
                    intent = new Intent(LoginActivity.this, AdminActivity.class);
                } else if (writerRadioButton.isChecked()) {
                    intent = new Intent(LoginActivity.this, WriterActivity.class);
                } else if (studentRadioButton.isChecked()) {
                    intent = new Intent(LoginActivity.this, VIActivity.class);
                }

                if (intent != null) {
                    startActivity(intent);
                    finish();
                }
            }
        });

    }
}
