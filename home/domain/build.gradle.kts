plugins {
    id("com.android.library")
}

apply {
    from("$rootDir/base-module.gradle")
}

android {
    namespace = "com.example.sample.home.domain"
}

dependencies {
    implementation(projects.core.util)
}
