package com.sachin.mvvm_clean_architecture.data.repository.artist.datasourceImpl

import com.sachin.mvvm_clean_architecture.data.db.ArtistDao
import com.sachin.mvvm_clean_architecture.data.model.artist.Artist
import com.sachin.mvvm_clean_architecture.data.repository.artist.datasource.ArtistLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ArtistLocalDataSourceImpl(private val artistDao:ArtistDao):
    ArtistLocalDataSource {
    override suspend fun getArtistsFromDB(): List<Artist> {
       return artistDao.getArtists()
    }

    override suspend fun saveArtistsToDB(artists: List<Artist>) {
        CoroutineScope(Dispatchers.IO).launch {
            artistDao.saveArtists(artists)
        }
    }

    override suspend fun clearAll() {
       CoroutineScope(Dispatchers.IO).launch {
           artistDao.deleteAllArtists()
       }
    }
}