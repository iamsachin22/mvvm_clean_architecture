package com.sachin.mvvm_clean_architecture.data.repository.tvshow.datasource

import com.sachin.mvvm_clean_architecture.data.model.tvshow.TvShow

interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowsToCache(tvShows:List<TvShow>)

}