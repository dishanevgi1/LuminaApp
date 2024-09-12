package com.example.lumina.admin;

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

public class
AllotmentSchedule extends AppCompatActivity {
ImageView profile,home,setting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_allotment_schedule);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.allotment_schedule), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
       profile=findViewById(R.id.ivProfile);
       home=findViewById(R.id.ivHome);
       setting=findViewById(R.id.ivSetting);
        profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(AllotmentSchedule.this, profileActivity_admin.class);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(AllotmentSchedule.this, AdminActivity.class);
                startActivity(intent);
            }
        });
    }
}