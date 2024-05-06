package com.sathiyavan.plantapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    //Declare variables
    private lateinit var button1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize variables
        button1= findViewById<Button>(R.id.button1)

        //set button to open next screen
        button1.setOnClickListener{
            var intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }


    }
}