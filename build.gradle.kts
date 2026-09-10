plugins {
    kotlin("jvm") version "2.3.21"
}

group = "org.Bah"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    // Source: https://mvnrepository.com/artifact/org.jsoup/jsoup
    implementation("org.jsoup:jsoup:1.23.1")
    // Source: https://mvnrepository.com/artifact/org.apache.commons/commons-email
    implementation("org.apache.commons:commons-email:1.5")
    // Source: https://mvnrepository.com/artifact/commons-validator/commons-validator
    implementation("commons-validator:commons-validator:1.11.0")

}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}