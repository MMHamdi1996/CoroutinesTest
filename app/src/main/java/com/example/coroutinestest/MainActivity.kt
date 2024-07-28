package com.example.coroutinestest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.coroutinestest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.operationButton.setOnClickListener {
            for (i in 0..1000000) {
                Log.d("Counter", i.toString())
            }
        }
        var number = 0
        binding.addButton.setOnClickListener {
            number++
            binding.numberButton.text = number.toString()
        }
    }
}