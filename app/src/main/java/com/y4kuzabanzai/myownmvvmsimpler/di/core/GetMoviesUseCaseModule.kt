package com.y4kuzabanzai.myownmvvmsimpler.di.core

import com.y4kuzabanzai.myownmvvmsimpler.domain.repository.MovieRepository
import com.y4kuzabanzai.myownmvvmsimpler.domain.usecases.GetMoviesUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**Seguimos aqui 7
 * Lo normal seria crear un UseCasesModule con los casos de uso y lo mas optimo, pero como solo tenemos uno lo llamamos GetMoviesUseCase
 * estas dependencias son provistas por MovieRempositoryModule*/
@Module
class GetMoviesUseCaseModule {


    @Provides
    fun providesGetMoviesUseCase(movieRepository: MovieRepository): GetMoviesUseCase {
        return GetMoviesUseCase(movieRepository)
    }
}