package com.y4kuzabanzai.myownmvvmsimpler.di.movie

import com.y4kuzabanzai.myownmvvmsimpler.presentation.MoviesActivity
import dagger.Subcomponent

/**Seguimos aqui 11
 * Este sera un subcomponente de MoviesModule
 * Este subcomponente sera utilizado para injectarlo dentro de MoviesActivity
 * con las dependencias provistas en MovieModule*/

@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {

    fun inject(moviesActivity: MoviesActivity)

    /**Tambien debemos crear un subcomponent factory dentro de esta Interfaz para que AppComponent sepa
     * como crear instancias de este MovieComponent subcomponent*/
    @Subcomponent.Factory
    interface Factory {
        fun create(): MovieSubComponent
    }
}