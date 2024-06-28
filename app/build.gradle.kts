import org.gradle.internal.impldep.com.google.api.services.storage.model.Bucket

plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("kotlin-android")
    id("kotlin-kapt")


}

android {
    namespace = "com.example.modulo5"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.modulo5"
        minSdk = 26
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"


    }

    buildFeatures{
        viewBinding = true
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)


    //Room
    //val room_version = "2.6.0"
    //implementation(libs.androidx.room.runtime)
    // implementation(libs.androidx.room.ktx)
    //kapt(libs.androidx.room.compiler)

    //Fragment KTX
    //implementation(libs.androidx.fragment.ktx)
    //Bucket.Lifecycle and LiveData val lifecycle_version = "2.4.0"

    //implementation(libs.androidx.lifecycle.viewmodel.ktx.v240)
    //implementation("androidx.lifecycle:lifecycle-li


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.extensions)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.ui.desktop)
    implementation(libs.firebase.auth.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //RecyclerView

    implementation("androidx.recyclerview:recyclerview:1.2.1")
    implementation("androidx.recyclerview:recyclerview-selection:1.1.0")


    //Retrofit


    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")
    // Retrofit with Kotlin Coroutines Adapter
    implementation("com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:0.9.2")
    // Retrofit with Scalar Converter
    implementation("com.squareup.retrofit2:converter-scalars:2.9.0")

    // Glide
    implementation("com.github.bumptech.glide:glide:4.16.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.16.0")

    // Room
    val room_version = "2.6.1"
    implementation("androidx.room:room-runtime:$room_version")
    implementation("androidx.room:room-ktx:$room_version")
    kapt("androidx.room:room-compiler:$room_version")

    // Fragment KTX
    implementation("androidx.fragment:fragment-ktx:1.7.1")

    // Lifecycle and LiveData
    val lifecycle_version = "2.8.0"
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")

    // Coroutines
    /*implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")*/
    /*implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.1")*/
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")

    dependencies {
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")


        // Optional -- Mockito framework
        testImplementation("org.mockito:mockito-core:1.10.19")

        // dependencias de mockWebserver
        // Dependencia de OkHttp
        implementation("com.squareup.okhttp3:okhttp:4.9.3")

        // Dependencia de OkHttp MockWebServer (para pruebas)
        testImplementation("com.squareup.okhttp3:mockwebserver:4.9.3")
        //configurations.all {
        //   exclude module: 'okhttp-ws'


        implementation("com.squareup.okhttp3:okhttp:4.9.3")

        // Dependencia de Firebase


        implementation("com.google.firebase:firebase-bom:32.3.1")
        implementation("com.google.firebase:firebase-auth-ktx")
        implementation("com.google.firebase:firebase-database-ktx")
    }


    }
