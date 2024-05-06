package com.crowdfounding.agri_fund.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.crowdfounding.agri_fund.R
import android.content.Intent
import android.widget.Button

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val toLogin = findViewById<Button>(R.id.registerBut)
        toLogin.setOnClickListener {
            val intent = Intent(this, LoginDashboard::class.java)
            startActivity(intent)
        }

    }
}