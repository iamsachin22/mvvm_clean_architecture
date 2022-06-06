package com.sachin.mvvm_clean_architecture.presentation.di.core

import com.sachin.mvvm_clean_architecture.data.api.TMDBService
import com.sachin.mvvm_clean_architecture.data.repository.artist.datasource.ArtistRemoteDatasource
import com.sachin.mvvm_clean_architecture.data.repository.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.sachin.mvvm_clean_architecture.data.repository.movie.datasource.MovieRemoteDatasource
import com.sachin.mvvm_clean_architecture.data.repository.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.sachin.mvvm_clean_architecture.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.sachin.mvvm_clean_architecture.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDatasource {
        return MovieRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

    @Singleton
    @Provides
    fun provideTvRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDatasource {
        return TvShowRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDatasource {
        return ArtistRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }


}