package com.sachin.mvvm_clean_architecture.presentation.di.tvshow

import com.sachin.mvvm_clean_architecture.domain.usecase.GetTvShowsUseCase
import com.sachin.mvvm_clean_architecture.domain.usecase.UpdateTvShowsUseCase
import com.sachin.mvvm_clean_architecture.presentation.tv.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }

}