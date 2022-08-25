package dependencies

/**
 * Project dependencies, makes it easy to include external binaries or
 * other library modules to build.
 */
object Dependencies {
    const val BROWSER = "androidx.browser:browser:1.4.0"
    const val CLEVER_TAP = "com.clevertap.android:clevertap-android-sdk:4.4.0"
    const val VIEW_PAGER = "androidx.viewpager:viewpager:1.0.0"
    const val VALIDATOR = "com.afollestad:vvalidator:0.5.2"
    const val SENTRY = "io.sentry:sentry-android:5.7.0"
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${BuildDependenciesVersions.KOTLIN}"
    const val APPCOMPAT = "androidx.appcompat:appcompat:${BuildDependenciesVersions.APPCOMPAT}"
    const val MATERIAL =
        "com.google.android.material:material:${BuildDependenciesVersions.MATERIAL}"
    const val COROUTINES =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${BuildDependenciesVersions.COROUTINES}"
    const val COROUTINES_ANDROID =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${BuildDependenciesVersions.COROUTINES}"
    const val ROOM_PAGING = "androidx.room:room-paging:${BuildDependenciesVersions.ROOM}"
    const val ROOM_KTX = "androidx.room:room-ktx:${BuildDependenciesVersions.ROOM}"

    // SQL CIPHER
    const val SQL_CIPHER =
        "net.zetetic:android-database-sqlcipher:${BuildDependenciesVersions.SQL_CIPHER}@aar"

