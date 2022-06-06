package com.sachin.mvvm_clean_architecture.data.repository.tvshow.datasource

import com.sachin.mvvm_clean_architecture.data.model.tvshow.TvShow

interface TvShowLocalDataSource {
  suspend fun getTvShowsFromDB():List<TvShow>
  suspend fun saveTvShowsToDB(tvShows:List<TvShow>)
  suspend fun clearAll()
}