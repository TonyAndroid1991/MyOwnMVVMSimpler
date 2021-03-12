package com.y4kuzabanzai.myownmvvmsimpler.data.repository.implementations

import com.y4kuzabanzai.myownmvvmsimpler.data.repository.datasources.MovieRemoteDataSource
import com.y4kuzabanzai.myownmvvmsimpler.data.models.MovieList
import com.y4kuzabanzai.myownmvvmsimpler.retrofit.ApiService
import retrofit2.Response


/**Seguimos aqui 4
 * Dado que esta es la clase ejecutora y la que se conectara con la api, necesitamos una instancia de ApiService como parametro de constructor
 * y necesitaremos tambien un apiKey
 * luego cuando se este creando la capa de presentacion se crearan codigos para inyectar estas dependencias, en este caso sera la de ApiService*/
class MovieRemoteDataSourceImpl(private val apiService: ApiService, private val apiKey: String) :
    MovieRemoteDataSource {

    override suspend fun getMovies(): Response<MovieList> {
       return apiService.getPopularMovies(apiKey)
    }
}