package com.example.lumina.admin

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.Insets
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lumina.R
import android.view.View
import android.widget.Button
import android.widget.ImageView

class AdminActivity : AppCompatActivity() {
    private lateinit var notification: Button
    private lateinit var exam: Button
    private lateinit var allotment: Button
    private lateinit var queries: Button
    private lateinit var manage: Button
    private lateinit var help: Button
    private lateinit var profile: ImageView
    private lateinit var home: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_admin)

        val rootView = findViewById<View>(R.id.admin)
        ViewCompat.setOnApplyWindowInsetsListener(rootView) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        notification = findViewById(R.id.button)
        exam = findViewById(R.id.button1)
        allotment = findViewById(R.id.button2)
        queries = findViewById(R.id.button3)
        manage = findViewById(R.id.button4)
        help = findViewById(R.id.button5)

        profile = findViewById(R.id.ivProfile)
        home = findViewById(R.id.ivHome)

        notification.setOnClickListener {
            val intent = Intent(this, notification_admin::class.java)
            startActivity(intent)
        }

        exam.setOnClickListener {
            val intent = Intent(this, exam_Admin::class.java)
            startActivity(intent)
        }

        allotment.setOnClickListener {
            val intent = Intent(this, AllotmentSchedule::class.java)
            startActivity(intent)
        }

        queries.setOnClickListener {
            val intent = Intent(this, queries_admin::class.java)
            startActivity(intent)
        }

        manage.setOnClickListener {
            val intent = Intent(this, manage_writers::class.java)
            startActivity(intent)
        }

        help.setOnClickListener {
            val intent = Intent(this, help_admin::class.java)
            startActivity(intent)
        }

        profile.setOnClickListener {
            val intent = Intent(this, profileActivity_admin::class.java)
            startActivity(intent)
        }
    }
}
