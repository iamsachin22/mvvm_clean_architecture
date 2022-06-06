package com.sachin.mvvm_clean_architecture.data.repository.movie.datasource

import com.sachin.mvvm_clean_architecture.data.model.movie.Movie

interface MovieLocalDataSource {
  suspend fun getMoviesFromDB():List<Movie>
  suspend fun saveMoviesToDB(movies:List<Movie>)
  suspend fun clearAll()
}