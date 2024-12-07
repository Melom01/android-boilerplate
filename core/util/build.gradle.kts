plugins {
    id("com.android.library")
}

apply {
    from("$rootDir/base-module.gradle")
}

android {
    namespace = "com.example.sample.core.util"
}

dependencies {
    implementation(libs.retrofit)
    implementation(libs.retrofit.convertermoshi)
    implementation(libs.okhttp)
    implementation(libs.okhttp.logginginterceptor)
}
