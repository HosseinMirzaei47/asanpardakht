const val kotlinVersion = "1.4.21"

object Config {
    const val applicationId = "hosseinmirzaei.asanpardakht"
    const val versionCode = 1
    const val versionName = "1.0"
}

object BuildPlugins {

    object Versions {
        const val buildToolsVersion = "4.1.1"
        const val navigationVersion = "2.3.2"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val navSafeArgs =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigationVersion}"

    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinKapt = "kotlin-kapt"
    const val navigation = "androidx.navigation.safeargs.kotlin"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"

}

object AndroidSdk {
    const val min = 19
    const val compile = 30
    const val target = compile
    const val buildToolsVersion = "30.0.2"
}

object Libraries {
    private object Versions {
        const val jetpack = "1.2.0"
        const val constraintLayout = "2.0.4"
        const val ktx = "1.3.2"
        const val material = "1.2.1"
        const val navigation = "2.3.2"
    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.jetpack}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val navFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navUIKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val navDynamicFeatures =
        "androidx.navigation:navigation-dynamic-features-fragment:${Versions.navigation}"
}

object TestLibraries {

    const val AndroidJunitRunner = "androidx.test.runner.AndroidJUnitRunner"

    private object Versions {
        const val junit4 = "4.13.1"
        const val testRunner = "1.1.2"
        const val espresso = "3.3.0"
    }

    const val junit4 = "junit:junit:${Versions.junit4}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val testRunner = "androidx.test.ext:junit:${Versions.testRunner}"
}