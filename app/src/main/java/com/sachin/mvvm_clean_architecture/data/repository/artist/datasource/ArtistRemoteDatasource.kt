package com.sachin.mvvm_clean_architecture.data.repository.artist.datasource

import com.sachin.mvvm_clean_architecture.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDatasource {
   suspend fun getArtists(): Response<ArtistList>
}