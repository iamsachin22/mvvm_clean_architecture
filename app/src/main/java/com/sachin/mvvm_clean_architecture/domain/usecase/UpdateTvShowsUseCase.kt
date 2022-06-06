package com.sachin.mvvm_clean_architecture.domain.usecase

import com.sachin.mvvm_clean_architecture.data.model.tvshow.TvShow
import com.sachin.mvvm_clean_architecture.domain.repository.TvShowRepository

class UpdateTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>?=tvShowRepository.updateTvShows()
}