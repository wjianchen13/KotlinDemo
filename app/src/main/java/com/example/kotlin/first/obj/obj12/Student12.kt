package com.example.kotlin.first.obj.obj12

/**
 * Kotlin中任何一个非抽象类默认都是不可以被继承的，相当于Java 中给类声明了final
关键字
既然现在Person类是无法被继承的，我们得让它可以被继承才行，方法也很简单，在Person
类的前面加上open关键字就可以了
要让Student类继承Person类。在Java 中继承的关键字是extends，而在Kotlin
中变成了一个冒号，
 */
class Student12(sno : String, grade : Int) : Person12() {
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