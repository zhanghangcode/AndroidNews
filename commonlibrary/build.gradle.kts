plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    id("com.github.dcendents.android-maven")
}

group = "com.github.WangJie0822"

android {

    // 编译 SDK 版本
    compileSdkVersion(Configuration.AppConfigs.compile_sdk_version)

    // 资源前缀
    resourcePrefix("ui")

    defaultConfig {
        // 最低支持版本
        minSdkVersion(Configuration.AppConfigs.min_sdk_version)
        // 目标 SDK 版本
        targetSdkVersion(Configuration.AppConfigs.target_sdk_version)
    }

    // 源文件路径设置
    sourceSets {
        named("main") {
            java.srcDirs("src/main/java", "src/main/kotlin")
            jni.srcDirs("libs", "jniLibs")
        }
    }

    buildFeatures {
        // DataBinding 开启
        dataBinding = true
    }

    // Java 版本配置
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    // Kotlin 支持
    implementation(Configuration.Dependencies.kotlin_stdlib)
    // 协程
    implementation(Configuration.Dependencies.kotlin_coroutines)

    // Legacy
    implementation(Configuration.Dependencies.androidx_legacy)
    // Appcompat
    implementation(Configuration.Dependencies.androidx_appcompat)
    // RecyclerView
    implementation(Configuration.Dependencies.androidx_recyclerview)
//    implementation("androidx.appcompat:appcompat:1.4.0")

    // Common 库
//    api("com.github.WangJie0822.SampleProject:lib_base:1.0.1")
//    api(project(":lib_base"))
}
