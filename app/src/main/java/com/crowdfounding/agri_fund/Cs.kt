package com.crowdfounding.agri_fund

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import com.crowdfounding.agri_fund.screens.Dashboard

class Cs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cs)

        val home = findViewById<Button>(R.id.homeButtonCs)
        home.setOnClickListener {
            val intent = Intent(this,Dashboard::class.java)
            startActivity(intent)
        }

    }
}