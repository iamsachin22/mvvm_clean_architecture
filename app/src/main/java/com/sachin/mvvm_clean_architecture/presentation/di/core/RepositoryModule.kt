package com.sachin.mvvm_clean_architecture.presentation.di.core

import com.sachin.mvvm_clean_architecture.data.repository.artist.ArtistRepositoryImpl
import com.sachin.mvvm_clean_architecture.data.repository.artist.datasource.ArtistCacheDataSource
import com.sachin.mvvm_clean_architecture.data.repository.artist.datasource.ArtistLocalDataSource
import com.sachin.mvvm_clean_architecture.data.repository.artist.datasource.ArtistRemoteDatasource
import com.sachin.mvvm_clean_architecture.data.repository.movie.MovieRepositoryImpl
import com.sachin.mvvm_clean_architecture.data.repository.movie.datasource.MovieCacheDataSource
import com.sachin.mvvm_clean_architecture.data.repository.movie.datasource.MovieLocalDataSource
import com.sachin.mvvm_clean_architecture.data.repository.movie.datasource.MovieRemoteDatasource
import com.sachin.mvvm_clean_architecture.data.repository.tvshow.TvShowRepositoryImpl
import com.sachin.mvvm_clean_architecture.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.sachin.mvvm_clean_architecture.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.sachin.mvvm_clean_architecture.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.sachin.mvvm_clean_architecture.domain.repository.ArtistRepository
import com.sachin.mvvm_clean_architecture.domain.repository.MovieRepository
import com.sachin.mvvm_clean_architecture.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDatasource: TvShowRemoteDatasource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {

        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDatasource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {

        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDataSource,
            artistCacheDataSource
        )


    }

}