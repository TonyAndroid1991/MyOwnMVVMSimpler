package com.y4kuzabanzai.myownmvvmsimpler.di.core

import com.y4kuzabanzai.myownmvvmsimpler.di.movie.MovieSubComponent
import dagger.Component
import javax.inject.Singleton

/**Seguimos aqui 12
 *Este sera nuestro AppComponent, aqui pondremos codigo para acceder a los SubComponentFactories
 * en este caso MovieSubComponent.Factory
 * luego de esto crearemos una clase que extienda de Application
 * y dado que tenemos subcomponentes en esta clase necesitamos crear funciones para obtenerlos
 *
 * Las buenas practicas nos sugieren crear una Interfaz Injector con declaraciones abstractas*/
@Singleton
@Component(modules = [
    AppModule::class,
    GetMoviesUseCaseModule::class,
    MovieRepositoryModule::class,
    NetModule::class,
    RemoteDataModule::class
])
interface AppComponent {

    fun movieSubComponent(): MovieSubComponent.Factory
}