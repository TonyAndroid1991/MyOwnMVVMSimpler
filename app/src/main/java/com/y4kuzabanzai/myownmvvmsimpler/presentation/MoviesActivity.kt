package com.y4kuzabanzai.myownmvvmsimpler.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.y4kuzabanzai.myownmvvmsimpler.R
import com.y4kuzabanzai.myownmvvmsimpler.databinding.ActivityMoviesBinding
import com.y4kuzabanzai.myownmvvmsimpler.di.core.Injector
import javax.inject.Inject

class MoviesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMoviesBinding

    @Inject
    lateinit var factory: MoviesViewModelFactory

    private lateinit var moviesViewModel: MoviesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_movies)

        (application as Injector).createMovieSubComponent().inject(this)
        moviesViewModel = ViewModelProvider(this, factory).get(MoviesViewModel::class.java)

        val responseLiveData = moviesViewModel.getMovies()
        responseLiveData.observe(this, Observer {
            Log.i("TAG", "onCreate: ${it.toString()}")
        })
    }
}