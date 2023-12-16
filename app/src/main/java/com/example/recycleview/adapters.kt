package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapters(private val itemList: ArrayList<Items>)
    : RecyclerView.Adapter<adapters.ItemViewHolder>()    {

    var onItemClick : ((Items) -> Unit)? = null

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.imageView)
        val textView : TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item , parent , false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = itemList[position]
        holder.imageView.setImageResource(item.image)
        holder.textView.text = item.name

        holder.itemView.setOnClickListener{

            onItemClick?.invoke(item)
        }
    }
}