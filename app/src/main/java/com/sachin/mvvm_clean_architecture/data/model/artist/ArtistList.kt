package com.sachin.mvvm_clean_architecture.data.model.artist


import com.google.gson.annotations.SerializedName

data class ArtistList(

    @SerializedName("results")
    val artists: List<Artist>

)