plugins {
    // TODO extract kotlin version
    kotlin("jvm") version "1.3.61"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.3.61"
}

group = "com.johnturkson.githubapi"
version = "0.1"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.squareup.retrofit2:retrofit:2.7.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.3")
    implementation("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.4.0")
}


tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}