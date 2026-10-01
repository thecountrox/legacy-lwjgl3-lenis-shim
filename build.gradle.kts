plugins {
	java
}

group = "io.github.moehreag.legacy-lwjgl3"
version = "1.4.4"
base.archivesName = "legacy-lwjgl3-lenis-shim"

repositories {
	mavenCentral()
}

java {
		sourceCompatibility = JavaVersion.VERSION_17
		targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<JavaCompile>().configureEach {
	options.encoding = "UTF-8"
	options.release = 17
}

tasks.processResources {
	inputs.property("version", version)
	filesMatching("fabric.mod.json") {
		expand("version" to version)
	}
}
