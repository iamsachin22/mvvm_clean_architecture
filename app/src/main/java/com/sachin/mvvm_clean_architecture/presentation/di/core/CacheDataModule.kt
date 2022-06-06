package com.sachin.mvvm_clean_architecture.presentation.di.core

import com.sachin.mvvm_clean_architecture.data.repository.artist.datasource.ArtistCacheDataSource
import com.sachin.mvvm_clean_architecture.data.repository.artist.datasourceImpl.ArtistCacheDataSourceImpl
import com.sachin.mvvm_clean_architecture.data.repository.movie.datasource.MovieCacheDataSource
import com.sachin.mvvm_clean_architecture.data.repository.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.sachin.mvvm_clean_architecture.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.sachin.mvvm_clean_architecture.data.repository.tvshow.datasourceImpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }


}