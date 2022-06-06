package com.sachin.mvvm_clean_architecture.data.repository.artist.datasource

import com.sachin.mvvm_clean_architecture.data.model.artist.Artist

interface ArtistLocalDataSource {
  suspend fun getArtistsFromDB():List<Artist>
  suspend fun saveArtistsToDB(artists:List<Artist>)
  suspend fun clearAll()
}