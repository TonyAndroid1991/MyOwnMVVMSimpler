package com.y4kuzabanzai.myownmvvmsimpler.data.models

import com.google.gson.annotations.SerializedName

data class MovieList(

    @SerializedName("results")
    val movies: List<Movie>

)