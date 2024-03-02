package com.example.page1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.page1.databinding.ActivityHeartaniBinding // Import the generated binding class

class heartani : AppCompatActivity() {
    private lateinit var binding: ActivityHeartaniBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHeartaniBinding.inflate(layoutInflater)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        setContentView(binding.root)

        binding.lottieAnimationView.setAnimation(R.raw.heart)

        // Add click listener to your Lottie animation view

    }

    companion object
}