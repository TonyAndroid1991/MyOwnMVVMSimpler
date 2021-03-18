package com.y4kuzabanzai.myownmvvmsimpler.di.movie

import com.y4kuzabanzai.myownmvvmsimpler.presentation.MoviesActivity

/**Esta clase no requiere un cuerpo, no se por que
 * Esta clase tengo entendido que es para limitar el scope a determinadas activities, aunque a veces no es requerida
 * En este caso este scope sera utilizado para inyectarlo dentro de MoviesActivity a traves de un subcomponente*/
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class MovieScope {

}