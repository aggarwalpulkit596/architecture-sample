package com.example.architecture.domain.di

import android.content.Context
import androidx.room.Room
import com.example.architecture.domain.BuildConfig
import com.example.architecture.domain.local.ArchDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {
    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ): ArchDatabase {
        return Room.databaseBuilder(
            context,
            ArchDatabase::class.java,
            BuildConfig.ARCH_SAMPLE_DATABASE_NAME
        ).build()
    }
}