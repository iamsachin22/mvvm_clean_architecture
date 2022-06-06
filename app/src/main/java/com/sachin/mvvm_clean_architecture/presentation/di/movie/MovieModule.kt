package com.sachin.mvvm_clean_architecture.presentation.di.movie

import com.sachin.mvvm_clean_architecture.domain.usecase.GetMoviesUseCase
import com.sachin.mvvm_clean_architecture.domain.usecase.UpdateMoviesUsecase
import com.sachin.mvvm_clean_architecture.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUsecase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }

}