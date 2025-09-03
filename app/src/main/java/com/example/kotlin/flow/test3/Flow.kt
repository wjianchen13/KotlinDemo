package com.example.kotlin.flow.test3

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flatMapConcat
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flatMapMerge
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.fold
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.reduce
import kotlinx.coroutines.flow.sample
import kotlinx.coroutines.flow.zip
import kotlinx.coroutines.runBlocking

//fun main() {
//    runBlocking {
//        val flow = flowOf(1, 2, 3, 4, 5)
//        flow.map {
//            it * it
//        }.collect {
//            println(it)
//        }
//    }
//}

//fun main() {
//    runBlocking {
//        val flow = flowOf(1, 2, 3, 4, 5)
//        flow.filter {
//            it % 2 == 0
//        }.map {
//            it * it
//        }.collect {
//            println(it)
//        }
//    }
//}

//fun main() {
//    runBlocking {
//        val flow = flowOf(1, 2, 3, 4, 5)
//        flow.filter {
//            it % 2 == 0
//        }.onEach {
//            println(it)
//        }.map {
//            it * it
//        }.collect {
//            println(it)
//        }
//    }
//}

//fun main() {
//    runBlocking {
//        flow {
//            emit(1)
//            emit(2)
//            delay(600)
//            emit(3)
//            delay(100)
//            emit(4)
//            delay(100)
//            emit(5)
//        }
//            .debounce(500)
//            .collect {
//                println(it)
//            }
//    }
//}

//fun main() {
//    runBlocking {
//        flow {
//            while (true) {
//                emit("send message")
//            }
//        }
//            .sample(1000)
//            .flowOn(Dispatchers.IO)
//            .collect {
//                println(it)
//            }
//    }
//}

//fun main() {
//    runBlocking {
//        val result = flow {
//            for (i in (1..100)) {
//                emit(i)
//            }
//        }.reduce { acc, value -> acc + value}
//        println(result)
//    }
//}

//fun main() {
//    runBlocking {
//        val result = flow {
//            for (i in ('A'..'Z')) {
//                emit(i.toString())
//            }
//        }.fold("Alphabet: ") { acc, value -> acc + value}
//        println(result)
//    }
//}

//fun main() {
//    runBlocking {
//        flowOf(1, 2, 3)
//            .flatMapConcat {
//                flowOf("a$it", "b$it")
//            }
//            .collect {
//                println(it)
//            }
//    }
//}

//fun main() {
//    runBlocking {
//        flowOf(300, 200, 100)
//            .flatMapMerge {
//                flow {
//                    delay(it.toLong())
//                    emit("a$it")
//                    emit("b$it")
//                }
//            }
//            .collect {
//                println(it)
//            }
//    }
//}

//fun main() {
//    runBlocking {
//        flow {
//            emit(1)
//            delay(150)
//            emit(2)
//            delay(50)
//            emit(3)
//        }.flatMapLatest {
//            flow {
//                delay(100)
//                emit("$it")
//            }
//        }
//            .collect {
//                println(it)
//            }
//    }
//}

//fun main() {
//    runBlocking {
//        val flow1 = flowOf("a", "b", "c")
//        val flow2 = flowOf(1, 2, 3, 4, 5)
//        flow1.zip(flow2) { a, b ->
//            a + b
//        }.collect {
//            println(it)
//        }
//    }
//}

//fun main() {
//    runBlocking {
//        val start = System.currentTimeMillis()
//        val flow1 = flow {
//            delay(3000)
//            emit("a")
//        }
//        val flow2 = flow {
//            delay(2000)
//            emit(1)
//        }
//        flow1.zip(flow2) { a, b ->
//            a + b
//        }.collect {
//            val end = System.currentTimeMillis()
//            println("Time cost: ${end - start}ms")
//        }
//    }
//}

//fun main() {
//    runBlocking {
//        flow {
//            emit(1);
//            delay(1000);
//            emit(2);
//            delay(1000);
//            emit(3);
//        }.onEach {
//            println("$it is ready")
//        }.collect {
//            delay(1000)
//            println("$it is handled")
//        }
//    }
//}

//fun main() {
//    runBlocking {
//        flow {
//            emit(1);
//            delay(1000);
//            emit(2);
//            delay(1000);
//            emit(3);
//        }
//            .onEach {
//                println("$it is ready")
//            }
//            .buffer()
//            .collect {
//                delay(1000)
//                println("$it is handled")
//            }
//    }
//}

//fun main() {
//    runBlocking {
//        flow {
//            var count = 0
//            while (true) {
//                emit(count)
//                delay(1000)
//                count++
//            }
//        }.collectLatest {
//            println("start handle $it")
//            delay(2000)
//            println("finish handle $it")
//        }
//    }
//}

fun main() {
    runBlocking {
        flow {
            var count = 0
            while (true) {
                emit(count)
                delay(1000)
                count++
            }
        }
            .conflate()
            .collect {
                println("start handle $it")
                delay(2000)
                println("finish handle $it")
            }
    }
}



















































