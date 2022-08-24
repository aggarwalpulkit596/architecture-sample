import dependencies.AnnotationProcessorsDependencies
import dependencies.Dependencies
import extensions.implementation
import extensions.kapt

plugins {
    id(BuildPlugins.ANDROID_APPLICATION)
    id(BuildPlugins.KOTLIN_ANDROID)
    id(BuildPlugins.KOTLIN_KAPT)
    id(BuildPlugins.KOTLIN_PARCELIZE)
    id(BuildPlugins.GMS_GOOGLE_SERVICE)
    id(BuildPlugins.SENTRY) version "3.0.1"
}

android {

    compileSdk = BuildAndroidConfig.COMPILE_SDK_VERSION

    defaultConfig {
        applicationId = BuildAndroidConfig.APPLICATION_ID
        minSdk = BuildAndroidConfig.MIN_SDK_VERSION
        targetSdk = BuildAndroidConfig.TARGET_SDK_VERSION
        buildToolsVersion = BuildAndroidConfig.BUILD_TOOLS_VERSION

        versionCode = BuildAndroidConfig.VERSION_CODE
        versionName = BuildAndroidConfig.VERSION_NAME
        vectorDrawables.useSupportLibrary = BuildAndroidConfig.SUPPORT_LIBRARY_VECTOR_DRAWABLES
        testInstrumentationRunner = BuildAndroidConfig.TEST_INSTRUMENTATION_RUNNER
        testInstrumentationRunnerArguments
            .putAll(BuildAndroidConfig.TEST_INSTRUMENTATION_RUNNER_ARGUMENTS)
        multiDexEnabled = true
    }

    buildTypes {
        getByName(BuildType.RELEASE) {
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            isMinifyEnabled = BuildTypeRelease.isMinifyEnabled
            isTestCoverageEnabled = BuildTypeRelease.isTestCoverageEnabled
        }

        getByName(BuildType.DEBUG) {
            signingConfig = signingConfigs.getByName("debug")
            applicationIdSuffix = BuildTypeDebug.applicationIdSuffix
            versionNameSuffix = BuildTypeDebug.versionNameSuffix
            isMinifyEnabled = BuildTypeDebug.isMinifyEnabled
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }


    flavorDimensions(BuildProductDimensions.ENVIRONMENT)
    productFlavors {
        ProductFlavorDevelop.appCreate(this).apply {
            manifestPlaceholders["branch_test_flag"] = true
            resValue("string", "app_name", "Architecture Dev")
            externalNativeBuild.cmake {
                arguments += "-DFLAVOR=DEV"
            }
        }
        ProductFlavorProduction.appCreate(this).apply {
            manifestPlaceholders["branch_test_flag"] = false
            resValue("string", "app_name", "Architecture")
            externalNativeBuild.cmake {
                arguments += "-DFLAVOR=PROD"
            }
        }
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        // Flag to enable support for the new language APIs
        isCoreLibraryDesugaringEnabled = true

        // Sets Java compatibility to Java 8
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
        freeCompilerArgs = freeCompilerArgs + "-Xopt-in=kotlin.RequiresOptIn"
    }
    testOptions {
        unitTests.isIncludeAndroidResources = true
        unitTests.isReturnDefaultValues = true
    }

    sourceSets {
        getByName("main") {
            java.srcDir("src/main/kotlin")
        }
        getByName("test") {
            java.srcDir("src/test/kotlin")
        }
        getByName("androidTest") {
            java.srcDir("src/androidTest/kotlin")
        }
    }
}

dependencies {
    implementation(Dependencies.KOTLIN)
    implementation(Dependencies.APPCOMPAT)
    implementation(Dependencies.MATERIAL)
    implementation(Dependencies.CONSTRAIN_LAYOUT)
    implementation(Dependencies.TIMBER)
    implementation(Dependencies.PLAY_CORE)
    implementation(Dependencies.LIFECYCLE_EXTENSIONS)
    implementation(Dependencies.LIFECYCLE_VIEWMODEL)
    implementation(Dependencies.LIFECYCLE)
    implementation(Dependencies.CONSTRAIN_LAYOUT)
    implementation(Dependencies.RECYCLER_VIEW)
    implementation(Dependencies.RECYCLER_VIEW_SELECTION)
    implementation(Dependencies.SWIPE_REFRESH_LAYOUT)
    implementation(Dependencies.PAGING)
    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.FRAGMENT_KTX)
    implementation(Dependencies.DAGGER)
    implementation(Dependencies.VIEW_PAGER)
    implementation(Dependencies.DAGGER_WORK)
    kapt(AnnotationProcessorsDependencies.DAGGER)
    kapt(AnnotationProcessorsDependencies.DAGGER_WORK_MANAGER_PROCESSOR)
    implementation(Dependencies.IMAGE_COMPRESSOR)

    implementation(Dependencies.WORK_MANAGER)
    implementation(Dependencies.STARTUP)

    implementation(Dependencies.COIL)
    implementation(Dependencies.COIL_SVG)
    implementation(Dependencies.COIL_GIF)

    // ICICI
    implementation(Dependencies.GSON_CONVERTER)
    implementation(Dependencies.COMMON_CODEC)
    implementation(Dependencies.COMMON_LOGGING)
    implementation(Dependencies.XML_TO_JSON)

//    devImplementation(DebugDependencies.LEAKCANARY)

    // FIREBASE
    implementation(platform(Dependencies.FIREBASE_BOM))
    implementation(Dependencies.FIREBASE_ANALYTICS)
    implementation(Dependencies.FIREBASE_MESSAGING)
    implementation(Dependencies.FIREBASE_CONFIG)

    // HINTS and SMS RETRIEVER
    implementation(Dependencies.SMS_RETRIEVER)
    implementation(Dependencies.GOOGLE_PHONE_AUTH)

    implementation(Dependencies.TEXT_DRAWABLE)
    implementation(Dependencies.FAB_MENU)
    implementation(Dependencies.BOTTOM_NAV_BAR)
    // QR SCANNER
    implementation(Dependencies.ZXING_CORE)
    implementation(Dependencies.VALIDATOR)

    // CAMERA & GALLERY
    implementation(Dependencies.CAMERA_GALLERY)

    // CLEVER TAP
    implementation(Dependencies.CLEVER_TAP)

    // BRANCH FOR DEEP LINKS
    implementation(Dependencies.BRANCH)

    // MIXPANEL ANALYTICS
    implementation(Dependencies.MIXPANEL_ANALYTICS)
    // FRESH_CHAT
    implementation(Dependencies.FRESH_CHAT)

    // LOTTIE
    implementation("com.airbnb.android:lottie:5.0.3")

    implementation("com.facebook.shimmer:shimmer:0.5.0")
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:1.1.5")

    kapt("com.airbnb.android:epoxy-processor:4.6.3")

    implementation(Dependencies.ROBINHOOD_TICKER)
    implementation(Dependencies.FLEXBOX_LAYOUT)

    implementation(Dependencies.FAST_ADAPTER)
    implementation(Dependencies.FAST_ADAPTER_EXTENSION)

    implementation(Dependencies.EXOPLAYER)
}

kapt {
    correctErrorTypes = true
}

sentry {
    autoUploadProguardMapping.set(CI.canAutoUpload())
}
