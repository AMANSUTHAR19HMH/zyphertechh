package com.example.page1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.page1.databinding.ActivityHeartaniBinding
import com.airbnb.lottie.LottieAnimationView

class lungheart : AppCompatActivity() {
    private lateinit var binding: ActivityHeartaniBinding
    private lateinit var lottieAnimationViewb: LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHeartaniBinding.inflate(layoutInflater)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        setContentView(binding.root)

        binding.lottieAnimationView.setAnimation(R.raw.heart)
        lottieAnimationViewb = findViewById(R.id.lottieAnimationViewb)
        lottieAnimationViewb.setAnimation(R.raw.lungssss)
    }
}
