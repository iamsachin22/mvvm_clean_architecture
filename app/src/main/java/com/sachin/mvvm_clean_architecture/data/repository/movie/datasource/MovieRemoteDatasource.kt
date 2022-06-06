package com.sachin.mvvm_clean_architecture.data.repository.movie.datasource

import com.sachin.mvvm_clean_architecture.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
   suspend fun getMovies(): Response<MovieList>
}