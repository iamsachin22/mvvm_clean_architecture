package com.sachin.mvvm_clean_architecture.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sachin.mvvm_clean_architecture.data.model.artist.Artist
import com.sachin.mvvm_clean_architecture.data.model.movie.Movie
import com.sachin.mvvm_clean_architecture.data.model.tvshow.TvShow


@Database(entities = [Movie::class, TvShow::class, Artist::class],
version = 1,
exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase(){
abstract fun movieDao(): MovieDao
abstract fun tvDao(): TvShowDao
abstract fun artistDao(): ArtistDao

}