package com.crowdfounding.agri_fund

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.crowdfounding.agri_fund.screens.Dashboard

class Campaign : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_campaign)

        val home = findViewById<Button>(R.id.homeButtonCampaign)
        home.setOnClickListener {
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }

    }
}