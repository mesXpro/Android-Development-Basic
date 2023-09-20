package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class CountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        val tvNumber: TextView = findViewById(R.id.tvNumber)
        val btnCount: Button = findViewById(R.id.btnCount)
        val btnMinus: Button = findViewById(R.id.btnMinus)
        val btnReset: Button = findViewById(R.id.btnReset)

        tvNumber.text = "0"
        println(tvNumber.text)
        Log.d("Number","Hasilnya  : ${tvNumber.text}")

        btnCount.setOnClickListener{
            var countInteger :Int = tvNumber.text.toString().toInt()
            countInteger++

            tvNumber.text = countInteger.toString()
        }

        btnMinus.setOnClickListener{
            var countInteger :Int = tvNumber.text.toString().toInt()
            countInteger--

            tvNumber.text = countInteger.toString()
        }

        btnReset.setOnClickListener{
            var countInteger :Int = tvNumber.text.toString().toInt()

            tvNumber.text = "0"
        }
    }
}