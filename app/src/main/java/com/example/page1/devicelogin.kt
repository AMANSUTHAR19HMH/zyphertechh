package com.example.page1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class devicelogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_devicelogin)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        val calnedert: Button = findViewById(R.id.loginnnbtn)
        calnedert.setOnClickListener{
            val intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
        }

//        Glide.with(this).load("https://i.imgur.com/1tMFzp8.png").into(findViewById(R.id.rslwhd0sw2gj))
//        Glide.with(this).load("https://i.imgur.com/1tMFzp8.png").into(findViewById(R.id.rulftfkfyuu))
//        Glide.with(this).load("https://i.imgur.com/1tMFzp8.png").into(findViewById(R.id.rjy9pck9tfur))
//
//
    }
}