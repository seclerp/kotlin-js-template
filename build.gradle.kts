plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

group = "com.github.kjs.template"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    js {
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