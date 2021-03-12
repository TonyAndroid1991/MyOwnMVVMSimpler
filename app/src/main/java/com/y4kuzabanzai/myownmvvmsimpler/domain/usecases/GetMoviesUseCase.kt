package com.y4kuzabanzai.myownmvvmsimpler.domain.usecases

import com.y4kuzabanzai.myownmvvmsimpler.domain.repository.MovieRepository
import com.y4kuzabanzai.myownmvvmsimpler.data.models.Movie

/** EMPEZAMOS AQUI
 * En esta clase necesitamos crear una funcion que nos retorne una lista de instancias de Movie
 * pero esto, un caso de uso no lo puede hacer sin apoyo de un repositorio, por lo tanto este repositorio debe tener un metodo que retorne
 * una lista de instancias de Movie, Y LUEGO SEREMOS CAPACES DE INYECTAR UNA INSTANCIA DE ESE REPOSITORIO A NUESTRO CASO DE USO COMO UN PARAMETRO DE CONSTRUCTOR
 * en este caso sera MovieRepository.
 *
 * Luego un ViewModel (en este caso MoviesViewModel) puede hacer uso de este UseCase para obtener la lista de instancias de Movie
 * ESTOS USECASES SERAN EJECUTADOS DESDE SUS RESPECTIVOS VIEWMODELS*/
class GetMoviesUseCase(private val movieRepository: MovieRepository) {

    suspend fun execute(): List<Movie>? = movieRepository.getMovies()

}