package com.y4kuzabanzai.myownmvvmsimpler.presentation

import android.app.Application
import com.y4kuzabanzai.myownmvvmsimpler.BuildConfig
import com.y4kuzabanzai.myownmvvmsimpler.di.core.*
import com.y4kuzabanzai.myownmvvmsimpler.di.movie.MovieSubComponent

/**Seguimos aqui 13
 * Esta clase sera la que añadira los parametros de constructor a los modulos que lo requieran
 * Esta clase siempre se tiene que añadir al Manifest file
 * Una vez hecho todo esto ya podemos inyectar dentro de las Activities*/

class App : Application(), Injector {

    /**Es necesario tener una variable de referencia de la Interfaz AppComponent*/
    private lateinit var appComponent: AppComponent


    override fun onCreate() {
        super.onCreate()

        /**Cuando inicializamos appComponent no necesitamos añadir todos los modulos
         * solamente los modulos con parametros en los constructores*/
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(applicationContext))
                .netModule(NetModule(BuildConfig.BASE_URL))
                .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
                .build()
    }

    override fun createMovieSubComponent(): MovieSubComponent {
       return appComponent.movieSubComponent().create()
    }
}