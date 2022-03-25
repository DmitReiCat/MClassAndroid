package com.example.layoutskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layoutskotlin.databinding.ActivityMainBinding
import com.example.layoutskotlin.databinding.ActivityTipBinding

class TipActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var binding: ActivityTipBinding

        super.onCreate(savedInstanceState)
        binding = ActivityTipBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tvNumber.text = intent.getDoubleExtra("tip", 0.0).toString()
        binding.tvTip.text = intent.getIntExtra("number", 0).toString()
    }




}