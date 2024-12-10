plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.majhigram.majhigrampanchayat"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.majhigram.majhigrampanchayat"
        minSdk = 31
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.play.services.location)
    implementation(libs.tools.core)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation("androidx.webkit:webkit:1.9.0")
    implementation("com.google.android.gms:play-services-ads:22.6.0")
    implementation("androidx.multidex:multidex:2.0.1")
    implementation("com.github.GrenderG:Toasty:1.5.2")
    implementation("com.android.volley:volley:1.2.1")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    implementation("com.github.ksoichiro:android-observablescrollview:1.0.0")
    implementation("com.airbnb.android:lottie:5.2.0")
    implementation("androidx.viewpager2:viewpager2:1.0.0")
    implementation("androidx.core:core:1.9.0")
    implementation("androidx.recyclerview:recyclerview:1.2.1")
}
