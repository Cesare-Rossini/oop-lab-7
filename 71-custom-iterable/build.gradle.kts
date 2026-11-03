plugins {
    java
    //id("org.danilopianini.gradle-java-qa") version "1.191.0"
}

repositories {
    //mavenCentral()
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}
