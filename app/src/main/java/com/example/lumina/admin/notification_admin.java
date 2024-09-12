package com.example.lumina.admin;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.*;
import com.example.lumina.R;
import java.util.ArrayList;
import java.util.List;

public class notification_admin extends AppCompatActivity {

    // Initialize RecyclerView
    private RecyclerView recyclerView;
    private NotificationAdapter_admin adapter;
    private List<notification_item_views_admin> notificationList;
    ImageView profile, home;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_admin);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.notification_admin), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView = findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize the list and adapter
        notificationList = new ArrayList<>();
        // Add sample notifications (in a real app, fetch from a data source)
        notificationList.add(new notification_item_views_admin("New Notification", " A Writer is available for marathi subject on 21/07/2024", "10:00 AM"));
        notificationList.add(new notification_item_views_admin("New Notification", " A Writer is available for english subject on 22/07/2024", "11:00 AM"));
        notificationList.add(new notification_item_views_admin("New Notification", " A Writer is available for ss subject on 23/07/2024", "12:00 PM"));
        notificationList.add(new notification_item_views_admin("New Notification", " A Writer is available for hindi subject on 24/07/2024", "01:00 PM"));
        notificationList.add(new notification_item_views_admin("New Notification", " A Writer is available for history subject on 25/07/2024", "02:00 PM"));

        // Set up the adapter
        adapter = new NotificationAdapter_admin(notificationList);
        recyclerView.setAdapter(adapter);
       profile=findViewById(R.id.ivProfile);
       home=findViewById(R.id.ivHome);
        profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(notification_admin.this, profileActivity_admin.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(notification_admin.this, AdminActivity.class);
                startActivity(intent);
            }
        });
    }
}
