plugins {
    alias(libs.plugins.kotlinCompose)
    id("com.android.application")
    id("dagger.hilt.android.plugin")
    id("kotlin-kapt")
    kotlin("android")
}

android {
    namespace = ProjectConfig.APP_ID
    compileSdk =
        libs
            .versions
            .compile
            .sdk
            .version
            .get()
            .toInt()

    defaultConfig {
        applicationId = ProjectConfig.APP_ID
        minSdk =
            libs
                .versions
                .min
                .sdk
                .version
                .get()
                .toInt()
        targetSdk =
            libs
                .versions
                .target
                .sdk
                .version
                .get()
                .toInt()
        versionCode = ProjectConfig.APP_VERSION_CODE
        versionName = ProjectConfig.APP_VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
            signingConfig = signingConfigs.getByName("debug")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    buildFeatures {
        compose = true
    }

    android.buildFeatures.buildConfig = true

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }
}

dependencies {
    implementation(libs.accompanist.systemuicontroller)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)

    implementation(libs.compose.compiler)
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.tooling)
    implementation(libs.compose.ui.toolingpreview)
    implementation(libs.compose.hilt.navigation)
    implementation(libs.compose.material3)
    implementation(libs.compose.runtime)
    implementation(libs.compose.navigation)
    implementation(libs.compose.lifecycle.viewmodel)
    implementation(libs.compose.activity)

    implementation(libs.hilt)
    kapt(libs.hilt.compiler)

    implementation(libs.google.material)

    implementation(libs.retrofit.convertermoshi)
    implementation(libs.retrofit)
    implementation(libs.okhttp)
    implementation(libs.okhttp.logginginterceptor)

    implementation(libs.timber)

    testImplementation(libs.junit)
    testImplementation(libs.androidx.junit)
    testImplementation(libs.mockk)

    androidTestImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.mockk)
}
