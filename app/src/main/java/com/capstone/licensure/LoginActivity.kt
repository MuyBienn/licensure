package com.capstone.licensure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginbtn = findViewById<Button>(R.id.loginbtn)
        val signtv = findViewById<TextView>(R.id.signupTV)
        val forgottv = findViewById<TextView>(R.id.forgorpassTV)
        val custservimg = findViewById<ImageView>(R.id.customerserviceIMG)
        val user = findViewById<EditText>(R.id.usernameET)
        val pass = findViewById<EditText>(R.id.passwordET)

        loginbtn.setOnClickListener {
            val enteredUsername = user.text.toString()
            val enteredPassword = pass.text.toString()

            if (enteredUsername == "admin" && enteredPassword == "123") {
                // Username and password matched, start new activity
                intent = Intent(this, DashboardActivity::class.java)
                //intent.putExtra("EnteredUser", enteredUsername)
               // intent.putExtra("EnteredPass", enteredPassword)
                startActivity(intent)
                 // Finish current activity
            } else {
                // Username or password incorrect, show a toast message
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }

        signtv.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        forgottv.setOnClickListener{
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

        custservimg.setOnClickListener {
            val intent = Intent(this, CustomerServiceActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onBackPressed() {
        // Check if the current activity is LoginActivity
        if (isTaskRoot) {
            // If it is, close the application
            finishAffinity()
        } else {
            // If it's not, let the default behavior handle the back button press
            super.onBackPressed()
        }
    }
}