package com.example.tugas2

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas2.databinding.DaftarBinding


class daftar : AppCompatActivity() {

    private lateinit var binding: DaftarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.daftar)

        binding = DaftarBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.textView4.setOnClickListener {
            val Intentmasuk = Intent(this, masuk::class.java)
            startActivity(Intentmasuk)
        }
        binding.button.setOnClickListener {
            val Intentmasuk2 = Intent(this, masuk::class.java)
            startActivity(Intentmasuk2)
        }


    }
}

