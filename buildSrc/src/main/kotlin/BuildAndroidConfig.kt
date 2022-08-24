/**
 * Configuration of android build
 */
object BuildAndroidConfig {
    const val APPLICATION_ID = "com.sample.architecture"

    const val BUILD_TOOLS_VERSION = "31.0.0"
    const val COMPILE_SDK_VERSION = 31
    const val MIN_SDK_VERSION = 23
    const val TARGET_SDK_VERSION = 31

    const val VERSION_CODE = 1010000051

    // 1 (versioning scheme)
    // 01 (major version)
    // 00 (minor version)
    // 00 (patch version)
    // 000 spare for betas/RCs
    const val VERSION_NAME = "1.1.0"

    const val SUPPORT_LIBRARY_VECTOR_DRAWABLES = true

    const val TEST_INSTRUMENTATION_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
    val TEST_INSTRUMENTATION_RUNNER_ARGUMENTS = mapOf(
        "leakcanary.FailTestOnLeakRunListener" to "listener"
    )
}
