package com.sachin.mvvm_clean_architecture.presentation.di

import com.sachin.mvvm_clean_architecture.presentation.di.artist.ArtistSubComponent
import com.sachin.mvvm_clean_architecture.presentation.di.movie.MovieSubComponent
import com.sachin.mvvm_clean_architecture.presentation.di.tvshow.TvShowSubComponent

interface Injector {
   fun createMovieSubComponent():MovieSubComponent
   fun createTvShowSubComponent():TvShowSubComponent
   fun createArtistSubComponent():ArtistSubComponent
}