package com.y4kuzabanzai.myownmvvmsimpler.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

/**Convertimos los mismos modelos en entity clases de Room, para ello tambien debemos añadir etiqueta @PrimaryKey*/
@Entity(tableName = "popular_movies")
data class Movie(

    @PrimaryKey
    @SerializedName("id")
    val id: Int,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("release_date")
    val releaseDate: String,
    @SerializedName("title")
    val title: String

)