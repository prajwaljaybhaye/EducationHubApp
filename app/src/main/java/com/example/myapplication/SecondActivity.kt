package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val androidDev = findViewById<CardView>(R.id.androidDevBtn)
        val webDev = findViewById<CardView>(R.id.webDevBtn)
        val softEng = findViewById<CardView>(R.id.softwareEngBtn)
        val softDev = findViewById<CardView>(R.id.softwareDevBtn)
        val fullStackDev = findViewById<CardView>(R.id.fullStackDevBtn)
        val aiEng = findViewById<CardView>(R.id.aiEngBtn)
        val callBtn =findViewById<Button>(R.id.callBtn)
        val linkdinBtn =findViewById<Button>(R.id.linkdinBtn)

        //all page intent calling
        androidDevFun(androidDev)//calling tha own create function bottom
        webDevFun(webDev)
        softEngFun(softEng)
        softDevFun(softDev)
        fullStackDevFun(fullStackDev)
        aiEngFun(aiEng) //own creted functions

        callBtnFun(callBtn)
        linkdinBtnFun(linkdinBtn)








    }



    //create the function to redirect the view Activity using intent
    //                             !androidDevVar <- Kuch bhi nam rakh sakte hai
                                       //       !  <- type rahta hai
    private fun androidDevFun(androidDevVar: CardView) {

        androidDevVar.setOnClickListener{
       // val intent = Intent(applicationContext,androidDevPage :: class.java)
        startActivity(intent)

        }
    }

    private fun webDevFun(webDevVar: CardView){

        webDevVar.setOnClickListener{
            intent = Intent(applicationContext,webDevPage :: class.java)
            startActivity(intent)
        }

    }

    private fun softEngFun(softVar: CardView){

        softVar.setOnClickListener{
            intent = Intent(applicationContext,softEngPage :: class.java)
            startActivity(intent)
        }
    }

    private fun softDevFun(softDevVar: CardView){

        softDevVar.setOnClickListener{
            intent = Intent(applicationContext,softDevPage :: class.java)
            startActivity(intent)
        }
    }
    private fun fullStackDevFun(fullStackVar: CardView){

        fullStackVar.setOnClickListener{
            intent = Intent(applicationContext,fullStackDevPage :: class.java)
            startActivity(intent)
        }
    }

    private fun aiEngFun(aiEngVar: CardView){

        aiEngVar.setOnClickListener{
            intent = Intent(applicationContext,aiEngPage :: class.java)
            startActivity(intent)
        }
    }

    //call function
    private  fun callBtnFun(contectVar : Button){

        contectVar.setOnClickListener {

          // val intent = Intent(Intent.ACTION_CALL)
         //   intent.data = checkCallingOrSelfPermission("")
           //startActivity(intent)
       }
    }

    //linkdin url function

    private fun linkdinBtnFun(linkdinVar : Button){
        linkdinVar.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.linkedin.com/in/prajwal-jaybhaye/")
            startActivity(intent)
        }
    }


}