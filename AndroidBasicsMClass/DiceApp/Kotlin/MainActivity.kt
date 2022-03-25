package com.example.myfirstapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll = findViewById<Button>(R.id.roll)
        val imgDice = findViewById<ImageView>(R.id.diceImg)


        btnRoll.setOnClickListener {
            when (Random.nextInt(1,6)) {
                1 -> imgDice.setImageResource(R.drawable.dice_1)
                2 -> imgDice.setImageResource(R.drawable.dice_2)
                3 -> imgDice.setImageResource(R.drawable.dice_3)
                4 -> imgDice.setImageResource(R.drawable.dice_4)
                5 -> imgDice.setImageResource(R.drawable.dice_5)
                else -> imgDice.setImageResource(R.drawable.dice_6)
            }
            Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT).show()
        }
    }

}