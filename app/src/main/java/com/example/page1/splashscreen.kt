package com.example.page1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager

class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        Handler(Looper.getMainLooper()).postDelayed(
            {
                // Start the next activity if the animation takes less than 2000 milliseconds
                startMainActivity()
            },
            2000
        )
    }
    private fun startMainActivity() {
        val intent = Intent(this, doctorlogin::class.java)
        startActivity(intent)
        finish()
    }
}