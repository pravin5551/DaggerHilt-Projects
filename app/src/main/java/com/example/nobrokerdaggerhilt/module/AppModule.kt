package com.example.nobrokerdaggerhilt.module

import android.app.Application
import androidx.room.Room
import com.example.nobrokerdaggerhilt.remote.ApiClient
import com.example.nobrokerdaggerhilt.remote.Network
import com.example.nobrokerdaggerhilt.room.ListDatabase
import com.example.nobrokerdaggerhilt.utils.Constants
import com.example.nobrokerdaggerhilt.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun providesNoBrokerDatabase(
        app: Application
    ): ListDatabase {
        return Room.databaseBuilder(app, ListDatabase::class.java, "list_db")
            .fallbackToDestructiveMigration().build()
    }


    @Provides
    @Singleton
    fun providesRetrofit():Retrofit{
        val httpLoggingInterceptor =
            HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build())
            .build()
    }

    @Provides
    @Singleton
    fun provideNoBrokerApi(
        retrofit: Retrofit
    ):ApiClient{
        return retrofit.create(ApiClient::class.java)
    }


}