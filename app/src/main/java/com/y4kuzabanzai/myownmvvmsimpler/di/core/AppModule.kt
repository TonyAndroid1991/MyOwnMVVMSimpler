package com.y4kuzabanzai.myownmvvmsimpler.di.core

import android.content.Context
import com.y4kuzabanzai.myownmvvmsimpler.di.movie.MovieSubComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**Seguimos aqui 9
 * Este modulo sera el que proveera la dependencia de el contexto de aplicacion y lo que se le pasan son los subcomponentes en este caso*/
@Module(subcomponents = [MovieSubComponent::class])
class AppModule(private val context: Context) {

    @Singleton
    @Provides
    fun providesApplicationContext(): Context {

        return context.applicationContext
    }
}