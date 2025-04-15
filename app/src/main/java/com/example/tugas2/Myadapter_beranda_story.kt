package com.example.tugas2

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Myadapter_beranda_story (private val namalist:ArrayList<itemdata_beranda_story>):RecyclerView.Adapter<Myadapter_beranda_story.MyViewHolder>(){

    var onItemClick: ((itemdata_beranda_story) -> Unit)? = null

 class MyViewHolder (itemdata_beranda_story: View):RecyclerView.ViewHolder(itemdata_beranda_story){
     val gambar : ImageView = itemdata_beranda_story.findViewById(R.id.imagestory)
     val nama : TextView = itemdata_beranda_story.findViewById(R.id.textViewstory)

 }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemdata2=LayoutInflater.from(parent.context).inflate(R.layout.item_data_beranda_story,parent,false)
        return MyViewHolder(itemdata2)
    }

    override fun getItemCount(): Int = namalist.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       val currentitem2=namalist [position]
        holder.gambar.setImageResource(currentitem2.gambar)
        holder.nama.text=currentitem2.nama

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(currentitem2)
        }
    }
}


