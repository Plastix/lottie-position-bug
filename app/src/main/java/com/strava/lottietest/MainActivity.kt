package com.strava.lottietest

import android.graphics.PointF
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieProperty
import com.airbnb.lottie.model.KeyPath

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view: LottieAnimationView = findViewById(R.id.animation)
        view.addLottieOnCompositionLoadedListener {
            val keyPath = KeyPath("DATA - Month Dot 01")
            view.addValueCallback(keyPath, LottieProperty.TRANSFORM_POSITION) { value ->
                Log.d("MainActivity", value.overallProgress.toString())
                PointF(100F, 200F)
            }
        }

        view.playAnimation()
    }
}
