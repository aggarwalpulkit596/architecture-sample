package com.example.architecture.domain.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.architecture.domain.BuildConfig
import com.example.architecture.domain.local.dao.ArticleDao
import com.example.architecture.domain.local.entity.ArticleEntity

@Database(
    entities = [ArticleEntity::class],
    exportSchema = BuildConfig.ARCH_SAMPLE_EXPORT_SCHEMA,
    version = BuildConfig.ARCH_SAMPLE_DATABASE_VERSION,
)
abstract class ArchDatabase: RoomDatabase() {
    abstract fun getArticleDao(): ArticleDao
}