package com.crowdfounding.agri_fund.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.crowdfounding.agri_fund.R
import android.widget.Button
import android.content.Intent

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login4)

        //if login button is clicked
        val loginBut = findViewById<Button>(R.id.login)
        loginBut.setOnClickListener {
            val intent = Intent(this,LoginDashboard::class.java)
            startActivity(intent)
        }

        //of Register button is clicked
        val registerBut = findViewById<Button>(R.id.register)
        registerBut.setOnClickListener {
            val intent = Intent(this,Register::class.java)
            startActivity(intent)
        }

    }
}