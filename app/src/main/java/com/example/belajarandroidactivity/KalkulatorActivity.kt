package com.example.belajarandroidactivity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class KalkulatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)
        val ank1 : TextView = findViewById(R.id.ank1)
        val inputAnk1 : EditText = findViewById(R.id.inputAnk1)
        val ank2 : TextView = findViewById(R.id.ank2)
        val inputAnk2 : EditText = findViewById(R.id.inputAnk2)
        val btnTambah : Button = findViewById(R.id.btnTambah)
        val btnKurang : Button = findViewById(R.id.btnKurang)
        val btnPersen : Button = findViewById(R.id.btnPersen)
        val btnKali : Button = findViewById(R.id.btnKali)
        val btnBagi : Button = findViewById(R.id.btnBagi)
        val btnClear : Button = findViewById(R.id.btnClear)
        val hasilNya : TextView = findViewById(R.id.hasilNya)

        val builder: AlertDialog.Builder = AlertDialog.Builder(this@KalkulatorActivity)

        btnTambah.setOnClickListener {
            var ank1:Int=inputAnk1.text.toString().toInt()
            var ank2:Int=inputAnk2.text.toString().toInt()

            var hasil = ank1+ank2

            hasilNya.text = hasil.toString()
        }

        btnKurang.setOnClickListener {
            var ank1:Int=inputAnk1.text.toString().toInt()
            var ank2:Int=inputAnk2.text.toString().toInt()

            var hasil = ank1-ank2

            hasilNya.text = hasil.toString()
        }

        btnPersen.setOnClickListener {


            var hasil = inputAnk1.text.toString().toInt()%inputAnk2.text.toString().toInt()

            hasilNya.text = hasil.toString()
        }
        btnKali.setOnClickListener {
            var ank1:Int=inputAnk1.text.toString().toInt()
            var ank2:Int=inputAnk2.text.toString().toInt()

            var hasil = ank1*ank2

            hasilNya.text = hasil.toString()
        }
        btnBagi.setOnClickListener {
            var ank1:Double=inputAnk1.text.toString().toDouble()
            var ank2:Double=inputAnk2.text.toString().toDouble()

            var hasil = ank1/ank2

            hasilNya.text = hasil.toString()
        }
        btnTambah.setOnClickListener {
            var ank1:Int=inputAnk1.text.toString().toInt()
            var ank2:Int=inputAnk2.text.toString().toInt()

            var hasil = ank1+ank2

            hasilNya.text = hasil.toString()
        }
        btnClear.setOnClickListener {
            builder.setTitle("Perhatian!")
            builder.setMessage("Kamu yakin mau menghapus datanya?")
            builder.setCancelable(false)
            builder.setPositiveButton("Yes", DialogInterface.OnClickListener{dialog,which->
                hasilNya.text = "0"
                inputAnk1.setText("")
                inputAnk2.setText("")
            })
            builder.setNegativeButton("No", DialogInterface.OnClickListener{dialog,which ->})
            builder.setIcon(R.drawable.information)
            val alertDialog:AlertDialog = builder.create()
            alertDialog.show()
        }
    }
}