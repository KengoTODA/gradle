// TODO:Finalize Upload Removal - Issue #21439
// tag::script[]
buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:3.4.4")
    }
}

apply(plugin = "java")
apply(plugin = "jacoco")
apply(plugin = "org.springframework.boot")
// end::script[]
