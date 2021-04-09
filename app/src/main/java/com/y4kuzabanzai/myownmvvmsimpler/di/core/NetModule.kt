package com.y4kuzabanzai.myownmvvmsimpler.di.core

import com.y4kuzabanzai.myownmvvmsimpler.BuildConfig
import com.y4kuzabanzai.myownmvvmsimpler.retrofit.ApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**Seguimos aqui 5
 * Este sera el modulo para obtener la instancia de retrofit
 * En este caso Dagger provee las dependencias necesarias para ser usadas en el RemoteDataSource
 * que seria la instancia de ApiService*/

@Module
class NetModule(private val baseUrl: String) {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BuildConfig.BASE_URL)
            .build()
    }

    @Singleton
    @Provides
    fun providesApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }
}