package com.example.layoutskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.layoutskotlin.databinding.ActivityMainBinding
import kotlin.math.ceil

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        /**     Old way with findViewById()     */
//        val myButton: Button = findViewById(R.id.my_button)
//        myButton.text = "A button"


        /**     New way with binding     */
//        binding.myButton.text = "A button"

        binding.button.setOnClickListener { showInTipActivity() }

    }

    fun calculateTip(): Double {
        val stringInTextField = binding.etInputCost.text.toString()
        val cost = stringInTextField.toDouble()

        val selectedId = binding.tipOptions.checkedRadioButtonId
        val tipPercentage = when (selectedId) {
            R.id.radAmazing -> 0.20
            R.id.radGood -> 0.18
            else -> 0.15
        }
        val roundUp = binding.switch1.isChecked

        var result = cost * tipPercentage
        if (roundUp) result = ceil(result)

        return result
    }

    fun showInThisActivity() {
        binding.calculatedTip.text = calculateTip().toString()

    }

    fun showInTipActivity() {
        val intent = Intent(this, TipActivity::class.java)
        intent.apply {
            putExtra("tip", calculateTip())
            putExtra("number", 6)
        }
        this.startActivity(intent)

    }

}