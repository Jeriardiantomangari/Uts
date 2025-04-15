package com.example.tugas2

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas2.databinding.HomePesanBinding


class home_pesan : AppCompatActivity() {
    private lateinit var binding: HomePesanBinding
    private lateinit var PesanRecyclerView: RecyclerView
    private lateinit var PesanAdapter: Myadapter_pesan
    private lateinit var Listpesan: ArrayList<itemdata_pesan>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_pesan)

        binding = HomePesanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saya.setOnClickListener {
            val Intentmasuk = Intent(this, home_saya::class.java)
            startActivity(Intentmasuk)
        }
        binding.notifikasi.setOnClickListener {
            val Intentmasuk = Intent(this, home_notifikasi::class.java)
            startActivity(Intentmasuk)
        }
        binding.teman.setOnClickListener {
            val Intentmasuk = Intent(this, home_teman::class.java)
            startActivity(Intentmasuk)
        }
        binding.beranda.setOnClickListener {
            val Intentmasuk = Intent(this, home_beranda::class.java)
            startActivity(Intentmasuk)
        }

        PesanRecyclerView=findViewById(R.id.Listpesan)
        Listpesan=ArrayList()

        Listpesan.add(itemdata_pesan(R.drawable.gambar1,"Jeri" , "mengkeren boy "))
        Listpesan.add(itemdata_pesan(R.drawable.gambar2,"Heru" , "okok "))
        Listpesan.add(itemdata_pesan(R.drawable.gambar3,"Kurnia" , "okee"))
        Listpesan.add(itemdata_pesan(R.drawable.gambar4,"Geraldi" , "okee bang"))
        Listpesan.add(itemdata_pesan(R.drawable.gambar5,"Fauzan" , "ok"))
        Listpesan.add(itemdata_pesan(R.drawable.gambar6,"Sriyanti" , "siapp"))
        Listpesan.add(itemdata_pesan(R.drawable.gambar7,"Risma" , "okeu"))
        Listpesan.add(itemdata_pesan(R.drawable.gambar8,"Edo" , "okee bang "))
        Listpesan.add(itemdata_pesan(R.drawable.gambar9,"Hubert" , "oke mas"))
        Listpesan.add(itemdata_pesan(R.drawable.gambar10,"Bayu" , "gass"))


        PesanRecyclerView.layoutManager=LinearLayoutManager(this)
        PesanRecyclerView.setHasFixedSize(true)
        PesanAdapter=Myadapter_pesan(Listpesan)
        PesanRecyclerView.adapter=PesanAdapter
    }
}

