package com.example.codelap

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.codelap.databinding.ActivityWish2Binding


class Wish2 : AppCompatActivity() {
    private lateinit var binding: ActivityWish2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWish2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }

}
