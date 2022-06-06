package com.sachin.mvvm_clean_architecture.data.repository.movie.datasourceImpl

import com.sachin.mvvm_clean_architecture.data.db.MovieDao
import com.sachin.mvvm_clean_architecture.data.model.movie.Movie
import com.sachin.mvvm_clean_architecture.data.repository.movie.datasource.MovieLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieLocalDataSourceImpl(private val movieDao:MovieDao):
    MovieLocalDataSource {
    override suspend fun getMoviesFromDB(): List<Movie> {
       return movieDao.getMovies()
    }

    override suspend fun saveMoviesToDB(movies: List<Movie>) {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.saveMovies(movies)
        }
    }

    override suspend fun clearAll() {
       CoroutineScope(Dispatchers.IO).launch {
           movieDao.deleteAllMovies()
       }
    }
}