plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

group = "com.github"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    js(IR) {
        browser {
            binaries.executable()
            testTask {
                useKarma {
                    useChromeHeadless()
                }
            }
        }
    }
    sourceSets {
        jsTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}