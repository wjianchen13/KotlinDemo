package com.example.kotlin.normal.late

//interface Result
//
//class Success(val msg: String) : Result
//
//class Failure(val error: Exception) : Result
//
//fun getResultMsg(result: Result) = when (result) {
//    is Success -> result.msg
//    is Failure -> result.error.message
//    else -> throw IllegalArgumentException()
//}

sealed class Result

class Success(val msg: String) : Result()

class Failure(val error: Exception) : Result()

fun getResultMsg(result: Result) = when (result) {
    is Success -> result.msg
    is Failure -> result.error.message
}



