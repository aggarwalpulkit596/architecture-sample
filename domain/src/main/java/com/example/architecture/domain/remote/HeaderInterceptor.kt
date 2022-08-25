package com.example.architecture.domain.remote

import com.example.architecture.domain.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HeaderInterceptor @Inject constructor() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
            .addHeader("Authorization", BuildConfig.API_KEY)
            .build()
        return chain.proceed(request)
    }
}