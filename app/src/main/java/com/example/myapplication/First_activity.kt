package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class First_activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first)

        val letsGoBtn = findViewById<Button>(R.id.letsGoBtn)
        letsGoFunction(letsGoBtn) //calling function own create

        //sign In button function create
        val sign = findViewById<Button>(R.id.signBtn)


        //linkdin link button function create
        val linkdinVar =findViewById<Button>(R.id.linkdinBtn)
        linkdinBtnFun(linkdinVar)

        //Sign IN link button function create





        }

    //lets go button function create own
    private fun letsGoFunction(letsGo: Button) {
        letsGo.setOnClickListener{
            intent = Intent(applicationContext,SecondActivity :: class.java)
            startActivity(intent)
        }}


        //signIn function


        //linkdin url function

        private fun linkdinBtnFun(linkVar : Button){
            linkVar.setOnClickListener{
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data= Uri.parse("https://www.linkedin.com/in/prajwal-jaybhaye/")
                startActivity(intent)
            }
        }
    }


