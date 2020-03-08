package com.cold.kotlin.data

/**
 * 数据类
 * 所谓数据类，就是之定义必要的部分，其余的部分可以自动推导
 * 数据类规定，属性要通过主构造器指定，而且数据类型要在class关键字前面加上data
 * 数据类型和普通类最大的不同，就是数据类型可以根据柱构造器的参数自动生成相关代码
 * 编写数据类需要注意的事项
 * 1.主构造器至少 要有一个参数
 * 2.主构造器所有的参数必须标记为val或var
 * 3.数据类型不能是抽象类，open类，封闭类或内部类
 * 数据类不可能存在没有参数的主构造器，下面方式实现没有参数的构造器
 * 对象复制
 * kotlin会为数据类自动生成一些代码，包括一个copy函数，该函数的作用就是复制数据类型的实例。
 */
data class User (var name : String, var age : Int)

data class User1(var name : String = "Bill", val age : Int = 20)

data class User2(var name : String, val age : Int) {
    constructor() : this("Bill", 20) {

    }
}

/**
 * 封闭类
 * 封闭类也是kotlin的一个语法糖，可以理解为枚举的扩展，用sealed关键字标识，可以有任意多个子类和对象
 *
 */
sealed class Expr
data class Const(val number : Double) : Expr()
data class Sum(val e1 : Expr, val e2 : Expr) : Expr()
object NotANumber : Expr()

fun eval(expr : Expr) : Double = when(expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
}

fun main(args : Array<String>) {
    var u1 = User("A", 1)
    var u2 = User("A", 1)
    println("===============> u1: $u1")
    println("===============> u2: $u2")
    println("===============> u1.equals(u2): ${u1.equals(u2)}")
    var u3 = User2()
    var u4 = User2()
    println("===============> u3: $u3")
    println("===============> u4: $u4")
    println("===============> u3.equals(u4): ${u3.equals(u4)}")

    val john = User("John", 10)
    val other = john.copy(age = 20)
    println("===============> other: $other")

    /**
     * 数据解构
     * 数据解构就是将数据对象中的属性提取出来，分别赋给单个变量，这样就可以单独使用变量了
     */
    val jane = User("Jane", 20)
    val (name, age) = jane
    println("===============> name: $name  age:$age")

    val expr : Expr = Const(1.25)
    println("===============> eval: ${eval(expr)}")
}