package com.example.architecture.domain.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.architecture.domain.local.entity.Article
import kotlinx.coroutines.flow.Flow


@Dao
// TODO: Inherit from BaseDao
interface ArticleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertArticles(articles:List<Article>)

    @Query("Delete From cachedArticles")
    suspend fun clearCache()

    @Query("Select * from cachedArticles")
    fun getCachedArticles(): Flow<List<Article>>
}