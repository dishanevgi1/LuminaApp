package com.example.lumina.admin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.Insets
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lumina.R

class ExamAdmin : AppCompatActivity() {

    private lateinit var profile: ImageView
    private lateinit var home: ImageView
    private lateinit var addButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Enable edge-to-edge display
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContentView(R.layout.activity_exam)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.admin_exam)) { v, insets ->
            val systemBars: Insets = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        profile = findViewById(R.id.ivProfile)
        home = findViewById(R.id.ivHome)
        addButton = findViewById(R.id.addButton)

        profile.setOnClickListener {
            val intent = Intent(this@ExamAdmin, ProfileActivityAdmin::class.java)
            startActivity(intent)
        }

        home.setOnClickListener {
            val intent = Intent(this@ExamAdmin, AdminActivity::class.java)
            startActivity(intent)
        }

        addButton.setOnClickListener {
            val intent = Intent(this@ExamAdmin, AddExam::class.java)
            startActivity(intent)
        }
    }
}
