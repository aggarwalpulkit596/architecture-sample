package com.example.architecture.domain.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.architecture.domain.BuildConfig

@Database(
    entities = [],
    exportSchema = BuildConfig.ARCH_SAMPLE_EXPORT_SCHEMA,
    version = BuildConfig.ARCH_SAMPLE_DATABASE_VERSION,
)
abstract class ArchDatabase: RoomDatabase() {
}