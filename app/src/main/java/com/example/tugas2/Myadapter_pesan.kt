package com.example.tugas2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Myadapter_pesan (private val namalist:ArrayList<itemdata_pesan>):RecyclerView.Adapter<Myadapter_pesan.MyViewHolder>(){


 class MyViewHolder (itemdata_pesan: View):RecyclerView.ViewHolder(itemdata_pesan){
     val gambar : ImageView = itemdata_pesan.findViewById(R.id.imageView)
     val nama : TextView = itemdata_pesan.findViewById(R.id.textView22)
     val pesan : TextView = itemdata_pesan.findViewById(R.id.textView23)


 }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemdata=LayoutInflater.from(parent.context).inflate(R.layout.item_data_pesan,parent,false)
        return MyViewHolder(itemdata)
    }

    override fun getItemCount(): Int = namalist.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       val currentitem=namalist [position]
        holder.gambar.setImageResource(currentitem.gambar)
        holder.nama.text=currentitem.nama
        holder.pesan.text=currentitem.pesan

    }
}


