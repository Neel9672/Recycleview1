package com.example.recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var itemList : ArrayList<Items>
    private lateinit var adapters: adapters
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycleView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager =  LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        itemList = ArrayList()

        itemList.add(Items(R.mipmap.ic_launcher , "Neel"))
        itemList.add(Items(R.mipmap.ic_launcher , "Ayush"))
        itemList.add(Items(R.mipmap.ic_launcher , "Piyush"))
        itemList.add(Items(R.mipmap.ic_launcher , "Ehsan"))
        itemList.add(Items(R.mipmap.ic_launcher , "Amit"))
        itemList.add(Items(R.mipmap.ic_launcher , "Dhruv"))



        adapters = adapters(itemList)
        recyclerView.adapter = adapters

        adapters.onItemClick = {
            val intent = Intent(this, Screen2::class.java)
            intent.putExtra("item" , it)
            startActivity(intent)
        }
    }
}