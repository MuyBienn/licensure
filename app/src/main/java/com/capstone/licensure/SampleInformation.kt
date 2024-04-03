package com.capstone.licensure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SampleInformation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sample_information)

        val button= findViewById<Button>(R.id.btn1)
        button.setOnClickListener() {
            intent = Intent(this, GuideActivity::class.java)
            startActivity(intent)
        }
    }
}