package com.capstone.licensure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.content.Intent
import android.app.AlertDialog
import android.content.DialogInterface

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val logout = findViewById<ImageButton>(R.id.btn4)

        logout.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Logout")
            builder.setMessage("Are you sure you want to logout?")
            builder.setPositiveButton("Yes") { dialogInterface: DialogInterface, _: Int ->
                // Perform logout action here
                intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
            builder.setNegativeButton("No") { dialogInterface: DialogInterface, _: Int ->
                // Do nothing, dismiss the dialog
                dialogInterface.dismiss()
            }
            val dialog = builder.create()
            dialog.show()
        }

    }
}