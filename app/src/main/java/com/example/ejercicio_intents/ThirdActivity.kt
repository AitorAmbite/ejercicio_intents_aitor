package com.example.ejercicio_intents

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.third_layout.*

class ThirdActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_THIRD_1 = "ET1"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_layout)
        val passed_text = intent.getStringExtra(EXTRA_THIRD_1).toString()
        passed_text?.let{
            tv_third.text = it
        }

    }

}