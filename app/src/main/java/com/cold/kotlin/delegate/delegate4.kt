package com.cold.kotlin.delegate

import kotlin.properties.Delegates

val lazyValue :String by lazy {
    println("===============> lazy")
    "hello"
}

class User {
    var name : String by Delegates.observable("Mike") {
        prop, old, new ->
        println("===============> old: $old  new: $new")
    }
}

class User1 {
    var name : String by Delegates.vetoable("Mike") {
        prop, old, new ->
        println("===============> old: $old  new: $new")
        var result = true
        if(new.equals("Mary")) {
            result = false
            println("===============> name 属性不能是Mary")
        }
        result
    }
}

fun main() {
//    println("===============> $lazyValue")
//    println("===============> $lazyValue")

//    val user = User()
//    user.name = "Bill"
//    user.name = "John"

    val user1 = User1()
    user1.name = "Bill"
    println("===============> user1.name: ${user1.name}")
    user1.name = "Mary"
    println("===============> user1.name: ${user1.name}")
}