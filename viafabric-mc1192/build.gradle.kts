dependencies {
    minecraft("com.mojang:minecraft:1.19.2")
    mappings("net.fabricmc:yarn:1.19.2+build.28:v2")

    modImplementation("net.fabricmc.fabric-api:fabric-api:0.75.1+1.19.2")
    modImplementation("com.terraformersmc:modmenu:4.2.0-beta.2")
}

tasks.compileJava {
    options.release.set(17)
}
