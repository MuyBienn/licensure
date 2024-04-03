package com.capstone.licensure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class locator_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_locator)

        val bt1: Button = findViewById(R.id.bt1)
        bt1.setOnClickListener(){
            intent = Intent(this, construction::class.java)
            val intent = Intent(this, construction::class.java)
            startActivity(intent)
        }
        val bt2: Button = findViewById(R.id.bt2)
        bt2.setOnClickListener(){
            intent = Intent(this, construction::class.java)
            val intent = Intent(this, construction::class.java)
            startActivity(intent)
        }
        val bt3: Button = findViewById(R.id.bt3)
        bt3.setOnClickListener(){
            intent = Intent(this, construction::class.java)
            val intent = Intent(this, construction::class.java)
            startActivity(intent)
        }



    }
}