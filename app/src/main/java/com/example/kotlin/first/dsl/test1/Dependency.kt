package com.example.kotlin.first.dsl.test1

class Dependency {

    val libraries = ArrayList<String>()

    fun implementation(lib: String) {
        libraries.add(lib)
    }

    fun dependencies(block: Dependency.() -> Unit): List<String> {
        val dependency = Dependency()
        dependency.block()
        return dependency.libraries
    }

    fun test() {
        val libraries = dependencies {
            implementation("com.squareup.retrofit2:retrofit:2.6.1")
            implementation("com.squareup.retrofit2:converter-gson:2.6.1")
        }
        for (lib in libraries) {
            println(lib)
        }

    }

}