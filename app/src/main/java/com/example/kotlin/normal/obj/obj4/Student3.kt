package com.example.kotlin.normal.obj.obj4

/**
 * 注意，我们在Student类的主构造函数中增加name和age这两个字段时，不能再将它们声明成
 * val，因为在主构造函数中声明成val或者var的参数将自动成为该类的字段，这就会导致和父
 * 类中同名的name和age字段造成冲突。因此，这里的name和age参数前面我们不用加任何关键
 * 字，让它的作用域仅限定在主构造函数当中即可
 */
class Student3(sno : String, grade : Int, name : String, age : Int) : Person3(name, age) {
    var sno = sno
    var grade = grade

    /**
     * Kotlin给我们提供了一个init结构体，所有主构造函数中的逻辑都可以写在里面
     */
    init {
        println("init sno:" + sno  + "  grade: " + grade)
    }

    fun info() {
        println("name:" + name  + "  age: " + age + " sno: " + sno + "  grade: " + grade)
    }
}