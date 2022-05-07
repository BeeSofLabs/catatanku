const val kotlinVersion = "1.3.40"

object BuildPlugins {

    object Versions {
        const val buildToolsVersion = "7.1.3"
        const val navVersion = "2.1.0"
        const val hiltVersion = "2.38.1"
    }
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlinVersion}"
    const val androidNavigationSafeArgsPlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navVersion}"
    const val hiltDaggerPlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hiltVersion}"
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
    const val kotlinKapt = "kotlin-kapt"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"

}

object AndroidSdk {
    const val min = 23
    const val compile = 31
    const val target = compile
}

object Libraries {
    private object Versions {
        const val appCompat = "1.3.0"
        const val constraintLayout = "1.1.2"
        const val ktx = "1.1.0-alpha05"
        const val material = "1.4.0"
        const val constLayout = "2.0.4"
    }

    const val kotlinStdLib     = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
    const val appCompat        = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore          = "androidx.core:core-ktx:${Versions.ktx}"
    const val material         = "com.google.android.material:material:${Versions.material}"
    const val constrainLayout  = "androidx.constraintlayout:constraintlayout:${Versions.constLayout}"

    "androidx.navigation:navigation-fragment-ktx:$nav_version"
}

object TestLibraries {
    private object Versions {
        const val junit4 = "4.12"
        const val testRunner = "1.1.0-alpha4"
        const val espresso = "3.1.0-alpha4"
    }
    const val junit4     = "junit:junit:${Versions.junit4}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val espresso   = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}