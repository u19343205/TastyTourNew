package com.example.tastytour.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tastytour.R
import com.example.tastytour.databinding.ActivityReservePageBinding

class ReservePage : AppCompatActivity() {

    private lateinit var binding: ActivityReservePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reserve_page)


        binding = ActivityReservePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homeButton2.setOnClickListener {
            // Move to SearchPage
            val intent = Intent(this, LandingPage::class.java)
            startActivity(intent)
            finish() // Finish the current activity to prevent going back to login screen on back press

        }

        binding.searchButton.setOnClickListener {
            // Move to SavedPage
            val intent = Intent(this, SearchPage::class.java)
            startActivity(intent)
            finish() // Finish the current activity to prevent going back to login screen on back press
        }

        binding.saveButton.setOnClickListener {
            // Move to ReservePage
            val intent = Intent(this, SavedPage::class.java)
            startActivity(intent)
            finish() // Finish the current activity to prevent going back to login screen on back press
        }

        binding.dealsButton.setOnClickListener {
            // Move to DealsPage
            val intent = Intent(this, DealsPage::class.java)
            startActivity(intent)
            finish() // Finish the current activity to prevent going back to login screen on back press
        }
    }
}