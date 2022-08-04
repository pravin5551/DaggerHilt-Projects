package com.example.nobrokerdaggerhilt.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.nobrokerdaggerhilt.repository.NoBrokerRepository

class ViewModelFactory(private val myRepository: NoBrokerRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NoBrokerViewModel(myRepository) as T
    }
}