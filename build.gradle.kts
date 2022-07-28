plugins {
    id("xyz.jpenilla.run-paper") version "1.0.6"
	id("org.jetbrains.kotlin.jvm") version "1.7.10"
	id("com.github.johnrengelman.shadow") version "7.1.2"
}

repositories {
    mavenCentral()
    maven { url = uri("https://papermc.io/repo/repository/maven-public/") }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.19-R0.1-SNAPSHOT")
}

java { toolchain.languageVersion.set(JavaLanguageVersion.of(17)) }

tasks{
    shadowJar {
        minimize() // Will cause issues with Reflection
    }
    runServer {
		minecraftVersion("1.19")
	}
}
