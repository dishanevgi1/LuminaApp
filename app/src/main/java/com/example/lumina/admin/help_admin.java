package com.example.lumina.admin;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.*;
import com.example.lumina.R;
import android.content.Intent;

public class help_admin extends AppCompatActivity {
ImageView Home,Profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_help_admin);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.help_admin), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Home=findViewById(R.id.ivHome);
        Profile=findViewById(R.id.ivProfile);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(help_admin.this,AdminActivity.class);
                startActivity(intent);
            }
        });

       Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(help_admin.this,profileActivity_admin.class);
                startActivity(intent);
            }
        });
        }
    }
