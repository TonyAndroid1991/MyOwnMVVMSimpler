package com.y4kuzabanzai.myownmvvmsimpler.retrofit

import com.y4kuzabanzai.myownmvvmsimpler.data.models.MovieList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") apiKey: String): Response<MovieList>

}