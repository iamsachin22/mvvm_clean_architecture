package com.sachin.mvvm_clean_architecture.data.repository.tvshow.datasourceImpl

import com.sachin.mvvm_clean_architecture.data.api.TMDBService
import com.sachin.mvvm_clean_architecture.data.model.tvshow.TvShowList
import com.sachin.mvvm_clean_architecture.data.repository.tvshow.datasource.TvShowRemoteDatasource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): TvShowRemoteDatasource {
    override suspend fun getTvShows()
            : Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}

