package com.pankaj.avengersassemble.views.activities

import android.content.Intent
import android.media.MediaPlayer
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.pankaj.avengersassemble.views.activities.home.HomeActivity
import com.pankaj.avengersassemble.R
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    lateinit var topAnimation: Animation
    lateinit var bottomAnimation: Animation
     var time:Long=11000;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.statusBarColor = resources.getColor(R.color.maroon_light, this.theme)
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = resources.getColor(R.color.maroon_light)
        }

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        val mediaPlayer=MediaPlayer.create(this,R.raw.avengers)
        mediaPlayer.start()
            topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation)
            bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
            imgTeam.setAnimation(topAnimation)
            imgText.setAnimation(bottomAnimation)
        Handler().postDelayed({
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }, time) // 3000 is the delayed time in milliseconds.
    }
}

