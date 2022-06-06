package com.sachin.mvvm_clean_architecture.presentation.tv

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.sachin.mvvm_clean_architecture.domain.usecase.GetTvShowsUseCase
import com.sachin.mvvm_clean_architecture.domain.usecase.UpdateTvShowsUseCase

class TvShowViewModel(
    private val getTvShowsUseCase: GetTvShowsUseCase,
    private val updateTvShowsUseCase: UpdateTvShowsUseCase
) : ViewModel() {

 fun getTvShows() = liveData {
     val tvShowList = getTvShowsUseCase.execute()
     emit(tvShowList)
 }

 fun updateTvShows() = liveData {
     val tvShowList = updateTvShowsUseCase.execute()
     emit(tvShowList)
 }
}
