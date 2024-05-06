package com.crowdfounding.agri_fund

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.crowdfounding.agri_fund.screens.Dashboard
import android.content.Intent

class Business : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_business2)

        val home = findViewById<Button>(R.id.homeButtonBusiness)
        home.setOnClickListener {
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }

    }
}