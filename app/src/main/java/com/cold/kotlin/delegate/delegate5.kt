package com.cold.kotlin.delegate

//class User5(var map : Map<String, Any>) {
//    val name : String by map
//    val age : Int by map
//}
//
//fun main() {
//    var map = mapOf(
//        "name" to "John",
//        "age" to 25
//    )
//    val user = User5(map)
//    println("===============> name: ${user.name}  age: ${user.age}")
//}

class User5(var map : MutableMap<String, Any>) {
    var name : String by map
    var age : Int by map
}

fun main() {
    var mutableMap = mutableMapOf(
        "name" to "Mike",
        "age" to 20
    )

    val user = User5(mutableMap)
    println("===============> name: ${user.name}  age: ${user.age}")
    user.name = "hello"
    println("===============> mutableMap: $mutableMap")
    mutableMap.put("age", 30)
    println("===============> name: ${user.name}  age: ${user.age}")
}