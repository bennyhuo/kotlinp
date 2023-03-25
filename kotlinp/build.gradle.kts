plugins {
    kotlin("jvm")
    id("com.vanniktech.maven.publish") version "0.18.0"
}

dependencies {
    api("org.ow2.asm:asm:9.3")
    api("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.6.0")

    testImplementation("junit:junit:4.12")
}