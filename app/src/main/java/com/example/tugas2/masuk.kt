package com.example.tugas2

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas2.databinding.MasukBinding


class masuk : AppCompatActivity() {

    private lateinit var binding: MasukBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.masuk)

    binding = MasukBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView6.setOnClickListener {
            val Intentdaftar = Intent (this,daftar::class.java)
            startActivity(Intentdaftar)
        }

    binding.textView4.setOnClickListener {
            val Intentlupa_sandi = Intent (this,lupa_sandi::class.java)
            startActivity(Intentlupa_sandi)
        }

        binding.button.setOnClickListener {
            val Intenthome = Intent (this,home_beranda::class.java)
            startActivity(Intenthome)
        }




            }
        }

