package com.example.ejercicio_intents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.second_layout.*
import kotlinx.android.synthetic.main.third_layout.*

class SecondActivity : AppCompatActivity(){
    companion object{
        const val EXTRA_SECOND_1  = "EC1"
        const val EXTRA_SECOND_2 = "EC2"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        val image_source = intent.getStringExtra(EXTRA_SECOND_1)
        val texto = intent.getStringExtra(EXTRA_SECOND_2)

        image_source?.let {
            iv_1.setImageResource(R.mipmap.ic_grievous_foreground)
            tv_2.text = texto
        }

    }
}