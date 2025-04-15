package com.example.tugas2

import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class home_beranda_detail_story_video : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_data_beranda_detail_story_video)

        val story = intent.getParcelableExtra<itemdata_beranda_story>("story")

        if (story != null) {
            val imageView: ImageView = findViewById(R.id.imageView)
            val textViewTitle: TextView = findViewById(R.id.textView22)
            val textViewTime: TextView = findViewById(R.id.textView26)
            val videoView: VideoView = findViewById(R.id.videoView)

            imageView.setImageResource(story.gambar)
            textViewTitle.text = story.nama
            textViewTime.text = story.waktu

            if (story.video != null) {
                val videoUri = Uri.parse("android.resource://$packageName/${story.video}")
                videoView.setVideoURI(videoUri)
                videoView.setOnPreparedListener { mediaPlayer ->
                    mediaPlayer.isLooping = true
                    videoView.start()
                }
            }
        }
    }
}
