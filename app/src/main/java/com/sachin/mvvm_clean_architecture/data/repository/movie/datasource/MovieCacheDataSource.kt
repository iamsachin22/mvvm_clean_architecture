package com.sachin.mvvm_clean_architecture.data.repository.movie.datasource

import com.sachin.mvvm_clean_architecture.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movies:List<Movie>)

}