    const val WORK_MANAGER =
        "androidx.work:work-runtime-ktx:${BuildDependenciesVersions.WORK_MANAGER}"
    const val STARTUP =
        "androidx.startup:startup-runtime:${BuildDependenciesVersions.STARTUP}"
    const val RECYCLER_VIEW =
        "androidx.recyclerview:recyclerview:${BuildDependenciesVersions.RECYCLER_VIEW}"
    const val RECYCLER_VIEW_SELECTION =
        "androidx.recyclerview:recyclerview-selection:${
        BuildDependenciesVersions
            .RECYCLER_VIEW_SELECTION
        }"
    const val LIFECYCLE_EXTENSIONS =
        "androidx.lifecycle:lifecycle-extensions:${BuildDependenciesVersions.LIFECYCLE}"
    const val LIFECYCLE_VIEWMODEL =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${BuildDependenciesVersions.LIFECYCLE}"
    const val LIFECYCLE =
        "androidx.lifecycle:lifecycle-runtime-ktx:${BuildDependenciesVersions.LIFECYCLE}"
    const val CORE_KTX = "androidx.core:core-ktx:${BuildDependenciesVersions.CORE_KTX}"
    const val FRAGMENT_KTX =
        "androidx.fragment:fragment-ktx:${BuildDependenciesVersions.FRAGMENT_KTX}"
    const val CONSTRAIN_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${BuildDependenciesVersions.CONSTRAIN_LAYOUT}"
    const val SWIPE_REFRESH_LAYOUT =
        "androidx.swiperefreshlayout:swiperefreshlayout:${
        BuildDependenciesVersions
            .SWIPE_REFRESH_LAYOUT
        }"
    const val PAGING = "androidx.paging:paging-runtime-ktx:${BuildDependenciesVersions.PAGING}"
    const val DAGGER = "com.google.dagger:hilt-android:${BuildDependenciesVersions.DAGGER}"
    const val DAGGER_WORK = "androidx.hilt:hilt-work:1.0.0"
    const val TIMBER = "com.jakewharton.timber:timber:${BuildDependenciesVersions.TIMBER}"
    const val OKHTTP = "com.squareup.okhttp3:okhttp:4.9.3"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${BuildDependenciesVersions.RETROFIT}"
    const val RETROFIT_CONVERTER =
        "com.squareup.retrofit2:converter-moshi:${BuildDependenciesVersions.RETROFIT}"
    const val NETWORK_ADAPTER =
        "com.github.haroldadmin:NetworkResponseAdapter:${BuildDependenciesVersions.NETWORK_ADAPTER}"
    const val LOGGING =
        "com.squareup.okhttp3:logging-interceptor:${BuildDependenciesVersions.LOGGING}"
    const val MOSHI = "com.squareup.moshi:moshi:${BuildDependenciesVersions.MOSHI}"
    const val MOSHI_KTX = "com.squareup.moshi:moshi-kotlin:${BuildDependenciesVersions.MOSHI}"
    const val COIL = "io.coil-kt:coil:${BuildDependenciesVersions.COIL}"
    const val COIL_SVG = "io.coil-kt:coil-svg:${BuildDependenciesVersions.COIL}"
    const val COIL_GIF = "io.coil-kt:coil-gif:${BuildDependenciesVersions.COIL}"
    const val IMAGE_COMPRESSOR =
        "id.zelory:compressor:${BuildDependenciesVersions.IMAGE_COMPRESSOR}"
    const val PLAY_CORE = "com.google.android.play:core:${BuildDependenciesVersions.PLAY_CORE}"
    const val DATE_TIME =
        "org.jetbrains.kotlinx:kotlinx-datetime:${BuildDependenciesVersions.DATETIME}"
    const val PREFERENCE_DATASTORE =
        "androidx.datastore:datastore-preferences:${BuildDependenciesVersions.PREFERENCE_DATASTORE}"

    const val COMMON_CODEC = "commons-codec:commons-codec:${BuildDependenciesVersions.COMMON_CODEC}"
    const val COMMON_LOGGING =
        "commons-logging:commons-logging:${BuildDependenciesVersions.COMMON_LOGGING}"
    const val XML_TO_JSON =
        "com.github.smart-fun:XmlToJson:${BuildDependenciesVersions.XML_TO_JSON}"
    const val GSON = "com.google.code.gson:gson:${BuildDependenciesVersions.GSON}"
    const val GSON_CONVERTER =
        "com.squareup.retrofit2:converter-gson:${BuildDependenciesVersions.GSON_CONVERTER}"

    const val FIREBASE_BOM =
        "com.google.firebase:firebase-bom:${BuildDependenciesVersions.FIREBASE_BOM}"
    const val FIREBASE_ANALYTICS = "com.google.firebase:firebase-analytics-ktx"
    const val FIREBASE_MESSAGING = "com.google.firebase:firebase-messaging-ktx"
    const val FIREBASE_CONFIG = "com.google.firebase:firebase-config-ktx"

    const val SMS_RETRIEVER =
        "com.google.android.gms:play-services-auth-api-phone:${
        BuildDependenciesVersions
            .SMS_RETRIEVER
        }"
    const val GOOGLE_PHONE_AUTH =
        "com.google.android.gms:play-services-auth:${BuildDependenciesVersions.GOOGLE_PHONE_AUTH}"

    const val BOTTOM_NAV_BAR =
        "nl.joery.animatedbottombar:library:${BuildDependenciesVersions.BOTTOM_NAV_BAR}"

    const val TEXT_DRAWABLE =
        "com.amulyakhare:com.amulyakhare.textdrawable:${BuildDependenciesVersions.TEXT_DRAWABLE}"
    const val QR_SCANNER =
        "com.budiyev.android:code-scanner:${BuildDependenciesVersions.QR_SCANNER}"

    const val ZXING_CORE = "com.google.zxing:core:${BuildDependenciesVersions.ZXING_CORE}"

    const val FAB_MENU = "com.github.clans:fab:${BuildDependenciesVersions.FAB_MENU}"

    const val MIXPANEL_ANALYTICS = "com.mixpanel.android:${BuildDependenciesVersions.MIXPANEL_BETA}"

    const val CAMERA_GALLERY =
        "com.github.dhaval2404:imagepicker:${BuildDependenciesVersions.CAM_GALLERY}"

    // FOR DYNAMIC DEEP LINKS
    const val BRANCH = "io.branch.sdk.android:library:${BuildDependenciesVersions.BRANCH}"
    const val FRESH_CHAT =
        "com.github.freshworks:freshchat-android:${BuildDependenciesVersions.FRESHCHAT}"

    // BIOMETRICS
    const val BIOMETRICS = "androidx.biometric:biometric:${BuildDependenciesVersions.BIOMETRICS}"

    // ROOT BEER for rooted device check
    const val ROOT_BEER = "com.scottyab:rootbeer-lib:${BuildDependenciesVersions.ROOT_BEER}"

    const val ROBINHOOD_TICKER =
        "com.robinhood.ticker:ticker:${BuildDependenciesVersions.ROBINHOOD_TICKER}"
    const val FLEXBOX_LAYOUT =
        "com.google.android.flexbox:flexbox:${BuildDependenciesVersions.FLEXBOX}"
    const val FAST_ADAPTER = "com.mikepenz:fastadapter:${BuildDependenciesVersions.FAST_ADAPTER}"
    const val FAST_ADAPTER_EXTENSION =
        "com.mikepenz:fastadapter-extensions-binding:${BuildDependenciesVersions.FAST_ADAPTER}"

    const val EXOPLAYER = "com.google.android.exoplayer:exoplayer:${BuildDependenciesVersions.EXOPLAYER}"
}
