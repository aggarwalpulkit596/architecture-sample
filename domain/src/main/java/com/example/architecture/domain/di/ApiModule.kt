package com.example.architecture.domain.di

import com.haroldadmin.cnradapter.NetworkResponseAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton
import com.example.architecture.domain.BuildConfig
import com.example.architecture.domain.remote.HeaderInterceptor

@InstallIn(SingletonComponent::class)
@Module
class ApiModule {

    @Provides
    @Singleton
    fun providesHttpClient(headerInterceptor: HeaderInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(CONNECT_TIMEOUT.toLong(), TimeUnit.SECONDS)
            .readTimeout(READ_TIMEOUT.toLong(), TimeUnit.SECONDS)
            .writeTimeout(WRITE_TIMEOUT.toLong(), TimeUnit.SECONDS)
            .addInterceptor(headerInterceptor)
            .build()
    }

    @Singleton
    @Provides
    fun provideRetrofitBuilder(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(BuildConfig.ARCH_SAMPLE_BASE_URL)
            .addCallAdapterFactory(NetworkResponseAdapterFactory())
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

    companion object {
        const val CONNECT_TIMEOUT = 30
        const val READ_TIMEOUT = 30
        const val WRITE_TIMEOUT = 30
        private const val CACHE_SIZE = 5 * 1024 * 1024L // 5 MB
    }
}