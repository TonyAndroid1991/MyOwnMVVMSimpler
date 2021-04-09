package com.y4kuzabanzai.myownmvvmsimpler.di.movie

import com.y4kuzabanzai.myownmvvmsimpler.domain.usecases.GetMoviesUseCase
import com.y4kuzabanzai.myownmvvmsimpler.presentation.MoviesViewModelFactory
import dagger.Module
import dagger.Provides

/**Seguimos aqui 10
 * Este modulo sera el que provea la dependencia de MoviesViewModelFactory
 * Este modulo requiere un MovieScope*/
@Module
class MovieModule {

    /**Las dependecias de GetMoviesUseCase son provistas por GetMoviesUseCasesModule*/
    @MovieScope
    @Provides
    fun providesMoviesViewModelFactory(getMoviesUseCase: GetMoviesUseCase): MoviesViewModelFactory {
        return MoviesViewModelFactory(getMoviesUseCase)
    }
}