package com.y4kuzabanzai.myownmvvmsimpler.data.repository.implementations

import android.util.Log
import com.y4kuzabanzai.myownmvvmsimpler.data.repository.datasources.MovieRemoteDataSource
import com.y4kuzabanzai.myownmvvmsimpler.data.models.Movie
import com.y4kuzabanzai.myownmvvmsimpler.domain.repository.MovieRepository
import java.lang.Exception

/**Seguimos aqui 2
 * Respetando la arquitectura clean, debemos implementar las interfaces de domain en la capa del Data layer y
 *en orden de obtener la info usando getMovies, requerimos crear una clase MovieRemoteDataSource.
 * En clean architecture se usan interfaces para comunicarse entre los componentes
 *
 * Esta clase depende totalmente de los DataSources*/
class MovieRepositoryImpl(private val movieRemoteDataSource: MovieRemoteDataSource) : MovieRepository {

    override suspend fun getMovies(): List<Movie>? {
        return getMoviesFromApi()
    }

    suspend fun getMoviesFromApi(): List<Movie>? {
        lateinit var movieList: List<Movie>

        try {
            val response = movieRemoteDataSource.getMovies()
            val body = response.body()

            if (body != null) {
                movieList = body.movies
            }

        } catch (e: Exception) {
            Log.i("TAG", "getMoviesFromApi: $e")
        }

        return movieList
    }
}