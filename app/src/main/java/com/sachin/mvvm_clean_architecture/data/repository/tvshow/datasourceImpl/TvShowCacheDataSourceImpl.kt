package com.sachin.mvvm_clean_architecture.data.repository.tvshow.datasourceImpl

import com.sachin.mvvm_clean_architecture.data.model.tvshow.TvShow
import com.sachin.mvvm_clean_architecture.data.repository.tvshow.datasource.TvShowCacheDataSource

class TvShowCacheDataSourceImpl :
    TvShowCacheDataSource {
    private var tvShowList = ArrayList<TvShow>()

    override suspend fun getTvShowsFromCache(): List<TvShow> {
        return tvShowList
    }

    override suspend fun saveTvShowsToCache(tvShows: List<TvShow>) {
       tvShowList.clear()
       tvShowList = ArrayList(tvShows)
    }
}