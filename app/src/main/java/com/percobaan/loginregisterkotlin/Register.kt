package com.percobaan.loginregisterkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val daftarbutton = findViewById<Button>(R.id.register)
        daftarbutton.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            }
        val loginbutton = findViewById<TextView>(R.id.login)
        loginbutton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}