package com.crowdfounding.agri_fund.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import androidx.constraintlayout.motion.utils.CustomSupport
import com.crowdfounding.agri_fund.*

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        //for home buttonr
        val homeBut = findViewById<Button>(R.id.homeButton)
        homeBut.setOnClickListener {
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }


        //for Business
        val businessBut = findViewById<Button>(R.id.businessButton)
        businessBut.setOnClickListener {
            val intent = Intent(this, Business::class.java)
            startActivity(intent)
        }

        //for Campaign
        val campaignBut = findViewById<Button>(R.id.campaignButton)
        campaignBut.setOnClickListener {
            val intent2 = Intent(this,Campaign::class.java)
            startActivity(intent2)
        }

        //for Progress
        val progressBut = findViewById<Button>(R.id.progressButton)
        progressBut.setOnClickListener {
            val intent = Intent(this, Progress::class.java)
            startActivity(intent)
        }

//for Invest button
        val investBut = findViewById<Button>(R.id.investButton)
        investBut.setOnClickListener {
            val intent = Intent(this, Invest::class.java)
            startActivity(intent)
        }

     //for Donation Button

     val donationBut =findViewById<Button>(R.id.donateButton)
        donationBut.setOnClickListener {
            val intent = Intent(this, Donation::class.java)
            startActivity(intent)
        }

    //for Customer Support

        val customerSupportBut = findViewById<Button>(R.id.supportButton)
            customerSupportBut.setOnClickListener {
                val intent  = Intent(this, Cs::class.java)
                startActivity(intent)
            }


    }
}