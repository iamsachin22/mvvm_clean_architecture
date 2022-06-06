package com.sachin.mvvm_clean_architecture.presentation

import android.app.Application
import com.sachin.mvvm_clean_architecture.BuildConfig
import com.sachin.mvvm_clean_architecture.presentation.di.Injector
import com.sachin.mvvm_clean_architecture.presentation.di.artist.ArtistSubComponent
import com.sachin.mvvm_clean_architecture.presentation.di.core.*
import com.sachin.mvvm_clean_architecture.presentation.di.movie.MovieSubComponent
import com.sachin.mvvm_clean_architecture.presentation.di.tvshow.TvShowSubComponent

class App : Application(), Injector {
private lateinit var appComponent:AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()

    }

    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }

    override fun createTvShowSubComponent(): TvShowSubComponent {
       return appComponent.tvShowSubComponent().create()
    }

    override fun createArtistSubComponent(): ArtistSubComponent {
        return appComponent.artistSubComponent().create()
    }

}