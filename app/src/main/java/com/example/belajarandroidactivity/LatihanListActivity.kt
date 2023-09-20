package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class LatihanListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_list)

        val arrayAdapter: ArrayAdapter<*>
        val user = arrayOf(
            "Python","C#","C++","JavaScript","PHP","Swift","Java","GO","SQL","Ruby"
        )
        var mListView: ListView = findViewById(R.id.RvProgram)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,user)
        mListView.adapter= arrayAdapter
    }
}