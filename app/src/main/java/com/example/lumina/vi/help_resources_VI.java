package com.example.lumina.vi;

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

public class help_resources_VI extends AppCompatActivity {
    Button feedback;
    ImageView profile, home, settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_help_resources_vi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.help_resources_VI), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        feedback = findViewById(R.id.feedback);
        profile = findViewById(R.id.ivProfile);
        home = findViewById(R.id.ivHome);
        settings = findViewById(R.id.ivSetting);

        feedback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(help_resources_VI.this, feedback_VI.class);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(help_resources_VI.this, profileActivity_vi.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(help_resources_VI.this, VIActivity.class);
                startActivity(intent);
            }
        });
    }
}