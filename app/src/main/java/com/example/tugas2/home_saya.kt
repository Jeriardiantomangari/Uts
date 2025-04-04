package com.example.tugas2

import android.os.Bundle
import android.content.Intent
import android.provider.MediaStore
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas2.databinding.HomeSayaBinding


class home_saya : AppCompatActivity() {

    private lateinit var binding:HomeSayaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_saya)

        binding = HomeSayaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewkeluar.setOnClickListener {
            val Intentmasuk = Intent(this, masuk::class.java)
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
        binding.beranda.setOnClickListener {
            val Intentmasuk = Intent(this, home_beranda::class.java)
            startActivity(Intentmasuk)
        }
        binding.textView9.setOnClickListener {
            val intentGaleri = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivity(intentGaleri)
        }


    }
}

