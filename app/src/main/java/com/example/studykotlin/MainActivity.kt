package com.example.myapplication

import android.os.Bundle
import android.os.Parcel
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.studykotlin.R

class MainActivity() : AppCompatActivity(){
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text : TextView = findViewById(R.id.textView)
        val edit1 : EditText = findViewById(R.id.value1)
        val edit2 : EditText = findViewById(R.id.value2)

        val button1 : Button = findViewById(R.id.button)
        val button2 : Button = findViewById(R.id.button2)
        val button3 : Button = findViewById(R.id.button3)
        val button4 : Button = findViewById(R.id.button4)
        val button5 : Button = findViewById(R.id.button5)

        var result = 0

        button2.setOnClickListener{
            result = sum(edit1.text.toString().toInt(),edit2.text.toString().toInt())
        }

        button4.setOnClickListener{
            result = div(edit1.text.toString().toInt(),edit2.text.toString().toInt())
        }

        button3.setOnClickListener{
            result = mul(edit1.text.toString().toInt(),edit2.text.toString().toInt())
        }

        button4.setOnClickListener{
            result = sub(edit1.text.toString().toInt(),edit2.text.toString().toInt())
        }
        button5.setOnClickListener{
            text.setText(result)
        }

    }
    fun sum(num1:Int, num2:Int): Int{
        return num1 + num2
    }
    fun mul(num1:Int, num2:Int): Int{
        return num1 * num2
    }
    fun div(num1:Int, num2:Int): Int{
        return num1 / num2
    }
    fun sub(num1:Int, num2:Int): Int{
        return num1 - num2
    }
}