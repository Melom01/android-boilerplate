plugins {
    id("com.android.library")
    alias(libs.plugins.kotlinCompose)
}

apply {
    from("$rootDir/compose-module.gradle")
}

android {
    namespace = "com.example.sample.core.ui"
}

dependencies {
    implementation(libs.accompanist.systemuicontroller)
    implementation(libs.timber)
}
