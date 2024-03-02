package com.example.page1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        val imageViewButton: ImageView = findViewById(R.id.imageButton2)
        val imageViewButton2: ImageView = findViewById(R.id.imageButton)
        val imageViewButton3: ImageView = findViewById(R.id.lungs)
        imageViewButton.setOnClickListener {
            val intent = Intent(this, lungsss::class.java)
            startActivity(intent)
        }

        imageViewButton2.setOnClickListener {
            val intent = Intent(this, heartani::class.java)
            startActivity(intent)
        }
        imageViewButton3.setOnClickListener {
            val intent = Intent(this, lungheart::class.java)
            startActivity(intent)
        }

    }/*class SecondActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_page2)
            }*/
}
