package dependencies

/**
 * Project annotation processor dependencies, makes it easy to include external binaries or
 * other library modules to build.
 */
object AnnotationProcessorsDependencies {
    const val DAGGER = "com.google.dagger:hilt-compiler:${BuildDependenciesVersions.DAGGER}"
    const val DAGGER_WORK_MANAGER_PROCESSOR = "androidx.hilt:hilt-compiler:1.0.0"
    const val ROOM = "androidx.room:room-compiler:${BuildDependenciesVersions.ROOM}"
    const val MOSHI = "com.squareup.moshi:moshi-kotlin-codegen:${BuildDependenciesVersions.MOSHI}"
}
