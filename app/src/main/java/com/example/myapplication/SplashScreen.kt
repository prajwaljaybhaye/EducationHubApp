package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen)

        val spText1= findViewById<TextView>(R.id.spText1)
        val spText2= findViewById<TextView>(R.id.spText2)

        spText1.translationY = -1000f //uper se nice
        spText2.translationX = -1000f //left se right

        spText1.animate().translationY(0f).duration = 2000
        spText2.animate().translationX(0f).duration = 2000

        //automattically open the new activity using intent

        Handler(Looper.getMainLooper()).postDelayed({

            //simple intent
            val intent = Intent(this, First_activity:: class.java)
            startActivity(intent)

        },2000)




}
}