plugins {
    kotlin("js")
    kotlin("plugin.serialization")
    `publishing-conventions`
}

dependencies {
    implementation(project(":kotlin-extensions"))
    implementation(kotlinxSerialization("runtime-js"))

    implementation(npm("redux", "^4.0.0"))
}