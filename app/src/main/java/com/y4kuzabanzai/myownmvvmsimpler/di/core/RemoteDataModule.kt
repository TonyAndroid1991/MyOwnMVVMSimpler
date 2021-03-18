package com.y4kuzabanzai.myownmvvmsimpler.di.core

import com.y4kuzabanzai.myownmvvmsimpler.data.repository.datasources.MovieRemoteDataSource
import com.y4kuzabanzai.myownmvvmsimpler.data.repository.implementations.MovieRemoteDataSourceImpl
import com.y4kuzabanzai.myownmvvmsimpler.retrofit.ApiService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**Seguimos aqui 5
 * En estos modulos lo que se proveen son las implementaciones de los data source en este caso sera RemoteDataSource
 * */
@Module
class RemoteDataModule(private val apiKey: String) {


    /**En el caso del apiService, dagger sera el que provea esta dependencia, dado que ya hemos creado el NetModule
     *Aqui proveemos las dependencias que seran utilizadas en MovieRepositoryModule*/
    @Singleton
    @Provides
    fun providesRemoteDataSource(apiService: ApiService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(apiService, apiKey)
    }
}