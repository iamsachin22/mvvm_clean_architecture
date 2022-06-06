package com.sachin.mvvm_clean_architecture.presentation.di.artist

import com.sachin.mvvm_clean_architecture.domain.usecase.GetArtistsUseCase
import com.sachin.mvvm_clean_architecture.domain.usecase.UpdateArtistsUseCase
import com.sachin.mvvm_clean_architecture.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }

}