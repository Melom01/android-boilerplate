plugins {
    id("com.android.library")
    alias(libs.plugins.kotlinCompose)
    alias(libs.plugins.kotlin.serialization)
}

apply {
    from("$rootDir/compose-module.gradle")
}

android {
    namespace = "com.example.sample.core.navigation"
}

dependencies {
    implementation(libs.timber)
    implementation(libs.timber)
    implementation(libs.androidx.appcompat)
    implementation(libs.compose.navigation)
    implementation(libs.kotlinx.serialization.json)
}
