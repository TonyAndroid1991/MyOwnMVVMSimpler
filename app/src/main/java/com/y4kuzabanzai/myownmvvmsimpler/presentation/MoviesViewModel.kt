package com.y4kuzabanzai.myownmvvmsimpler.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.y4kuzabanzai.myownmvvmsimpler.domain.usecases.GetMoviesUseCase

/**En arquitectura clean los viewmodels dependen totalmente de los casos de uso, en este caso seria GetMoviesUseCase
 * estos casos de uso seran inyectados segun tengo entendido*/
class MoviesViewModel(private val getMoviesUseCase: GetMoviesUseCase) : ViewModel() {

    fun getMovies() = liveData {
        emit(getMoviesUseCase.execute())
    }
}