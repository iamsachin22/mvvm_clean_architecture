package com.sachin.mvvm_clean_architecture.data.repository.tvshow.datasource

import com.sachin.mvvm_clean_architecture.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
   suspend fun getTvShows(): Response<TvShowList>
}