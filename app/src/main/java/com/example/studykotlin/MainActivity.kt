package com.example.studykotlin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.studykotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var result: Int? = 0

    private val operatorListener = View.OnClickListener {
        when (it.id) {
            R.id.plus_button -> {
                    result =
                        sum(binding.input1.text.toString().toInt(), binding.input2.text.toString().toInt())
            }
            R.id.min_button -> {
                    result =
                        sub(binding.input1.text.toString().toInt(), binding.input2.text.toString().toInt())
            }
            R.id.mul_button -> {
                    result =
                        mul(binding.input1.text.toString().toInt(), binding.input2.text.toString().toInt())
            }
            R.id.div_button -> {
                    result =
                        div(binding.input1.text.toString().toInt(), binding.input2.text.toString().toInt())
            }
            R.id.yield_button -> {
                binding.result.text = result.toString()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.plusButton.setOnClickListener(operatorListener)
        binding.minButton.setOnClickListener(operatorListener)
        binding.mulButton.setOnClickListener(operatorListener)
        binding.divButton.setOnClickListener(operatorListener)
        binding.yieldButton.setOnClickListener(operatorListener)
    }

    fun sum(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun mul(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun div(num1: Int, num2: Int): Int {
        return num1 / num2
    }

    fun sub(num1: Int, num2: Int): Int {
        return num1 - num2
    }
}