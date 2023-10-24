package com.percobaan.loginregisterkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.percobaan.loginregisterkotlin.databinding.ActivityDashboardBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val
        val registerbutton = findViewById<TextView>(R.id.registerNow)
        registerbutton.setOnClickListener{
            val intent = Intent(this,Register::class.java)
            startActivity(intent)
        }
        val logindashboardbutton = findViewById<Button>(R.id.logindash)
        logindashboardbutton.setOnClickListener {
            val
            if (get.Password.isEmpty)
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
    }
}