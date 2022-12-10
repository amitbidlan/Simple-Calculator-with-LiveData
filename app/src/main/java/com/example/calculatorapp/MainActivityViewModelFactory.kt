package com.example.calculatorapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivityViewModelFactory(private var startingTotal:Int):ViewModelProvider.Factory{
    //Step 1: Get Override Function
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)){
            return MainActivityViewModel(startingTotal) as T
        }
       throw IllegalArgumentException("Unknown View Model Class")
    }
}