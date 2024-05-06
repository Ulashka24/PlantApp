package com.sathiyavan.plantapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    //Declare variables
    private lateinit var buttonFertilize: Button
    private lateinit var buttonWater: Button
    private lateinit var buttonSun: Button
    private lateinit var imageView3: ImageView
    private var health:Int=100
    private var water:Int=100
    private var sunlight:Int=100

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Initialize variables
        buttonFertilize=findViewById(R.id.buttonFertilze)
        buttonSun=findViewById(R.id.buttonSun)
        buttonWater=findViewById(R.id.buttonWater)
        val imageView3=findViewById<ImageView>(R.id.imageView3)

        //Link picture with button
        updateUI()
        buttonFertilize.setOnClickListener {
            fertilizePlant()
            updateUI()
            imageView3.setImageResource(R.drawable.fertilize_plant)
        }
        buttonSun.setOnClickListener {
            putPlantInSun()
            updateUI()
            imageView3.setImageResource(R.drawable.sun_plant)
        }
        buttonWater.setOnClickListener {
            waterPlant()
            updateUI()
            imageView3.setImageResource(R.drawable.water)
        }

         fun fertilizePlant() {
            health = 100
        }
         fun waterPlant() {
            sunlight-=5
            if (water < 0)water= 0
            if (water <100)water +=10
        }
        fun putPlantInSun(){
            health-=10
            if (health>100)health=100
            sunlight+=10
            if (water>100)water=100
            water-=5
            if (sunlight<0)sunlight=0

        }

         fun updateUI() {
            val health= findViewById<TextView>(R.id.health)
            val water= findViewById<TextView>(R.id.water)
            val sunlight= findViewById<TextView>(R.id.sun)
        }


    }

    private fun fertilizePlant() {

    }

    private fun putPlantInSun() {

    }

    private fun waterPlant() {

    }

    private fun updateUI(){
        health.text= "Health:$health"
        water.text="Water:$water"
        sunlight.text="Sunlight:$sunlight"

    }


}
