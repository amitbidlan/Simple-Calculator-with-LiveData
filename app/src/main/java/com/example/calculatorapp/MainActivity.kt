package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.calculatorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainActivityViewModel
    lateinit var binding: ActivityMainBinding
    private lateinit var viewModelFactory : MainActivityViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(0)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainActivityViewModel::class.java)
        viewModel.total.observe(this, Observer {
            binding.tvOutput.text = it.toString()
        })
        //binding.tvOutput.text = viewModel.getCount().toString()
        binding.btAdd.setOnClickListener {
            viewModel.addition(binding.tvInput.text.toString().toInt())

            binding.tvInput.text = null
        }
        binding.btSubstract.setOnClickListener {
            viewModel.substraction(binding.tvInput.text.toString().toInt())
            binding.tvInput.text = null

        }

    }
}