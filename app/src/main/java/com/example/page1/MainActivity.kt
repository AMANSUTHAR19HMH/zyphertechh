package com.example.page1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        val imageViewButton: ImageView = findViewById(R.id.imageButton)
        val imageViewButton2: ImageView = findViewById(R.id.imageButton2)


        imageViewButton2.setOnClickListener {
            val intent = Intent(this, lungsss::class.java)
            startActivity(intent)
        }

        imageViewButton.setOnClickListener {
            val intent = Intent(this, heartani::class.java)
            startActivity(intent)
        }
    }

}