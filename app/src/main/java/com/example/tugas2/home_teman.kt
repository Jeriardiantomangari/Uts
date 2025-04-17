package com.example.tugas2

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas2.databinding.HomeNotifikasiBinding
import com.example.tugas2.databinding.HomeTemanBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class home_teman : AppCompatActivity() {
    private lateinit var binding: HomeTemanBinding
    private lateinit var TemanRecyclerView: RecyclerView
    private lateinit var TemanAdapter: Myadapter_teman
    private lateinit var Listteman: ArrayList<itemdata_teman>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_teman)

        binding = HomeTemanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Bottom Navigation
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigation.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.beranda-> {
                    val intent = Intent(this, home_beranda::class.java)
                    startActivity(intent)
                    true
                }
                R.id.teman-> {

                    true
                }
                R.id.pesan -> {
                    val intent = Intent(this, home_pesan::class.java)
                    startActivity(intent)
                    true
                }
                R.id.notifikasi-> {
                    val intent = Intent(this, home_notifikasi::class.java)
                    startActivity(intent)
                    true
                }
                R.id.saya -> {
                    val intent = Intent(this, home_saya::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
        bottomNavigation.selectedItemId = R.id.teman



        TemanRecyclerView=findViewById(R.id.listteman)
        Listteman= java.util.ArrayList()

        Listteman.add(itemdata_teman(R.drawable.gambar1,"Jeri" , "konfirmasi", "hapus"))
        Listteman.add(itemdata_teman(R.drawable.gambar2,"Heru" ,  "konfirmasi", "hapus"))
        Listteman.add(itemdata_teman(R.drawable.gambar3,"Kurnia" ,  "konfirmasi", "hapus"))
        Listteman.add(itemdata_teman(R.drawable.gambar4,"Geraldi" ,  "konfirmasi", "hapus"))
        Listteman.add(itemdata_teman(R.drawable.gambar5,"Fauzan" ,  "konfirmasi", "hapus"))
        Listteman.add(itemdata_teman(R.drawable.gambar6,"Sriyanti" ,  "konfirmasi", "hapus"))
        Listteman.add(itemdata_teman(R.drawable.gambar7,"Risma" ,  "konfirmasi", "hapus"))
        Listteman.add(itemdata_teman(R.drawable.gambar8,"Edo" ,  "konfirmasi", "hapus"))
        Listteman.add(itemdata_teman(R.drawable.gambar9,"Hubert" ,  "konfirmasi", "hapus"))
        Listteman.add(itemdata_teman(R.drawable.gambar10,"Bayu" ,  "konfirmasi", "hapus"))


        TemanRecyclerView.layoutManager=LinearLayoutManager(this)
        TemanRecyclerView.setHasFixedSize(true)
        TemanAdapter=Myadapter_teman(Listteman)
        TemanRecyclerView.adapter=TemanAdapter
    }
}

