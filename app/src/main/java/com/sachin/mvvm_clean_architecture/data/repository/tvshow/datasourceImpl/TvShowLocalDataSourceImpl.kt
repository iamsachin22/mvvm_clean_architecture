package com.sachin.mvvm_clean_architecture.data.repository.tvshow.datasourceImpl

import com.sachin.mvvm_clean_architecture.data.db.TvShowDao
import com.sachin.mvvm_clean_architecture.data.model.tvshow.TvShow
import com.sachin.mvvm_clean_architecture.data.repository.tvshow.datasource.TvShowLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TvShowLocalDataSourceImpl(private val tvDao:TvShowDao):
    TvShowLocalDataSource {
    override suspend fun getTvShowsFromDB(): List<TvShow> {
       return tvDao.getTvShows()
    }

    override suspend fun saveTvShowsToDB(tvShows: List<TvShow>) {
        CoroutineScope(Dispatchers.IO).launch {
            tvDao.saveTvShows(tvShows)
        }
    }

    override suspend fun clearAll() {
       CoroutineScope(Dispatchers.IO).launch {
           tvDao.deleteAllTvShows()
       }
    }
}