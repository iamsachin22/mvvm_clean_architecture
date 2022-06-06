package com.sachin.mvvm_clean_architecture.data.model.movie


import com.google.gson.annotations.SerializedName

data class MovieList(

    @SerializedName("results")
    val movies: List<Movie>

)