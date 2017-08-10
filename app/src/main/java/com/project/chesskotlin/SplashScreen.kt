package com.project.chesskotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.content.Intent
import android.os.Handler


class SplashScreen : AppCompatActivity() {

    private val SPLASH_DISPLAY_LENGTH = 1000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)


        Handler().postDelayed(Runnable {
            /* Create an Intent that will start the Menu-Activity. */
            val mainIntent = Intent(this@SplashScreen, MainActivity::class.java)
            this@SplashScreen.startActivity(mainIntent)
            this@SplashScreen.finish()
        }, SPLASH_DISPLAY_LENGTH.toLong())



    }
}




