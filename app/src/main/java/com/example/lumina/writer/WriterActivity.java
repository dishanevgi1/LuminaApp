package com.example.lumina.writer;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.*;

import com.example.lumina.R;

public class WriterActivity extends AppCompatActivity {
    Button availability, notification, queries, help;
    ImageView profile, home, settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_writer);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.writer_homepage), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        availability = findViewById(R.id.button1);
        notification = findViewById(R.id.button2);
        queries = findViewById(R.id.button3);
        help = findViewById(R.id.button4);

        home = findViewById(R.id.ivHome);
        profile = findViewById(R.id.ivProfile);
        settings = findViewById(R.id.ivSetting);

        availability.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(WriterActivity.this, Availability_writers.class);
                startActivity(intent);
            }
        });

        notification.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(WriterActivity.this, notification_writer.class);
                startActivity(intent);
            }
        });

        queries.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(WriterActivity.this, WriterActivity.class);
                startActivity(intent);
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(WriterActivity.this, help_resources_writers.class);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(WriterActivity.this, profileActivity_writer.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(WriterActivity.this, WriterActivity.class);
                startActivity(intent);
            }
        });

    }
}