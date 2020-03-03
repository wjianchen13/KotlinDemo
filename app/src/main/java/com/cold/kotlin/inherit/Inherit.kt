package com.cold.kotlin.inherit

/**
 * kotlin继承
 * kotlin继承需要使用冒号(：),冒号后面需要调用父类构造器，kotlin也是但继承的
 * 默认class是final的，所以默认class不允许继承，需要显示地使用open关键字允许继承
 * 重写方法
 * 在kotlin中方法默认也是不可重写的，重写方法需要在父类相应的方法前面添加open关键字，
 * 并且在子类重写的方法前面加override关键字，子类的子类是可以继续重写父类可重写的方法的
 * 如果想阻止方法被重写，需要在override前面添加final关键字
 * 重写属性
 * 属性重写与方法重写类似，被重写的属性必须使用open关键声明，子类重写的属性必须使用
 * override关键字，val属性可以重写为var属性，但var属性不能重写为val属性
 */

open class Parent {
    protected var mName : String = "hello"
    private var age : Int = 10

    fun getName() : String {
        return mName
    }

    open fun getAge() : Int {
        return age
    }

    open val height : Int = 180
        get() {
            println("========================>获取属性height的值")
            return field
        }
}

open class Child : Parent() {
    fun print() {
        println("========================> name: ${getName()}")
    }

    override fun getAge(): Int {
        return super.getAge() + 1
    }

    override var height : Int = 190
        get() {
            println("========================>获取属性child.height的值")
            return field
        }
        set(value) {
            field = value
            println("========================>设置child.height的值")
        }
}

class TestChild : Child() {
    final override fun getAge(): Int {
        return super.getAge() + 2
    }

    fun printAge() {
        println("========================> age: ${getAge()}")
    }
}

fun main(args : Array<String>) {
    Child().print()
    TestChild().printAge()
    var child = Child()
    child.height = 200
    println("========================>child.height: ${child.height}")
}