package com.example.tugas2

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas2.databinding.HomeBerandaBinding

class home_beranda : AppCompatActivity() {
    private lateinit var binding: HomeBerandaBinding

    private lateinit var BerandaRecyclerView: RecyclerView
    private lateinit var BerandaAdapter: Myadapter_beranda
    private lateinit var Listberanda: ArrayList<itemdata_beranda>

    private lateinit var StoryRecyclerView: RecyclerView
    private lateinit var StoryAdapter: Myadapter_beranda_story
    private lateinit var ListStory: ArrayList<itemdata_beranda_story>

    override fun onCreate(savedInstanceState: Bundle?) { 
        super.onCreate(savedInstanceState)


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

        // Setup RecyclerView Beranda
        BerandaRecyclerView = findViewById(R.id.listberanda)
        Listberanda = ArrayList()
        Listberanda.add(itemdata_beranda(R.drawable.gambar1, R.drawable.motor5, "Jeri", "1 jam yang lalu", "Hitam maniss gak tuhhh"))
        Listberanda.add(itemdata_beranda(R.drawable.gambar2, R.drawable.motor4, "Hubert", "6 jam yang lalu", "Anjass"))
        Listberanda.add(itemdata_beranda(R.drawable.gambar4, R.drawable.motor3, "Geraldi", "10 jam yang lalu", "P balap"))
        Listberanda.add(itemdata_beranda(R.drawable.gambar5, R.drawable.motor2, "Fauzan", "7 menit yang lalu ", "Ingpo ngabuburit"))
        Listberanda.add(itemdata_beranda(R.drawable.gambar8, R.drawable.motor6, "Edo", "6 detik yang lalu", "Mengkerenn"))
        Listberanda.add(itemdata_beranda(R.drawable.gambar9, R.drawable.motor7, "Heru", "12 jam yang lalu", "Dijual full modif"))
        Listberanda.add(itemdata_beranda(R.drawable.gambar10, R.drawable.motor1, "Bayu", "7 jam yang lalu", "Mode Bersih"))

        BerandaRecyclerView.layoutManager = LinearLayoutManager(this)
        BerandaRecyclerView.setHasFixedSize(true)
        BerandaAdapter = Myadapter_beranda(Listberanda)
        BerandaRecyclerView.adapter = BerandaAdapter

        // Setup RecyclerView Story
        StoryRecyclerView = findViewById(R.id.liststory)
        ListStory = ArrayList()

        ListStory.add(itemdata_beranda_story(R.drawable.gambar1, "Jeri","50 menit", R.raw.storyjeri))
        ListStory.add(itemdata_beranda_story(R.drawable.gambar9, "Hubert","3 jam", R.raw.storyhubert))
        ListStory.add(itemdata_beranda_story(R.drawable.gambar2, "Heru","12 jam", R.raw.storyheru))
        ListStory.add(itemdata_beranda_story(R.drawable.gambar5, "Fauzan","kemarin 22:21", R.raw.storyfauzan))
        ListStory.add(itemdata_beranda_story(R.drawable.gambar4, "Geraldi","kemarin 23:12", R.raw.storygeral))
        ListStory.add(itemdata_beranda_story(R.drawable.gambar10, "Bayu","kemarin 23:13", R.raw.storybayu))



        StoryRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        StoryRecyclerView.setHasFixedSize(true)
        StoryAdapter = Myadapter_beranda_story(ListStory)
        StoryRecyclerView.adapter = StoryAdapter

        StoryAdapter.onItemClick = {
            val intent = Intent(this, home_beranda_detail_story_video::class.java)
            intent.putExtra("story",it)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.liststory)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
