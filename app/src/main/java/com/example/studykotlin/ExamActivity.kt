package com.example.studykotlin

import android.os.Bundle
import android.widget.Toast
import com.example.studykotlin.base.BaseActivity
import com.example.studykotlin.databinding.ActivityExamBinding

class ExamActivity : BaseActivity<ActivityExamBinding>(R.layout.activity_exam) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.examButton.setOnClickListener {
            Toast.makeText(this, "버튼클릭", Toast.LENGTH_SHORT).show()
        }
        
    }
}