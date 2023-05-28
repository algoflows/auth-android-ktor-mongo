// Top-level build file where you can add configuration options common to all sub-projects/modules.
@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.kotlinAndroid) apply false
    id("com.google.dagger.hilt.android") version "2.44" apply false
    kotlin("plugin.serialization") version "1.8.21"
}

buildscript {
    dependencies {
        val kotlinVersion = "1.8.21"
        classpath(kotlin("serialization", version = kotlinVersion))
    }
}

tasks.create("clean", Delete::class) {
    delete(rootProject.buildDir)
}
true // Needed to make the Suppress annotation work for the plugins block