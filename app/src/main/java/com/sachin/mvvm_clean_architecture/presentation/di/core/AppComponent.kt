package com.sachin.mvvm_clean_architecture.presentation.di.core

import com.sachin.mvvm_clean_architecture.presentation.di.artist.ArtistSubComponent
import com.sachin.mvvm_clean_architecture.presentation.di.movie.MovieSubComponent
import com.sachin.mvvm_clean_architecture.presentation.di.tvshow.TvShowSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
AppModule::class,
NetModule::class,
DataBaseModule::class,
UseCaseModule::class,
RepositoryModule::class,
RemoteDataModule::class,
LocalDataModule::class,
CacheDataModule::class
])
interface AppComponent {

fun movieSubComponent():MovieSubComponent.Factory
fun tvShowSubComponent():TvShowSubComponent.Factory
fun artistSubComponent():ArtistSubComponent.Factory

}