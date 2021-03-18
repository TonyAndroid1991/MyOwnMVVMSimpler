package com.y4kuzabanzai.myownmvvmsimpler.di.core

import com.y4kuzabanzai.myownmvvmsimpler.data.repository.datasources.MovieRemoteDataSource
import com.y4kuzabanzai.myownmvvmsimpler.data.repository.implementations.MovieRepositoryImpl
import com.y4kuzabanzai.myownmvvmsimpler.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


/**Seguimos aqui 6*/
@Module
class MovieRepositoryModule() {

    /**En este caso MovieRemoteDataSource sera provisto por RemoteDataModule, que ya creo la dependencia*/
    @Singleton
    @Provides
    fun providesMovieRepository(movieRemoteDataSource: MovieRemoteDataSource): MovieRepository {
        return MovieRepositoryImpl(movieRemoteDataSource)
    }
}