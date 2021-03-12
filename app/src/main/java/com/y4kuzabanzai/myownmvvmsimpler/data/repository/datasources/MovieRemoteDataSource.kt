package com.y4kuzabanzai.myownmvvmsimpler.data.repository.datasources

import com.y4kuzabanzai.myownmvvmsimpler.data.models.MovieList
import retrofit2.Response

/**Seguimos aqui 3
 * Esta interfaz necesita tener un metodo que retorne un Response<MovieList>, justo como el metodo getMovie en ApiInterface
 * cada una de estas interfaces necesitan obviamente una clase que las implemente, en este caso seria MovieRemoteDataSourceImpl*/
interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}