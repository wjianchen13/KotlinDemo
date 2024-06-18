package com.example.kotlin.first.lambda

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

class LambdaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lambda)
    }

    /**
     * 不可变list
     * java 创建list
     * val list = ArrayList<String>()
     * list.add("Apple")
     * list.add("Banana")
     * list.add("Orange")
     * list.add("Pear")
     * list.add("Grape")
     * listOf()函数创建的是一个不可变的集合。不可变的集合指的就是该集合只能用于读取，
     * 我们无法对集合进行添加、修改或删除操作
     */
    fun onTest1(v : View) {
        val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
        for (fruit in list) {
            println(fruit)
        }
    }

    /**
     * 可变list
     */
    fun onTest2(v : View) {
        val list = mutableListOf("Apple", "Banana", "Orange", "Pear", "Grape")
        list.add("Watermelon")
        for (fruit in list) {
            println(fruit)
        }
    }

    /**
     * 不可变set
     */
    fun onTest3(v : View) {
        val set = setOf("Apple", "Banana", "Orange", "Pear", "Grape", "Apple")
        for (fruit in set) {
            println(fruit)
        }
    }

    /**
     * 可变set
     */
    fun onTest4(v : View) {
        val set = mutableSetOf("Apple", "Banana", "Orange", "Pear", "Grape")
        set.add("Banana")
        set.add("hello")
        for (fruit in set) {
            println(fruit)
        }
    }

    /**
     * map常规使用
     */
    fun onTest5(v : View) {
        val map = HashMap<String, Int>()
        map.put("Apple", 1)
        map.put("Banana", 2)
        map.put("Orange", 3)
        map.put("Pear", 4)
        map.put("Grape", 5)
        for ((fruit, number) in map) {
            println("fruit is " + fruit + ", number is " + number)
        }
    }

    /**
     * Kotlin中并不建议使用put()和get()方法来对Map进行添加和读取数据操作，而是更加推荐
     * 使用一种类似于数组下标的语法结构，比如向Map中添加一条数据就可以这么写：
     * map["Apple"] = 1
     */
    fun onTest6(v : View) {
        val map = HashMap<String, Int>()
        map["Apple"] = 1
        map["Banana"] = 2
        map["Orange"] = 3
        map["Pear"] = 4
        map["Grape"] = 5
        for ((fruit, number) in map) {
            println("fruit is " + fruit + ", number is " + number)
        }
    }

    /**
     * 接口
     */
    fun onTest7(v : View) {
        val map = mapOf("Apple" to 1, "Banana" to 2, "Orange" to 3, "Pear" to 4, "Grape" to 5)
        for ((fruit, number) in map) {
            println("fruit is " + fruit + ", number is " + number)
        }
    }

    /**
     * lambda 就是一小段可以作为参数传递的代码
     * 接着我们来看一下Lambda 表达式的语法结构：
     * {参数名1: 参数类型, 参数名2: 参数类型 -> 函数体}
     */
    fun onTest8(v : View) {
        val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")

        // val lambda = { fruit: String -> fruit.length }
        // val maxLengthFruit = list.maxBy(lambda)
        // 首先，我们不需要专门定义一个lambda变量，而是可以直接将lambda表达式传入maxBy函数当中，因此第一步简化如下所示：
        // val maxLengthFruit = list.maxBy({ fruit: String -> fruit.length })
        // 然后Kotlin 规定，当Lambda 参数是函数的最后一个参数时，可以将Lambda 表达式移到函数括 号的外面，如下所示：
        // val maxLengthFruit = list.maxBy() { fruit: String -> fruit.length }
        // 接下来，如果Lambda 参数是函数的唯一一个参数的话，还可以将函数的括号省略：
        // val maxLengthFruit = list.maxBy { fruit: String -> fruit.length }
        // 这样代码看起来就变得清爽多了吧？但是我们还可以继续进行简化。由于Kotlin拥有出色的类型
        // 推导机制， Lambda 表达式中的参数列表其实在大多数情况下不必声明参数类型，因此代码可以进一步简化成：
        // val maxLengthFruit = list.maxBy { fruit -> fruit.length }
        // 最后，当Lambda 表达式的参数列表中只有一个参数时，也不必声明参数名，而是可以使用it
        // 关键字来代替，那么代码就变成了：

        val maxLengthFruit = list.maxBy { it.length }

        println("maxLengthFruit is " + maxLengthFruit)
    }


    /**
     * 集合中的map函数是最常用的一种函数式API，它用于将集合中的每个元素都映射成一个另外的
     * 值，映射的规则在Lambda 表达式中指定，最终生成一个新的集合
     */
    fun onTest9(v : View) {
        val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
        val newList = list.map { it.toUpperCase() } // 全部转换成大写
        for (fruit in newList) {
            println(fruit)
        }
    }

    /**
     * 集合filter函数  filter函数是用来过滤集合中的数据的
     */
    fun onTest10(v : View) {
        val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
        val newList = list.filter { it.length <= 5 }
                .map { it.toUpperCase() }
        for (fruit in newList) {
            println(fruit)
        }
    }

    /**
     * 集合any函数 any函数用于判断集合中是否至少存在一个元素满足指定条件
     * 集合any函数all函数用于判断集合中是否所有元素都满足指定条件
     */
    fun onTest11(v : View) {

        val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
        val anyResult = list.any { it.length <= 5 }
        val allResult = list.all { it.length <= 5 }
        println("anyResult is " + anyResult + ", allResult is " + allResult)
    }

    /**
     * Kotlin创建匿名内部类
     */
    fun onTest12(v : View) {
        // kotlin使用Thread的完整写法
        Thread(object : Runnable {
            override fun run() {
                println("object Thread is running")
            }
        }).start()
    }

    /**
     * Java 函数式API使用 Thread
     */
    fun onTest13(v : View) {
        // kotlin使用Thread的完整写法
        Thread(object : Runnable {
            override fun run() {
                println("Thread is running")
            }
        }).start()

        // 因为Runnable类中
        // 只有一个待实现方法，即使这里没有显式地重写run()方法， Kotlin也能自动明白Runnable后
        // 面的Lambda 表达式就是要在run()方法中实现的内容
        Thread(Runnable {
            println("Thread is running")
        }).start()

        // 如果一个Java 方法的参数列表中有且仅有一个Java 单抽象方法接口参数，我们还可以将接口名进行省略
        Thread({
            println("Thread is running")
        }).start()

        // 当Lambda 表达式是方法的最后一个参数时，可以将Lambda 表达式移到方法括号的外面
        // 如果Lambda 表达式还是方法的唯一一个参数，还可以将方法的括号省略
        Thread {
            println("Thread is running")
        }.start()
    }

}