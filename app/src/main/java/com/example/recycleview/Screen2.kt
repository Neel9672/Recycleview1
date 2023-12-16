package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Screen2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val item = intent.getParcelableExtra<Items>("item")
        if (item != null){
            val textView : TextView = findViewById(R.id.screen2Tv)
            val imageView : ImageView = findViewById(R.id.screen2Iv)

            textView.text = item.name
            imageView.setImageResource(item.image)
        }
    }
}