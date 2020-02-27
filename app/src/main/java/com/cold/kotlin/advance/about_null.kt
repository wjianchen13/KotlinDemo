package com.cold.kotlin.advance

fun main() {
//    testNull()
    testNull1()


}

fun testNull() {
    var a : String? = null // 编译错误
    var b : String = "aaa"
//    b = null // 编译错误
    var c = if(a != null) {
        a.length
    } else {
        -1
    }
    var d = b.length


    //    var b : String? = "abc"
//    b = null
//    println(b?.length)
//    val listWithNulls : List<String?> = listOf("a", null)
//    for(item in listWithNulls) {
//        item?.let {
//            println(it)
//        }
//    }

    // !!操作符，如果e不为null，这个表达式返回非null的e值，否则抛出NPE
    var e : String? = "abc"
    e = null
    println(e!!.length)

}

fun testNull1() {



}

















