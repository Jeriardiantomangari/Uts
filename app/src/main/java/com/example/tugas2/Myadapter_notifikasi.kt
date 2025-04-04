package com.example.tugas2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Myadapter_notifikasi (private val namalist:ArrayList<itemdata_notifikasi>):RecyclerView.Adapter<Myadapter_notifikasi.MyViewHolder>(){


 class MyViewHolder (itemdata_notifikasi: View):RecyclerView.ViewHolder(itemdata_notifikasi){
     val gambar : ImageView = itemdata_notifikasi.findViewById(R.id.imageView)
     val nama : TextView = itemdata_notifikasi.findViewById(R.id.textView22)
     val pesan : TextView = itemdata_notifikasi.findViewById(R.id.textView23)
     val waktu : TextView = itemdata_notifikasi.findViewById(R.id.textView26)


 }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemdata=LayoutInflater.from(parent.context).inflate(R.layout.item_data_notifikasi,parent,false)
        return MyViewHolder(itemdata)
    }

    override fun getItemCount(): Int = namalist.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       val currentitem=namalist [position]
        holder.gambar.setImageResource(currentitem.gambar)
        holder.nama.text=currentitem.nama
        holder.pesan.text=currentitem.pesan
        holder.waktu.text=currentitem.waktu

    }
}


