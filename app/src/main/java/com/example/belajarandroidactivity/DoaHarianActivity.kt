package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaAdapter
import com.example.belajarandroidactivity.model.DoaHarian

class DoaHarianActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)
        val rvDoaHarian:RecyclerView=
            findViewById(R.id.rvDoaHarian)
        val data = arrayListOf<DoaHarian>(
            DoaHarian("Doa Bangun Tidur","اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            DoaHarian("Doa Bangun Tidur","اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru")
        )
        val adapter = DoaAdapter(data)

        rvDoaHarian.adapter=adapter
        rvDoaHarian.layoutManager=
            LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }
}