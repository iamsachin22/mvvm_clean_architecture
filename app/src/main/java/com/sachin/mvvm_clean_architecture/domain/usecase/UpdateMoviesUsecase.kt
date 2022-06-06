package com.sachin.mvvm_clean_architecture.domain.usecase

import com.sachin.mvvm_clean_architecture.data.model.movie.Movie
import com.sachin.mvvm_clean_architecture.domain.repository.MovieRepository

class UpdateMoviesUsecase(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? = movieRepository.updateMovies()
}