package com.sachin.mvvm_clean_architecture.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.sachin.mvvm_clean_architecture.domain.usecase.GetMoviesUseCase
import com.sachin.mvvm_clean_architecture.domain.usecase.UpdateMoviesUsecase

class MovieViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUsecase: UpdateMoviesUsecase
): ViewModel() {

    fun getMovies() = liveData {
        val movieList = getMoviesUseCase.execute()
        emit(movieList)
    }

    fun updateMovies() = liveData {
        val movieList = updateMoviesUsecase.execute()
        emit(movieList)
    }

    }





