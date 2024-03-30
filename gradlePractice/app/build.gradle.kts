plugins {
	java
}
tasks.named<Jar>("jar") {
	manifest {
		attributes["Main-Class"] = "org.example.App"
	}
}
repositories {
	mavenCentral()
}
dependencies {
	testImplementation("org.junit.jupiter:junit-jupiter: 5.10.0")
}