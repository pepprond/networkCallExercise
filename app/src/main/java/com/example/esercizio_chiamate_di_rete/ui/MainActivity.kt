package com.example.esercizio_chiamate_di_rete.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import coil.load
import com.example.esercizio_chiamate_di_rete.databinding.ActivityMainBinding
import com.example.esercizio_chiamate_di_rete.model.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.loadRandomDog()
        binding.button.setOnClickListener {
            viewModel.loadRandomDog()
        }
    }

    override fun onStart() {
        super.onStart()
        viewModel.dog.observe(
            this
        ) {
            binding.imageView.load(it.message)
        }
    }


}