package com.example.page1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class doctorlogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctorlogin)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        val calnederbt: Button = findViewById(R.id.loginbtn)
        calnederbt.setOnClickListener{
            val intent = Intent(this , devicelogin::class.java)
            startActivity(intent)
        }
//        Glide.with(this).load("https://i.imgur.com/1tMFzp8.png").into(findViewById(R.id.rjkk8gg13yj))
//        Glide.with(this).load("https://i.imgur.com/1tMFzp8.png").into(findViewById(R.id.rryosqcvrcd))
//        Glide.with(this).load("https://i.imgur.com/1tMFzp8.png").into(findViewById(R.id.rnuwilmc9lz))
//
//

    }
}