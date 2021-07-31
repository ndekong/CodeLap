package com.example.codelap

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.codelap.databinding.ActivityMainBinding
import com.example.codelap.databinding.ActivityWishesBinding

class Wishes : AppCompatActivity() {
    private lateinit var binding: ActivityWishesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWishesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)









    }










}