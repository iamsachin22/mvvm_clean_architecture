package com.sachin.mvvm_clean_architecture.data.repository.movie.datasourceImpl

import com.sachin.mvvm_clean_architecture.data.model.movie.Movie
import com.sachin.mvvm_clean_architecture.data.repository.movie.datasource.MovieCacheDataSource

class MovieCacheDataSourceImpl :
    MovieCacheDataSource {
    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
       movieList.clear()
       movieList = ArrayList(movies)
    }
}