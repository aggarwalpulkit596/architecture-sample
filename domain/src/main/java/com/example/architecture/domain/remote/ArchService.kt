package com.example.architecture.domain.remote

import com.example.architecture.domain.remote.response.ArticleListResponse
import retrofit2.http.GET

interface ArchService {
    @GET("top-headlines?country=us")
    suspend fun getArticles():ArticleListResponse
}