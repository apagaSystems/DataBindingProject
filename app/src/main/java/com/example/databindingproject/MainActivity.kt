package com.example.databindingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import com.example.databindingproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.button1.text="Binding Button"
        binding.text="Hello"
    }

    fun onClickButtonCount(){
        binding.text="Hello DataBinding"
        binding.textView2.text="New data from dataBinding"
    }
}