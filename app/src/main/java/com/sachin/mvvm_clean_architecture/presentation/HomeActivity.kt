package com.sachin.mvvm_clean_architecture.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sachin.mvvm_clean_architecture.databinding.ActivityHomeBinding
import com.sachin.mvvm_clean_architecture.presentation.artist.ArtistActivity
import com.sachin.mvvm_clean_architecture.presentation.movie.MovieActivity
import com.sachin.mvvm_clean_architecture.presentation.tv.TvShowActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.movieButton.setOnClickListener {
         val intent = Intent(this,MovieActivity::class.java)
         startActivity(intent)
        }

        binding.tvButton.setOnClickListener {
            val intent = Intent(this,TvShowActivity::class.java)
            startActivity(intent)
        }

        binding.artistsButton.setOnClickListener {
            val intent = Intent(this,ArtistActivity::class.java)
            startActivity(intent)
        }
    }
}