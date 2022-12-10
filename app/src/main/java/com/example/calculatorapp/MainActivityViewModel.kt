package com.example.calculatorapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal : Int):ViewModel() {
     var total = MutableLiveData<Int>()
    init {
        total.value = startingTotal
    }


    fun addition(input :Int){
        total.value=(total.value?.plus(input))
    }
    fun substraction(input :Int){
        total.value = (total.value)?.minus(input)
    }

}