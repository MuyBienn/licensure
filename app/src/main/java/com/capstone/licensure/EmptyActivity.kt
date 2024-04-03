package com.capstone.licensure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class EmptyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty)

        val textView = findViewById<TextView>(R.id.tv1)
        val textView2 = findViewById<TextView>(R.id.tv2)
        val enteredUser = intent.getStringExtra("EnteredUser")
        val enteredPass = intent.getStringExtra("EnteredPass")
        textView.text = enteredUser
        textView2.text = enteredPass
    }
}