package com.example.kotlin.dsl

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 模拟AndroidManifest.xml的解析
 */
class DslActivity2 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 模拟AndroidManifest.xml的解析"
    }

    /**
     * 测试
     */
    fun onDelegateBase(v : View) {
        // TODO 模拟AndroidManifest.xml的解析
        manifest { // { 持有this == 中转站1（pkg， permission，application） }

            // 因为this可以省略
            // TODO 这里面所有的代码，都是this点出来的，只是你看不到，隐式的， 所有必须 中转站.() 持有this     而不是 (中转站) 持有it

            pkg("com.derry.kt_base") // 包名
            permission("android.permission.INTERNET") // 权限

            // 四大组件
            application { // { 持有this == 中转站2（四大组件 Activity Service ...） }

                activity(".MainActivity") { // { 持有this == 中转站3（intent_filter） }
                    intent_filter { // { 持有this == 中转站4（action category） }
                        action1()
                        action2()
                        action3()
                        action("android.intent.action.MAIN")
                        category("android.intent.category.LAUNCHER")
                    }
                }

                service(".MyService") { // { 持有this == 中转站3（intent_filter） }
                    intent_filter {

                    }
                }

                receiver(".MyCustomReceiver") { // { 持有this == 中转站3（intent_filter） }
                    intent_filter {

                    }
                }

                provider(".MyCustomReceiver") { // { 持有this == 中转站3（intent_filter） }
                    intent_filter {

                    }
                }
            }
        }
    }

    class IntentFilter // 中转站3
    {

        class Sub { // 中转站4
            fun action(context: String) {}
            fun category(context: String) {}
            fun action1(){}
            fun action2(){}
            fun action3(){}
        }


        fun intent_filter(lambda: Sub.() -> Unit) {

        }
    }

    class Component // 中转站2
    {
        fun activity(context: String, lambda: IntentFilter.() -> Unit) : IntentFilter {
            val intentFilter = IntentFilter()
            intentFilter.lambda()
            return intentFilter
        }

        fun service(context: String, lambda: IntentFilter.() -> Unit) : IntentFilter {
            val intentFilter = IntentFilter()
            intentFilter.lambda()
            return intentFilter
        }

        fun receiver(context: String, lambda: IntentFilter.() -> Unit) : IntentFilter {
            val intentFilter = IntentFilter()
            intentFilter.lambda()
            return intentFilter
        }

        fun provider(context: String, lambda: IntentFilter.() -> Unit) : IntentFilter {
            val intentFilter = IntentFilter()
            intentFilter.lambda()
            return intentFilter
        }
    }

    class Manifest // 中转站1
    {
        fun pkg(context: String) {}
        fun permission(context: String) {}

        fun application(action: Component.() -> Unit) : Component {
            val component = Component()
            component.action()
            return component
        }

        // infix 中缀表达式 可以美化代码，写代码 像写作文一样， 必须是成双成对
        // infix  "abc".to(123)    "abc" to 123
        // 119-Kotlin语言的infix关键字.mp4
    }

    // 思路：Manifest 最终的成果，是要返回解析的字符串
    fun manifest(lambda : Manifest.() -> Unit) : Manifest {
        val manifest = Manifest()
        manifest.lambda() // 不写这句话 和 写这句话的 区别在哪里？ 就是为了 {里面的代码执行起来}    不写就是空壳
        return manifest
    }


}



