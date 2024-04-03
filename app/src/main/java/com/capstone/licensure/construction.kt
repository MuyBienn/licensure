package com.capstone.licensure

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class construction : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_construction)

        val bt4: Button = findViewById(R.id.bt4)
        bt4.setOnClickListener(){
            intent = Intent(this, locator_activity::class.java)
            val intent = Intent(this, locator_activity::class.java)
            startActivity(intent)
        }

    }
}