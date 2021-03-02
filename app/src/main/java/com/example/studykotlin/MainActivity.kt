package com.example.studykotlin

import android.os.Bundle
import android.os.Parcel
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity() : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 : Button = findViewById(R.id.button)
        val button2 : Button = findViewById(R.id.button2)
        val button3 : Button = findViewById(R.id.button3)
        val button4 : Button = findViewById(R.id.button4)

        val text : TextView = findViewById(R.id.textView)
        val edit1 : EditText = findViewById(R.id.value1)
        val edit2 : EditText = findViewById(R.id.value2)

        val str1 = edit1.text.toString()
        val str2 = edit2.text.toString()

        val num1 : Int = Integer.parseInt(str1)
        val num2 : Int = Integer.parseInt(str1)

        button2.setOnClickListener{
            sum(num1, num2)
            text.setText(sum(num1, num2))
        }

        button4.setOnClickListener{
            text.setText(sub(num1, num2))
        }

        button3.setOnClickListener{
            mul(num1, num2)
            text.setText(mul(num1, num2))
        }

        button4.setOnClickListener{
            text.setText(div(num1, num2))
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