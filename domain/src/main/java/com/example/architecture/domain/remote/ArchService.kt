package com.example.architecture.domain.remote

import com.example.architecture.domain.BuildConfig
import com.example.architecture.domain.remote.response.ArticleListResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface ArchService {
    @Headers("Authorization: ${BuildConfig.API_KEY}")
    @GET("top-headlines?country=us")
    suspend fun getArticles(): ArticleListResponse
}