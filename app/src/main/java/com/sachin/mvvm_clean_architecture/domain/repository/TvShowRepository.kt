package com.sachin.mvvm_clean_architecture.domain.repository

import com.sachin.mvvm_clean_architecture.data.model.tvshow.TvShow

interface TvShowRepository {
    suspend fun getTvShows():List<TvShow>?
    suspend fun updateTvShows():List<TvShow>?
}