package dev.ogabek.L_28_01_2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        image = findViewById(R.id.iv_main)

        val zoom = findViewById<Button>(R.id.btn_zoom)
        val rotate = findViewById<Button>(R.id.btn_rotate)
        val fade = findViewById<Button>(R.id.btn_fade)
        val blink = findViewById<Button>(R.id.btn_blink)
        val move = findViewById<Button>(R.id.btn_move)
        val slide = findViewById<Button>(R.id.btn_slide)
        val lottieAnimation = findViewById<Button>(R.id.btn_lottie_animation)

        zoom.setOnClickListener {
            loadAnimation(R.anim.zoom)
        }

        rotate.setOnClickListener {
            loadAnimation(R.anim.rotate)
        }

        fade.setOnClickListener {
            loadAnimation(R.anim.fade)
        }

        blink.setOnClickListener {
            loadAnimation(R.anim.blink)
        }

        move.setOnClickListener {
            loadAnimation(R.anim.move)
        }

        slide.setOnClickListener {
            loadAnimation(R.anim.slide)
        }

        lottieAnimation.setOnClickListener {
            openLottiAnimationActivity()
        }

    }

    private fun openLottiAnimationActivity() {
        startActivity(Intent(applicationContext, LottieAnimation::class.java))
    }

    private fun loadAnimation(id: Int) {
        val animation = AnimationUtils.loadAnimation(this, id)
        image.startAnimation(animation)
    }

}