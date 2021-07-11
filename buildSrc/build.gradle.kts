plugins {
  `groovy-gradle-plugin`
  `java-gradle-plugin`
  `kotlin-dsl`
}

repositories {
  gradlePluginPortal()
  mavenCentral()
}

dependencies {
  implementation("com.diffplug.spotless:spotless-plugin-gradle:5.14.1")
  implementation("gradle.plugin.com.nocwriter.runsql:sql-runner-plugin:1.0.1")
  implementation("io.freefair.gradle:lombok-plugin:6.0.0-m2")
  implementation("org.beryx:badass-jlink-plugin:2.24.0")
  implementation("org.openjfx:javafx-plugin:0.0.10")
  implementation("org.ow2.asm:asm:8.0.1")
}

// See also https://docs.gradle.org/current/samples/sample_java_modules_with_transform.html
gradlePlugin {
  plugins {
    register("extra-java-module-info") {
      id = "extra-java-module-info"
      implementationClass = "org.gradle.sample.transform.javamodules.ExtraModuleInfoPlugin"
    }
  }
}
