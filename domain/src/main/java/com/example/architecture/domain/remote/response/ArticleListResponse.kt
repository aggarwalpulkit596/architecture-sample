package com.example.architecture.domain.remote.response

import com.example.architecture.domain.local.entity.Article
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ArticleListResponse(
    val status: String,
    val totalResults: Int,
    val articles: List<Article>
)