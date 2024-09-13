package com.example.lumina.admin

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.Insets
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lumina.R

class NotificationAdmin : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: NotificationAdapterAdmin
    private lateinit var notificationList: MutableList<NotificationItemViewsAdmin>
    private lateinit var profile: ImageView
    private lateinit var home: ImageView

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notification_admin)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.notification_admin)) { view, insets ->
            val systemBars: Insets = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        recyclerView = findViewById(R.id.recycleview)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Initialize the list and adapter
        notificationList = mutableListOf()
        // Add sample notifications (in a real app, fetch from a data source)
        notificationList.add(NotificationItemViewsAdmin("New Notification", "A Writer is available for Marathi subject on 21/07/2024", "10:00 AM"))
        notificationList.add(NotificationItemViewsAdmin("New Notification", "A Writer is available for English subject on 22/07/2024", "11:00 AM"))
        notificationList.add(NotificationItemViewsAdmin("New Notification", "A Writer is available for SS subject on 23/07/2024", "12:00 PM"))
        notificationList.add(NotificationItemViewsAdmin("New Notification", "A Writer is available for Hindi subject on 24/07/2024", "01:00 PM"))
        notificationList.add(NotificationItemViewsAdmin("New Notification", "A Writer is available for History subject on 25/07/2024", "02:00 PM"))

        // Set up the adapter
        adapter = NotificationAdapterAdmin(notificationList)
        recyclerView.adapter = adapter

        profile = findViewById(R.id.ivProfile)
        home = findViewById(R.id.ivHome)

        profile.setOnClickListener {
            val intent = Intent(this@NotificationAdmin, ProfileActivityAdmin::class.java)
            startActivity(intent)
        }

        home.setOnClickListener {
            val intent = Intent(this@NotificationAdmin, AdminActivity::class.java)
            startActivity(intent)
        }
    }
}
