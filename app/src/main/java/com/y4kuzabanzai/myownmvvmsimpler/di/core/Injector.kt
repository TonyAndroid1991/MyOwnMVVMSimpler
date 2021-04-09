package com.y4kuzabanzai.myownmvvmsimpler.di.core

import com.y4kuzabanzai.myownmvvmsimpler.di.movie.MovieSubComponent

/**Seguimos aqui 13
 * Esta clase sera implementada por la clase App*/

interface Injector {

    fun createMovieSubComponent(): MovieSubComponent
}