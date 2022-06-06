package com.sachin.mvvm_clean_architecture.data.repository.movie.datasourceImpl

import com.sachin.mvvm_clean_architecture.data.api.TMDBService
import com.sachin.mvvm_clean_architecture.data.model.movie.MovieList
import com.sachin.mvvm_clean_architecture.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}

