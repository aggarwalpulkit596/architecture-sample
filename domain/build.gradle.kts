import extensions.buildConfigBooleanField
import extensions.buildConfigIntField
import extensions.buildConfigStringField
import dependencies.Dependencies
import dependencies.AnnotationProcessorsDependencies
import extensions.kapt
import java.util.Properties
import java.io.FileInputStream

plugins {
    id(BuildPlugins.ANDROID_LIBRARY)
    id("commons.android-library")
    id("org.jetbrains.kotlin.android")
}

android {
    val apikeyPropertiesFile = rootProject.file("domain/apikey.properties")
    val apikeyProperties = Properties()
    apikeyProperties.load(FileInputStream(apikeyPropertiesFile))

    compileSdk = BuildAndroidConfig.COMPILE_SDK_VERSION

    defaultConfig {
        minSdk = BuildAndroidConfig.MIN_SDK_VERSION
        targetSdk = BuildAndroidConfig.TARGET_SDK_VERSION
        buildToolsVersion = BuildAndroidConfig.BUILD_TOOLS_VERSION

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        defaultConfig {
            minSdk = BuildAndroidConfig.MIN_SDK_VERSION
            targetSdk = BuildAndroidConfig.TARGET_SDK_VERSION
            buildToolsVersion = BuildAndroidConfig.BUILD_TOOLS_VERSION
            javaCompileOptions {
                annotationProcessorOptions {
                    arguments.plusAssign(
                        hashMapOf(
                            "room.schemaLocation" to "$projectDir/schemas",
                            "room.incremental" to "true",
                            "room.expandProjection" to "true"
                        )
                    )
                }
            }
        }
        buildTypes.forEach {
            it.buildConfigBooleanField("ARCH_SAMPLE_EXPORT_SCHEMA", true)
            it.buildConfigStringField("ARCH_SAMPLE_DATABASE_NAME", "arch-sample-db")
            it.buildConfigIntField("ARCH_SAMPLE_DATABASE_VERSION", 1)
            it.buildConfigStringField("VERSION_CODE", BuildAndroidConfig.VERSION_CODE.toString())
            it.buildConfigStringField("ARCH_SAMPLE_BASE_URL", "https://newsapi.org/v2/")
            it.buildConfigStringField("API_KEY", apikeyProperties["API_KEY"].toString())
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.8.0")
    implementation("androidx.appcompat:appcompat:1.5.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")

    implementation(Dependencies.RETROFIT)
    implementation(Dependencies.RETROFIT_CONVERTER)
    implementation(Dependencies.OKHTTP)
    implementation(Dependencies.LOGGING)
    api(Dependencies.NETWORK_ADAPTER)
    implementation(Dependencies.MOSHI_KTX)
    kapt(AnnotationProcessorsDependencies.MOSHI)

    api(Dependencies.ROOM_KTX)
    implementation(Dependencies.ROOM_PAGING)
    kapt(AnnotationProcessorsDependencies.ROOM)
}