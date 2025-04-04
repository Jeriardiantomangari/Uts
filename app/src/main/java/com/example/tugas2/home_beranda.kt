package com.example.tugas2

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas2.databinding.HomeBerandaBinding
import com.example.tugas2.databinding.HomeNotifikasiBinding
import com.example.tugas2.databinding.HomeTemanBinding


class home_beranda : AppCompatActivity() {
    private lateinit var binding: HomeBerandaBinding
    private lateinit var BerandaRecyclerView: RecyclerView
    private lateinit var BerandaAdapter: Myadapter_beranda
    private lateinit var Listberanda: ArrayList<itemdata_beranda>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_beranda)

        binding = HomeBerandaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saya.setOnClickListener {
            val Intentmasuk = Intent(this, home_saya::class.java)
            startActivity(Intentmasuk)
        }
        binding.pesan.setOnClickListener {
            val Intentmasuk = Intent(this, home_pesan::class.java)
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

        BerandaRecyclerView=findViewById(R.id.listberanda)
        Listberanda= java.util.ArrayList()

        Listberanda.add(itemdata_beranda(R.drawable.gambar1,R.drawable.motor5,"Jeri","1 jam yang lalu","Hitam maniss gak tuhhh"))
        Listberanda.add(itemdata_beranda(R.drawable.gambar2,R.drawable.motor4,"Heru" ,  "6 jam yang lalu", "Anjass"))
        Listberanda.add(itemdata_beranda(R.drawable.gambar4,R.drawable.motor3,"Geraldi" ,  "10 jam yang lalu", "P balap"))
        Listberanda.add(itemdata_beranda(R.drawable.gambar5,R.drawable.motor2,"Fauzan" ,  "7 menit yang lalu ", "Ingpo ngabuburit"))
        Listberanda.add(itemdata_beranda(R.drawable.gambar8,R.drawable.motor6,"Edo" ,  "6 detik yang lalu", "Mengkerenn"))
        Listberanda.add(itemdata_beranda(R.drawable.gambar9,R.drawable.motor7,"Rafif" ,  "12 jam yang lalu", "Dijual full modif"))
        Listberanda.add(itemdata_beranda(R.drawable.gambar10,R.drawable.motor1,"Bayu",  "7 jam yang lalu", "Mode Bersih"))


        BerandaRecyclerView.layoutManager=LinearLayoutManager(this)
        BerandaRecyclerView.setHasFixedSize(true)
        BerandaAdapter=Myadapter_beranda(Listberanda)
        BerandaRecyclerView.adapter=BerandaAdapter
    }
}

