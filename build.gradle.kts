plugins {
    kotlin("jvm") apply false
}

group = "ru.otus.kramer"
version = "0.1"

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    group = rootProject.group
    version = rootProject.version
}