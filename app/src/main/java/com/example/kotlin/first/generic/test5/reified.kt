package com.example.kotlin.first.generic.test5

import android.content.Context
import android.content.Intent

//val intent = Intent(context, TestActivity::class.java)
//context.startActivity(intent)
inline fun <reified T> startActivity(context: Context) {
    val intent = Intent(context, T::class.java)
    context.startActivity(intent)
}

//val intent = Intent(context, TestActivity::class.java)
//intent.putExtra("param1", "data")
//intent.putExtra("param2", 123)
//context.startActivity(intent)
inline fun <reified T> startActivity(context: Context, block: Intent.() -> Unit) {
    val intent = Intent(context, T::class.java)
    intent.block()
    context.startActivity(intent)
}



