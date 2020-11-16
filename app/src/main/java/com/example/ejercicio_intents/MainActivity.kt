package com.example.ejercicio_intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var secondActivity = Intent(this,SecondActivity::class.java)
        var thirdActivity = Intent(this,ThirdActivity::class.java)


        button_1.setOnClickListener{
            secondActivity.putExtra(SecondActivity.EXTRA_SECOND_1,R.mipmap.ic_hello)
            secondActivity.putExtra(SecondActivity.EXTRA_SECOND_2,"Hello there!")
            startActivity(secondActivity)
        }

        button_2.setOnClickListener{
            thirdActivity.putExtra(ThirdActivity.EXTRA_THIRD_1,"El edit text de la " +
                    "activity anterior tenía una longitud de ${et_1.text.length} caracteres")

            startActivity(thirdActivity)
        }
        button_3.setOnClickListener {
            var rand = Random.nextBoolean()
            Log.d("Prueba", rand.toString())

            if(rand){
                secondActivity.putExtra(SecondActivity.EXTRA_SECOND_1,R.mipmap.ic_grievous.toString())
                secondActivity.putExtra(SecondActivity.EXTRA_SECOND_2,"GENERAL KENOBI!!!")
                startActivity(secondActivity)

            }else{
                thirdActivity.putExtra(ThirdActivity.EXTRA_THIRD_1,"El edit text de la " +
                        "activity anterior contenía: ${et_1.text.toString().toUpperCase()} car")
                startActivity(thirdActivity)
            }
        }
    }
}