package com.sachin.mvvm_clean_architecture.data.repository.artist.datasourceImpl

import com.sachin.mvvm_clean_architecture.data.api.TMDBService
import com.sachin.mvvm_clean_architecture.data.model.artist.ArtistList
import com.sachin.mvvm_clean_architecture.data.repository.artist.datasource.ArtistRemoteDatasource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): ArtistRemoteDatasource {
    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}

