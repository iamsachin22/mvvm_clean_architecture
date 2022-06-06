package com.sachin.mvvm_clean_architecture.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.sachin.mvvm_clean_architecture.domain.usecase.GetArtistsUseCase
import com.sachin.mvvm_clean_architecture.domain.usecase.UpdateArtistsUseCase

class ArtistViewModel(
    private val getArtistsUseCase: GetArtistsUseCase,
    private val updateArtistsUseCase: UpdateArtistsUseCase
): ViewModel() {

    fun getArtists() = liveData {
        val artistList = getArtistsUseCase.execute()
        emit(artistList)
    }

    fun updateArtists() = liveData {
        val artistList = updateArtistsUseCase.execute()
        emit(artistList)
    }

}