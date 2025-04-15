package com.example.tugas2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Myadapter_beranda (private val namalist:ArrayList<itemdata_beranda>):RecyclerView.Adapter<Myadapter_beranda.MyViewHolder>(){


 class MyViewHolder (itemdata_beranda: View):RecyclerView.ViewHolder(itemdata_beranda){
     val gambar : ImageView = itemdata_beranda.findViewById(R.id.imageView)
     val gambar2 : ImageView = itemdata_beranda.findViewById(R.id.imageView5)
     val nama : TextView = itemdata_beranda.findViewById(R.id.textView22)
     val pesan : TextView = itemdata_beranda.findViewById(R.id.textView26)
     val pesan2 : TextView = itemdata_beranda.findViewById(R.id.textView23)


 }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemdata=LayoutInflater.from(parent.context).inflate(R.layout.item_data_beranda,parent,false)
        return MyViewHolder(itemdata)
    }

    override fun getItemCount(): Int = namalist.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       val currentitem=namalist [position]
        holder.gambar.setImageResource(currentitem.gambar)
        holder.gambar2.setImageResource(currentitem.gambar2)
        holder.nama.text=currentitem.nama
        holder.pesan.text=currentitem.pesan
        holder.pesan2.text=currentitem.pesan2

    }
}


