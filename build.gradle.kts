buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
    }
    dependencies {
        // NOTE: Do not place your application dependencies here; they belong in the individual module build.gradle files
        classpath(libs.android.buildtools)
        classpath(libs.hilt.gradleplugin)
        classpath(libs.kotlin.gradleplugin)
    }
}

plugins {
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    alias(libs.plugins.jetbrainsKotlinJvm) apply false
    alias(libs.plugins.kotlinCompose) apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.layout.buildDirectory)
}
