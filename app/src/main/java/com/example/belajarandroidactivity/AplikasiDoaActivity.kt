package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.AdapterNgaji
import com.example.belajarandroidactivity.model.NgajiDulu

class AplikasiDoaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aplikasi_doa)
        val rvListDoa:RecyclerView=
            findViewById(R.id.rvListDoa)
        val data = arrayListOf<NgajiDulu>(
            NgajiDulu("Do'a dan Dzikir Setelah Sholat",R.drawable.ngaji_dulu),
            NgajiDulu("Do'a dan Dzikir Setelah Sholat",R.drawable.ngaji_dulu),
            NgajiDulu("Do'a dan Dzikir Setelah Sholat",R.drawable.ngaji_dulu),
            NgajiDulu("Do'a dan Dzikir Setelah Sholat",R.drawable.ngaji_dulu),
            NgajiDulu("Do'a dan Dzikir Setelah Sholat",R.drawable.ngaji_dulu),
        )
        val cvSelengkapnya:CardView =
            findViewById(R.id.cvSelengkapnya)

        val adapter=AdapterNgaji(data)

        rvListDoa.adapter=adapter
        rvListDoa.layoutManager=
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        cvSelengkapnya.setOnClickListener{
            val intent =
                Intent(this,DoaHarianActivity::class.java)
            startActivity(intent)
        }
    }
}