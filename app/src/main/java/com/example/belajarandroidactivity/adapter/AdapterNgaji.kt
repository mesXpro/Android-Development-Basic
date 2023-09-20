package com.example.belajarandroidactivity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.R
import com.example.belajarandroidactivity.model.NgajiDulu


class AdapterNgaji(val data:ArrayList<NgajiDulu>)
    : RecyclerView.Adapter<AdapterNgaji.LanguageViewHolder>() {
        class LanguageViewHolder(view: View) :
                RecyclerView.ViewHolder(view){
                    val tvJudulNya: TextView = view.findViewById(R.id.tvJudulNya)
                    val ivGambarNya: ImageView = view.findViewById(R.id.ivGambarNya)
                }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_doa_dan_dzikir,parent,false)
        return LanguageViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        val item = data.get(position)
        holder.tvJudulNya.text = item.nama
        holder.ivGambarNya.setImageResource(item.gambar)
    }
}