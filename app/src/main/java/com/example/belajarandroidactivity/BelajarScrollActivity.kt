package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import jp.wasabeef.glide.transformations.BlurTransformation

class BelajarScrollActivity : AppCompatActivity() {
    var ivbackground:ImageView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_scroll)

        ivbackground = findViewById(R.id.ivBackground)

        Glide.with(this)
            .load(R.drawable.peter)
            .transform(BlurTransformation(25,3))
            .into(ivbackground!!)
    }
}