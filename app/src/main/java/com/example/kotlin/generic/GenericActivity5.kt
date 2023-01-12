package com.example.kotlin.generic

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.derry.asdelegate.dsl_update.generic.simple3.obj.FuClass
import com.derry.asdelegate.dsl_update.generic.simple3.obj.ZiClass
import com.example.kotlin.R

/**
 * Kotlin 类限定对全部方法生效
 */
class GenericActivity5 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 类限定对全部方法生效"
    }

    /**
     * Kotlin 泛型协变和逆变
     */
    fun onDelegateBase(v : View) {
        // 生产者 协变  ? extends T  或者 out T
        val stu = MyStudentGet("Derry is OK")
        println(stu.get())

        // 消费者 逆变 ? super T 或者 in T
        val stu2 = MyStudentSet<Double>()
        stu2.set(989889.4)

        // 消费者 逆变 ? super T 或者 in T        +        生产者 协变  ? extends T  或者 out T
        val stu3 = StudentSetGet<String, String>()
        stu3.set("九阳神功") // 消费者 T 逆变
        println(stu3.get()) // 生产者 T 协变
    }

    interface Producer<out T> { // 生产者 out
        fun producer() : T // 只能生产

        // 编译不通过，不能消费
        /*fun consumer(item : T)
        fun consumer2(item : T)
        fun consumer3(item : T)
        fun consumer4(item : T)
        fun add(value: T)*/
        // ...
    }

    interface Consumer<in T> { // 消费者 in
        /*fun producer() : T // 不能能生产
        fun producer2() : T // 不能能生产
        fun producer3() : T // 不能能生产
        fun producer4() : T // 不能能生产
        fun producer5() : T // 不能能生产*/
        // ...

        // 只能消费
        fun consumer(item : T)
    }

// TODO >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 下面是实际代码

    // Producer 生产者 出去就是生产者  读取     协变
    class MyStudentGet<out T>(_item : T) {
        private val item = _item
        fun get() : T = item

        // fun set(x: T) {} 编译不通过
    }

    // Consumer 消费者  进去就是消费者 修改    逆变
    class MyStudentSet<in T>() {
        fun set(value: T) = println("你传递进来的内容是:$value")
    }

    // Producer 合并 Consumer
    class StudentSetGet<in I, out O> {

        private var item : I? = null

        // 消费者
        fun set(value : I) {
            println("你传递进来的内容是:$value")
            item = value
        }

        // 生产者  as xx 转成xx类型  强制转成生产者，才能返回给外界
        fun get() : O ? = item as? O
    }

    // 我们的普通代码，就是不变，没有 out  没有 in， 默认就就是 不变
    // 不变
    class StudentSetGets<INPUT_OUTPUT> {

        private var item : INPUT_OUTPUT? = null

        // 消费者
        fun set(value : INPUT_OUTPUT) {
            println("你传递进来的内容是:$value")
            item = value
        }

        // 生产者
        fun get() = item
    }



}



