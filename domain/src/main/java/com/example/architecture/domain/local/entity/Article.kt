package com.example.architecture.domain.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cachedArticles")
data class Article (
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val url:String,
    val description:String?,
    val author:String?,
    val title:String,
    val urlToImage:String?,
    val publishedAt:String
)