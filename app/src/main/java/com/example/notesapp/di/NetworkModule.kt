package com.example.notesapp.di

import com.example.notesapp.api.UserAPI
import com.example.notesapp.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit():Retrofit{
        return Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(BASE_URL).build()
    }


    @Singleton
    @Provides
    fun provideUserAPI(retrofitBuilder: Retrofit.Builder):UserAPI{
        return retrofitBuilder.build().create(UserAPI::class.java)
    }

}