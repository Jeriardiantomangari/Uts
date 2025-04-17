package com.example.tugas2

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas2.databinding.HomeSayaBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class home_saya : AppCompatActivity() {

    private lateinit var binding: HomeSayaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeSayaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Aksi tombol keluar
        binding.textViewkeluar.setOnClickListener {
            val intentMasuk = Intent(this, masuk::class.java)
            startActivity(intentMasuk)
        }

        // Aksi tombol galeri
        binding.textView9.setOnClickListener {
            val intentGaleri = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivity(intentGaleri)
        }

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
                    val intent = Intent(this, home_teman::class.java)
                    startActivity(intent)
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

                    true
                }
                else -> false
            }
        }
        bottomNavigation.selectedItemId = R.id.saya
    }
}
