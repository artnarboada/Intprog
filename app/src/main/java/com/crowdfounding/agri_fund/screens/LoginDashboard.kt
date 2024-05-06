package com.crowdfounding.agri_fund.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.crowdfounding.agri_fund.R
import android.content.Intent
import android.widget.Button

class LoginDashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_dashboard)

        val toDashboard = findViewById<Button>(R.id.loginBut)
        toDashboard.setOnClickListener {
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }


    }
}