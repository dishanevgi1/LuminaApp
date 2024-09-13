package com.example.lumina.writer;
import com.example.lumina.R;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

import android.view.View;
import android.widget.*;

public class Availability_writers extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ExamScheduleAdapter adapter;
    private List<ExamSchedule> examScheduleList;
    ImageView profile, home, settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.availability_writers);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        home = findViewById(R.id.ivHome);
        profile = findViewById(R.id.ivProfile);
        settings = findViewById(R.id.ivSetting);

        examScheduleList = new ArrayList<>();
        // Add sample data
        examScheduleList.add(new ExamSchedule("Math", "2024-08-01", "10:00 AM - 12:00 PM"));
        examScheduleList.add(new ExamSchedule("Physics", "2024-08-02", "10:00 AM - 12:00 PM"));
        examScheduleList.add(new ExamSchedule("Chemistry", "2024-08-03", "10:00 AM - 12:00 PM"));

        adapter = new ExamScheduleAdapter(examScheduleList);
        recyclerView.setAdapter(adapter);
        profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(Availability_writers.this, profileActivity_writer.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(Availability_writers.this, WriterActivity.class);
                startActivity(intent);
            }
        });

    }
}

