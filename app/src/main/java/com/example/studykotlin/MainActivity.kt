package com.example.studykotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var text: TextView? = null

    var button1: Button? = null
    var button2: Button? = null
    var button3: Button? = null
    var button4: Button? = null
    var button5: Button? = null

    val edit1: EditText? = null
    val edit2: EditText? = null

    private var result: Int? = 0

    private val operatorListener = View.OnClickListener {
        when (it.id) {
            R.id.button1 -> {
                if (edit1 != null && edit2 != null) {
                    result = sum(edit1.text.toString().toInt(), edit2.text.toString().toInt())
                }
            }
            R.id.button2 -> {
                if (edit1 != null && edit2 != null) {
                    result = sub(edit1.text.toString().toInt(), edit2.text.toString().toInt())
                }
            }
            R.id.button3 -> {
                if (edit1 != null && edit2 != null) {
                    result = mul(edit1.text.toString().toInt(), edit2.text.toString().toInt())
                }
            }
            R.id.button4 -> {
                if (edit1 != null && edit2 != null) {
                    result = div(edit1.text.toString().toInt(), edit2.text.toString().toInt())
                }
            }
            R.id.button5 -> {
                text?.text = result.toString()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.textView)

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)

        button1?.setOnClickListener(operatorListener)
        button2?.setOnClickListener(operatorListener)
        button3?.setOnClickListener(operatorListener)
        button4?.setOnClickListener(operatorListener)
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