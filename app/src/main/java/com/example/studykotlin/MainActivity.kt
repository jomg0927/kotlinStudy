package com.example.studykotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var text: TextView? = null

    var button5: Button? = null

    private var result: Int? = 0


    private val operatorListener = View.OnClickListener {
        when (it.id) {
            R.id.button5 -> {
                text?.text = result.toString()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.textView)

        button5 = findViewById(R.id.button5)

        val edit1: EditText = findViewById(R.id.value1)
        val edit2: EditText = findViewById(R.id.value2)

        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)


        button2.setOnClickListener {
            result = sum(edit1.text.toString().toInt(), edit2.text.toString().toInt())
        }

        button4.setOnClickListener {
            result = div(edit1.text.toString().toInt(), edit2.text.toString().toInt())
        }

        button3.setOnClickListener {
            result = mul(edit1.text.toString().toInt(), edit2.text.toString().toInt())
        }

        button4.setOnClickListener {
            result = sub(edit1.text.toString().toInt(), edit2.text.toString().toInt())
        }

        button5?.setOnClickListener(operatorListener)

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