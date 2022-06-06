package com.sachin.mvvm_clean_architecture.domain.repository

import com.sachin.mvvm_clean_architecture.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtists():List<Artist>?
    suspend fun updateArtists():List<Artist>?
}