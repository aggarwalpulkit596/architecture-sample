plugins {
  `java-gradle-plugin`
  `kotlin-dsl`
  `kotlin-dsl-precompiled-script-plugins`
}

repositories {
  google()
  mavenCentral()
  maven("https://plugins.gradle.org/m2/")
  maven("https://oss.sonatype.org/content/repositories/snapshots")
  maven("https://ci.android.com/builds/submitted/5837096/androidx_snapshot/latest/repository")
}

object PluginsVersions {
  const val GRADLE_ANDROID = "7.0.4"
  const val GRADLE_VERSIONS = "0.33.0"
  const val KOTLIN = "1.6.10"
  const val KTLINT = "0.43.2"
  const val SPOTLESS = "5.6.1"
  const val DETEKT = "1.14.1"
  const val HILT = "2.38.1"
}

dependencies {
  implementation("com.android.tools.build:gradle:7.2.1")
  implementation("com.github.ben-manes:gradle-versions-plugin:${PluginsVersions.GRADLE_VERSIONS}")
  implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginsVersions.KOTLIN}")
  implementation("org.jetbrains.kotlin:kotlin-allopen:${PluginsVersions.KOTLIN}")
  implementation("com.pinterest:ktlint:${PluginsVersions.KTLINT}")
  implementation("com.diffplug.spotless:spotless-plugin-gradle:${PluginsVersions.SPOTLESS}")
  implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${PluginsVersions.DETEKT}")
  implementation("com.google.dagger:hilt-android-gradle-plugin:${PluginsVersions.HILT}")
  implementation(kotlin("script-runtime"))
}
