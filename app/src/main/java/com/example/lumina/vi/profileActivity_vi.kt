package com.example.lumina.vi;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.lumina.R;


public class profileActivity_vi extends AppCompatActivity {
    ImageView home;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.profile_vi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.profile_vi), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        home = findViewById(R.id.ivHome);
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(profileActivity_vi.this,VIActivity.class);
                startActivity(intent);
            }
        });


    }
}