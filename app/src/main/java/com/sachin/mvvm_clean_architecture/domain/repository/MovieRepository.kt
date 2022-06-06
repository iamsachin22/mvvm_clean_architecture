package com.sachin.mvvm_clean_architecture.domain.repository

import com.sachin.mvvm_clean_architecture.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?

}