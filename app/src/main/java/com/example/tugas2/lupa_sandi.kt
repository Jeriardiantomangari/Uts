package com.example.tugas2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas2.databinding.LupaSandiBinding


class lupa_sandi : AppCompatActivity() {

    private lateinit var binding: LupaSandiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lupa_sandi)

        binding = LupaSandiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            Toast.makeText(this, "Silahkan periksa, kode verifikasi yang dikirimkan ke Email anda", Toast.LENGTH_LONG).show()
        }

        }
    }
