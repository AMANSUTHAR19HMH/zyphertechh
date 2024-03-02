package com.example.page1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.page1.databinding.ActivityHeartaniBinding

class lungsss : AppCompatActivity() {
    private lateinit var binding: ActivityHeartaniBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHeartaniBinding.inflate(layoutInflater)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        setContentView(binding.root)

        binding.lottieAnimationView.setAnimation(R.raw.lungssss)
}
}