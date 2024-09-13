package com.example.lumina.writer;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.lumina.R;

import android.view.View;
import android.widget.*;
import java.util.ArrayList;
import java.util.List;

public class notification_writer extends AppCompatActivity {

    // Initialize RecyclerView
    private RecyclerView recyclerView;
    private NotificationAdapter_writer adapter;
    private List<notification_item_views_writer> notificationList;
    ImageView profile, home, settings;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_writer);
        recyclerView = findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize the list and adapter
        notificationList = new ArrayList<>();
        // Add sample notifications (in a real app, fetch from a data source)
        notificationList.add(new notification_item_views_writer("Title 1", "Body 1", "10:00 AM"));
        notificationList.add(new notification_item_views_writer("Title 2", "Body 2", "11:00 AM"));
        notificationList.add(new notification_item_views_writer("Title 3", "Body 3", "12:00 PM"));
        notificationList.add(new notification_item_views_writer("Title 4", "Body 4", "01:00 PM"));
        notificationList.add(new notification_item_views_writer("Title 5", "Body 5", "02:00 PM"));

        // Set up the adapter
        adapter = new NotificationAdapter_writer(notificationList);
        recyclerView.setAdapter(adapter);

        profile  = findViewById(R.id.ivProfile);
        home  = findViewById(R.id.ivHome);
        settings  = findViewById(R.id.ivSetting);
        profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(notification_writer.this, profileActivity_writer.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(notification_writer.this, WriterActivity.class);
                startActivity(intent);
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(notification_writer.this, WriterActivity.class);
                startActivity(intent);
            }
        });
    }
}
