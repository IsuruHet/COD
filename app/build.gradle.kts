plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.isuru.hettiarachchi.cod"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.isuru.hettiarachchi.cod"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = org.gradle.api.JavaVersion.VERSION_1_8
        targetCompatibility = org.gradle.api.JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
        mlModelBinding = true
        dataBinding = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    //noinspection GradleDependency
    implementation("androidx.core:core-ktx:1.10.0")
    //noinspection GradleDependency
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.0")
    //noinspection GradleDependency
    implementation ("androidx.appcompat:appcompat:1.3.1")
    //noinspection GradleDependency
    implementation ("com.google.android.material:material:1.4.0")
    //noinspection GradleDependency
    implementation("androidx.activity:activity-compose:1.6.2")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("org.tensorflow:tensorflow-lite-support:0.1.0")
    implementation("org.tensorflow:tensorflow-lite-metadata:0.1.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")


    val cameraxVersion = ("1.2.2")
    //noinspection GradleDependency
    implementation ("androidx.camera:camera-core:${cameraxVersion}")
    //noinspection GradleDependency
    implementation ("androidx.camera:camera-camera2:${cameraxVersion}")
    //noinspection GradleDependency
    implementation ("androidx.camera:camera-lifecycle:${cameraxVersion}")
    //noinspection GradleDependency
    implementation ("androidx.camera:camera-video:${cameraxVersion}")

    //noinspection GradleDependency
    implementation ("androidx.camera:camera-view:${cameraxVersion}")
    //noinspection GradleDependency
    implementation ("androidx.camera:camera-extensions:${cameraxVersion}")

    implementation ("org.tensorflow:tensorflow-lite:2.8.0")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

}