package com.example.lumina.vi;

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

public class feedback_VI extends AppCompatActivity {
ImageView profile, home, settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.feedback_vi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.feedback_vi), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
     profile=findViewById(R.id.ivProfile);
     home=findViewById(R.id.ivHome);
     settings=findViewById(R.id.ivSetting);
     profile.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v) {
             // Create an Intent to start SecondActivity
             Intent intent = new Intent(feedback_VI.this, profileActivity_vi.class);
             startActivity(intent);
         }
     });

     home.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v) {
             // Create an Intent to start SecondActivity
             Intent intent = new Intent(feedback_VI.this, VIActivity.class);
             startActivity(intent);
         }
     });
    }
}