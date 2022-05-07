plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinKapt)
    id(BuildPlugins.kotlinAndroidExtensions)
}

android {
    compileSdkVersion(AndroidSdk.compile)

    defaultConfig {
        applicationId = "com.mimo.pigeon.catatanku"
        minSdkVersion(AndroidSdk.min)
        targetSdkVersion(AndroidSdk.target)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("debug") {

        }
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_10
        targetCompatibility = JavaVersion.VERSION_1_10
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {


    implementation(Libraries.kotlinStdLib)
    implementation(Libraries.ktxCore)
    implementation(Libraries.appCompat)
    implementation(Libraries.material)
    implementation(Libraries.constrainLayout)

    // Jetpack navigation
    implementation()
    implementation = "androidx.navigation:navigation-ui-ktx:$nav_version"
    implementation = "androidx.legacy:legacy-support-v4:1.0.0"

    // Database  (Optional)
    implementation = "androidx.room:room-runtime:$room_version"
    kapt = "androidx.room:room-compiler:$room_version"


    // base
    implementation = "com.github.acan12:coconut-mvvm:$coconut_mvvm_version"
    compileOnly = "javax.annotation:jsr250-api:1.0"
    implementation = "com.squareup.retrofit2:retrofit:$retrofit_version" // Retrofit
    implementation = "com.squareup.retrofit2:converter-jackson:$retrofit_version"
    implementation("com.squareup.okhttp3:okhttp")
    implementation("com.squareup.okhttp3:logging-interceptor:3.9.0")
    implementation = 'com.google.android.play:core:1.6.1'

    // Lifecycle  (Optional)
    implementation = "androidx.lifecycle:lifecycle-extensions:$lifecycle_version"
    implementation = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version"
    implementation = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    implementation = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
    // Caroutine  (Optional)
    implementation = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
    implementation = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
    implementation = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:$coroutinesVersion"

    // Coconut MVVM
    implementation = "com.github.acan12:coconut-mvvm:$coconut_mvvm_version"
    // HILT
    implementation = "com.google.dagger:hilt-android:$hilt_version"
    kapt = "com.google.dagger:hilt-compiler:$hilt_version"

    // unit test
    testImplementation = 'junit:junit:4.13.2'
    androidTestImplementation = 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation = 'androidx.test.espresso:espresso-core:3.4.0'
}