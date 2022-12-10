package com.example.calculatorapp

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal : Int):ViewModel() {
    private var total = 0
    init {
        total = startingTotal
    }
    fun getCount():Int{
        return total
    }

    fun addition(input :Int){
        total+=input
    }
    fun substraction(input :Int){
        total-=input
    }

}