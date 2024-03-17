package com.capstone.licensure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GuideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide)

        val button1 = findViewById<Button>(R.id.btn1)
            button1.setOnClickListener() {
            intent = Intent(this, SampleInformation::class.java)
            startActivity(intent)
            }

        val button2 = findViewById<Button>(R.id.btn2)
        button2.setOnClickListener() {
            intent = Intent(this, SampleInformation::class.java)
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.btn3)
        button3.setOnClickListener() {
            intent = Intent(this, SampleInformation::class.java)
            startActivity(intent)
        }

        val button4 = findViewById<Button>(R.id.btn4)
        button4.setOnClickListener() {
            intent = Intent(this, SampleInformation::class.java)
            startActivity(intent)
        }
    }
}