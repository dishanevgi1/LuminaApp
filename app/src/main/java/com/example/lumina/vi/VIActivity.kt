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

public class VIActivity extends AppCompatActivity {
Button notification, queries, help;
ImageView profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_vi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.vi), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        notification=findViewById(R.id.button);
        queries=findViewById(R.id.button1);
        help=findViewById(R.id.button2);
        profile=findViewById(R.id.ivProfile);

        notification.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(VIActivity.this, notification_vi.class);
                startActivity(intent);
            }
        });
        queries.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(VIActivity.this, queries_vi.class);
                startActivity(intent);
            }
            });


        help.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(VIActivity.this, help_resources_VI.class);
                startActivity(intent);
            }
        });


        profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(VIActivity.this, profileActivity_vi.class);
                startActivity(intent);
            }
        });
    }
}