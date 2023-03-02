package com.example.esercizio_chiamate_di_rete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import coil.load
import com.example.esercizio_chiamate_di_rete.databinding.ActivityMainBinding
import com.example.esercizio_chiamate_di_rete.network.DogProvider
import com.example.esercizio_chiamate_di_rete.network.DogService
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.button.setOnClickListener {
            lifecycleScope.launch {
            val callDog= DogProvider().providerDogService().getImageRandom()
            binding.imageView.load(callDog.message)
            }
        }
    }
}