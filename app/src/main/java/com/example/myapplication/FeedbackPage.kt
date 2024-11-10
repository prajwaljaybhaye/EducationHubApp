package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FeedbackPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_feedback_page)

//        //store the information in userData variable
//                 // !this is sender activity name and created key in sender
//        val userData = intent.getStringExtra(androidDevPage.KEY)
//
//        //show output in the screen use the text view id  resiver xml
//        val tvShow = findViewById<TextView>(R.id.tvShowId)
//        tvShow.text ="Sender Data :- \n"+ userData.toString()





        }
    }
