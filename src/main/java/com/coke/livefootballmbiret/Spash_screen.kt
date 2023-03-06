package com.coke.livefootballmbiret

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView

class Spash_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spash_screen)

        val backgroundimg: ImageView=findViewById(R.id.image_splash)
        val sideAnimation =AnimationUtils.loadAnimation(this,R.anim.slide)
        backgroundimg.startAnimation(sideAnimation)
        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },1500)

    }
}