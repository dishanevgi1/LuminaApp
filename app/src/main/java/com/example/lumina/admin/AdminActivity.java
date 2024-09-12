package com.example.lumina.admin;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.lumina.R;
import android.view.View;
import android.widget.*;

public class AdminActivity extends AppCompatActivity {
    Button notification, exam, allotment, queries, manage, help;
    ImageView profile, home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_admin);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.admin), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        notification = findViewById(R.id.button);
        exam = findViewById(R.id.button1);
        allotment = findViewById(R.id.button2);
        queries = findViewById(R.id.button3);
        manage = findViewById(R.id.button4);
        help = findViewById(R.id.button5);

        profile = findViewById(R.id.ivProfile);
        home = findViewById(R.id.ivHome);
        notification.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(AdminActivity.this, notification_admin.class);
                startActivity(intent);
            }
        });

        exam.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(AdminActivity.this, exam_Admin.class);
                startActivity(intent);
            }
        });

        allotment.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(AdminActivity.this, AllotmentSchedule.class);
                startActivity(intent);
            }
        });

        queries.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(AdminActivity.this, queries_admin.class);
                startActivity(intent);
            }
        });

        manage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(AdminActivity.this, manage_writers.class);
                startActivity(intent);
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(AdminActivity.this, help_admin.class);
                startActivity(intent);
            }
        });


        profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(AdminActivity.this, profileActivity_admin.class);
                startActivity(intent);
            }
        });
    }
}