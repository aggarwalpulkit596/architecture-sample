package com.example.architecture.domain.remote.response

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ArticleResponse(
    val url:String,
    val description:String?,
    val author:String?,
    val title:String,
    val urlToImage:String?,
    val publishedAt:String
)