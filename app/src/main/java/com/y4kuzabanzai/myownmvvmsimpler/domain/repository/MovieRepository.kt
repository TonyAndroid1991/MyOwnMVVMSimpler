package com.y4kuzabanzai.myownmvvmsimpler.domain.repository

import com.y4kuzabanzai.myownmvvmsimpler.data.models.Movie


/**Seguimos aqui 1
 * Aqui necesitamos definir un metodo abstracto que retorne una lista de Instancias de Movie como requiere el caso de uso de GetMovies
 *estos repositorios seran implementados en el DataLayer, en este caso seria la clase MovieRepositoryImpl*/
interface MovieRepository {

    suspend fun getMovies(): List<Movie>?
}