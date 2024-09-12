
package com.example.lumina.vi;
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

public class notification_vi extends AppCompatActivity {

    // Initialize RecyclerView
    private RecyclerView recyclerView;
    private NotificationAdapter_vi adapter;
    private List<notification_item_views_vi> notificationList;
    ImageView profile, home, settings;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_vi);
        recyclerView=findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize the list and adapter
        notificationList = new ArrayList<>();
        // Add sample notifications (in a real app, fetch from a data source)
        notificationList.add(new notification_item_views_vi("Title 1", "Body 1", "10:00 AM"));
        notificationList.add(new notification_item_views_vi("Title 2", "Body 2", "11:00 AM"));
        notificationList.add(new notification_item_views_vi("Title 3", "Body 3", "12:00 PM"));
        notificationList.add(new notification_item_views_vi("Title 4", "Body 4", "01:00 PM"));
        notificationList.add(new notification_item_views_vi("Title 5", "Body 5", "02:00 PM"));

        // Set up the adapter
        adapter = new NotificationAdapter_vi(notificationList);
        recyclerView.setAdapter(adapter);
        profile  = findViewById(R.id.ivProfile);
        home  = findViewById(R.id.ivHome);
        settings  = findViewById(R.id.ivSetting);


        profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(notification_vi.this, profileActivity_vi.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(notification_vi.this, VIActivity.class);
                startActivity(intent);
            }
        });
    }
}
