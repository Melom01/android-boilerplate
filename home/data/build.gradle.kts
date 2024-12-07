plugins {
    id("com.android.library")
}

apply {
    from("$rootDir/base-module.gradle")
}

android {
    namespace = "com.example.sample.home.data"
}

dependencies {
    implementation(projects.core.network)
    implementation(projects.core.util)
    implementation(projects.home.domain)

    implementation(libs.retrofit)
    implementation(libs.retrofit.convertermoshi)
    implementation(libs.okhttp)
    implementation(libs.okhttp.logginginterceptor)
}
