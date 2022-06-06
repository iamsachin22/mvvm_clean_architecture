package com.sachin.mvvm_clean_architecture.presentation.di.core

import com.sachin.mvvm_clean_architecture.data.db.ArtistDao
import com.sachin.mvvm_clean_architecture.data.db.MovieDao
import com.sachin.mvvm_clean_architecture.data.db.TvShowDao
import com.sachin.mvvm_clean_architecture.data.repository.artist.datasource.ArtistLocalDataSource
import com.sachin.mvvm_clean_architecture.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.sachin.mvvm_clean_architecture.data.repository.movie.datasource.MovieLocalDataSource
import com.sachin.mvvm_clean_architecture.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.sachin.mvvm_clean_architecture.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.sachin.mvvm_clean_architecture.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao):MovieLocalDataSource{
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao):TvShowLocalDataSource{
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao : ArtistDao):ArtistLocalDataSource{
        return ArtistLocalDataSourceImpl(artistDao)
    }


}