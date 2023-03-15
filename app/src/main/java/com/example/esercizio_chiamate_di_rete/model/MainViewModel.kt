package com.example.esercizio_chiamate_di_rete.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.esercizio_chiamate_di_rete.network.DogProvider
import com.example.esercizio_chiamate_di_rete.network.dto.Dog
import kotlinx.coroutines.launch


class MainViewModel : ViewModel() {

    private var _dog = MutableLiveData<Dog>()
    val dog: LiveData<Dog> get() = _dog

    fun loadRandomDog() {
        viewModelScope.launch {
            try {
                _dog.value = DogProvider().providerDogService().getImageRandom()

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

}