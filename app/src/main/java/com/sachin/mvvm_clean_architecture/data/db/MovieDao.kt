package com.sachin.mvvm_clean_architecture.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sachin.mvvm_clean_architecture.data.model.movie.Movie

@Dao
interface MovieDao {

@Insert(onConflict = OnConflictStrategy.REPLACE)
suspend fun saveMovies(movies : List<Movie>)

@Query("DELETE FROM popular_movies")
suspend fun deleteAllMovies()

@Query("SELECT * FROM popular_movies")
suspend fun getMovies():List<Movie>
}