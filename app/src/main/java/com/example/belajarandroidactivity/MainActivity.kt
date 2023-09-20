package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val judul:TextView = findViewById(R.id.judul)
        val nama:TextView = findViewById(R.id.nama)
        val isinama:EditText = findViewById(R.id.isinama)
        val kelas:TextView = findViewById(R.id.kelas)
        val isikelas:EditText = findViewById(R.id.isikelas)
        val kode:TextView = findViewById(R.id.kode)
        val isikode:TextView = findViewById(R.id.isikode)
        val submit:Button = findViewById(R.id.submit)
        val nama2:TextView = findViewById(R.id.nama2)
        val kelas2:TextView = findViewById(R.id.kelas2)
        val kode2:TextView = findViewById(R.id.kode2)

        submit.setOnClickListener {
            Toast.makeText(this,"Selamat Kamu Meminjam Buku ${kode2.text}",Toast.LENGTH_SHORT).show();

            nama2.text  = isinama.text
            kelas2.text = isikelas.text
            val code:Int = isikode.text.toString().toInt()

            when (code){
                123 -> kode2.text="Harry Potter"
                456 -> kode2.text="Alice In Wonderland"
                789 -> kode2.text="Naruto"

                else-> kode2.text="Buku Tidak Ada"
            }
        }
    }
}