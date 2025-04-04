package com.example.tugas2

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas2.databinding.HomeNotifikasiBinding



class home_notifikasi : AppCompatActivity() {
    private lateinit var binding: HomeNotifikasiBinding
    private lateinit var NotifikasiRecyclerView: RecyclerView
    private lateinit var NotifikasiAdapter: Myadapter_notifikasi
    private lateinit var Listnotifikasi: ArrayList<itemdata_notifikasi>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_notifikasi)

        binding = HomeNotifikasiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saya.setOnClickListener {
            val Intentmasuk = Intent(this, home_saya::class.java)
            startActivity(Intentmasuk)
        }
        binding.pesan.setOnClickListener {
            val Intentmasuk = Intent(this, home_pesan::class.java)
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

        NotifikasiRecyclerView=findViewById(R.id.listnotifikasi)
        Listnotifikasi= java.util.ArrayList()

        Listnotifikasi.add(itemdata_notifikasi(R.drawable.gambar1,"Jeri" , "baru saja menambahkan story", "1 jam yang lalu"))
        Listnotifikasi.add(itemdata_notifikasi(R.drawable.gambar2,"Heru" , "berulang tahun hari ini ucapkan doa","2 jam yang lalu"))
        Listnotifikasi.add(itemdata_notifikasi(R.drawable.gambar3,"Kurnia" , "memposting reels baru ","5 jam yang lalu"))
        Listnotifikasi.add(itemdata_notifikasi(R.drawable.gambar4,"Geraldi" , "memposting video baru","11 jam yang lalu"))
        Listnotifikasi.add(itemdata_notifikasi(R.drawable.gambar5,"Fauzan" , "baru baru ini membagikan 1 postingan ","19 jam yang lalu"))
        Listnotifikasi.add(itemdata_notifikasi(R.drawable.gambar6,"Sriyanti" , "mengirim sesuatu di grub ","23 jam yang lalu"))
        Listnotifikasi.add(itemdata_notifikasi(R.drawable.gambar7,"Risma" , "memberikan anda like di postingan anda","24 jam yang lalu"))
        Listnotifikasi.add(itemdata_notifikasi(R.drawable.gambar8,"Edo" , "mengomentari foto anda","11 maret pukul 16.16"))
        Listnotifikasi.add(itemdata_notifikasi(R.drawable.gambar9,"Rafif" , "mengundang anda bergabung ke grub ","14 maret pukul 01.12"))
        Listnotifikasi.add(itemdata_notifikasi(R.drawable.gambar10,"Bayu" , "mengundang anda menyukai postingan","14 maret pikul 22.13"))


        NotifikasiRecyclerView.layoutManager=LinearLayoutManager(this)
        NotifikasiRecyclerView.setHasFixedSize(true)
        NotifikasiAdapter=Myadapter_notifikasi(Listnotifikasi)
        NotifikasiRecyclerView.adapter=NotifikasiAdapter
    }
}

