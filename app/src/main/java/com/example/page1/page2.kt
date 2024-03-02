package com.example.page1

import android.os.Bundle
import android.view.WindowManager
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.page1.databinding.ActivityPage2Binding

class page2 : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityPage2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_page2)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

           /* Glide.with(this).load("https://i.imgur.com/1tMFzp8.png")
                .into(findViewById(R.id.rlhxd3u3x4qn))
            Glide.with(this).load("https://i.imgur.com/1tMFzp8.png")
                .into(findViewById(R.id.rn9e1zvr4ri))
            Glide.with(this).load("https://i.imgur.com/1tMFzp8.png")
                .into(findViewById(R.id.ru66yl9zb56))
            Glide.with(this).load("https://i.imgur.com/1tMFzp8.png")
                .into(findViewById(R.id.rpw3wpeymz6))
            Glide.with(this).load("https://i.imgur.com/1tMFzp8.png")
                .into(findViewById(R.id.r1mv346scb6f))
            Glide.with(this).load("https://i.imgur.com/1tMFzp8.png")
                .into(findViewById(R.id.rc0ybfhkscjf))
            Glide.with(this).load("https://i.imgur.com/1tMFzp8.png")
                .into(findViewById(R.id.r0ah8v8cl6ulo))
            Glide.with(this).load("https://i.imgur.com/1tMFzp8.png")
                .into(findViewById(R.id.rpqvls7427x))
            Glide.with(this).load("https://i.imgur.com/1tMFzp8.png")
                .into(findViewById(R.id.rfu4hohmmewr))
            Glide.with(this).load("https://i.imgur.com/1tMFzp8.png")
                .into(findViewById(R.id.rggf0c7r09v9))*/
        }
    }


