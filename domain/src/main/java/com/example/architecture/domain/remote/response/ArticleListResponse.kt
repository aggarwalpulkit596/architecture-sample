package com.example.architecture.domain.remote.response

import com.example.architecture.domain.local.entity.Article

data class ArticleListResponse (
    val status:String,
    val totalResults:Int,
    val articles:List<Article>)