package com.y4kuzabanzai.myownmvvmsimpler.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.y4kuzabanzai.myownmvvmsimpler.domain.usecases.GetMoviesUseCase

class MoviesViewModelFactory(private val getMoviesUseCase: GetMoviesUseCase) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
       return MoviesViewModel(getMoviesUseCase) as T
    }
}