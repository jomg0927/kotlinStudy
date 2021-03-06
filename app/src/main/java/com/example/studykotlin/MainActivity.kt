package com.example.studykotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var text: TextView? = null

    var plusButton: Button? = null
    var minButton: Button? = null
    var mulButton: Button? = null
    var divButton: Button? = null
    var yieldButton: Button? = null

    var inputNum1: EditText? = null
    var inputNum2: EditText? = null

    private var result: Int? = 0

    private val operatorListener = View.OnClickListener {
        when (it.id) {
            R.id.plus_button -> {
                if (inputNum1 != null && inputNum2 != null) {
                    result =
                        sum(inputNum1?.text.toString().toInt(), inputNum2?.text.toString().toInt())
                }
            }
            R.id.min_button -> {
                if (inputNum1 != null && inputNum2 != null) {
                    result =
                        sub(inputNum1?.text.toString().toInt(), inputNum2?.text.toString().toInt())
                }
            }
            R.id.mul_button -> {
                if (inputNum1 != null && inputNum2 != null) {
                    result =
                        mul(inputNum1?.text.toString().toInt(), inputNum2?.text.toString().toInt())
                }
            }
            R.id.div_button -> {
                if (inputNum1 != null && inputNum2 != null) {
                    result =
                        div(inputNum1?.text.toString().toInt(), inputNum2?.text.toString().toInt())
                }
            }
            R.id.yield_button -> {
                text?.text = result.toString()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.result)

        inputNum1 = findViewById(R.id.input1)
        inputNum2 = findViewById(R.id.input2)

        plusButton = findViewById(R.id.plus_button)
        minButton = findViewById(R.id.min_button)
        mulButton = findViewById(R.id.mul_button)
        divButton = findViewById(R.id.div_button)
        yieldButton = findViewById(R.id.yield_button)

        plusButton?.setOnClickListener(operatorListener)
        minButton?.setOnClickListener(operatorListener)
        mulButton?.setOnClickListener(operatorListener)
        divButton?.setOnClickListener(operatorListener)
        yieldButton?.setOnClickListener(operatorListener)
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