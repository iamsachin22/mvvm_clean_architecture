package com.sachin.mvvm_clean_architecture.domain.usecase

import com.sachin.mvvm_clean_architecture.data.model.artist.Artist
import com.sachin.mvvm_clean_architecture.domain.repository.ArtistRepository

class GetArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.getArtists()

}