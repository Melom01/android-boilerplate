plugins {
    id("com.android.library")
    alias(libs.plugins.kotlinCompose)
}

apply {
    from("$rootDir/compose-module.gradle")
}

android {
    namespace = "com.example.sample.home.presentation"
}

dependencies {
    implementation(projects.core.network)
    implementation(projects.core.ui)
    implementation(projects.core.util)
    implementation(projects.home.domain)
}
