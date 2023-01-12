package com.example.kotlin.generic

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import java.io.File

/**
 * Kotlin 生成Html标签
 */
class GenericActivity9 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 生成Html标签"
    }

    /**
     * 测试
     */
    fun onDelegateBase(v : View) {
        "Derry"

        val htmlContent = html { // this持有中转站BlockNode
            head { // this持有中转站BlockNode

                // String.invoke({xxx})      String.invoke(Any)
                "meta" { "charset"("UTF-8") }
            }
            body {
                "div" {
                    "style"(
                        """
                    width: 666px; 
                    height: 666px; 
                    line-height: 600px; 
                    background-color: #F00;
                    text-align: center
                    """.trimIndent()
                    )
                    "span" {
                        "style"(
                            """
                        color: white;
                        font-family: Microsoft YaHei
                        """.trimIndent()
                        )
                        +"你好 HTML DSL！！"
                        +"我就是我，不一样的烟火"
                        +"像我这样牛逼的人"
                        +"世界上还有几人"
                    }
                }
            }
        }.create() // 用户调用create函数，我就组装

        File("DerryOK.html").writeText(htmlContent)
    }

    // 面向对象思维 设计 类的关系（依赖倒置原则） 面向抽象 而 不面向细节 ,  面向高层 不 面向具体
    interface Node {
        fun create() : String
    }

    // html的中转站
    class BlockNode(val name: String) : Node {

        /*第一类 标签环节
        html head body*/
        val children = ArrayList<Node>() // 节点集合： html head body...

        /*第二类 属性环节
        style='color: white;font-family: Microsoft YaHei'*/
        private val properties = HashMap<String, Any>() // 属性集合： style='color: white; font-family: Microsoft YaHei'

        override fun create(): String {
            return """<$name ${properties.map {"${it.key}='${it.value}'" }.joinToString(" ")}>${children.joinToString(""){ it.create() }}</$name>"""
        }

        //   "meta" { xxx }  灵感，凭空拿到你，执行你，你还记得么？ invoke 可以执行 String字符串，就可以拿到了么
        operator fun String.invoke(action: BlockNode.() -> Unit) {
            // this == "meta"

            // this == String本身

            val stringNode = BlockNode(this)

            stringNode.action()

            this@BlockNode.children += stringNode
        }

        //  "charset"("UTF-8") 灵感，凭空拿到你，执行你，你还记得么？ invoke 可以执行 String字符串，就可以拿到了么
        operator fun String.invoke(value: Any) {
            // ("UTF-8") == value保存了

            // "charset" == String

            // this == String本身

            // 保存到属性里面去
            this@BlockNode.properties[this] = value
        }

        // +"你好 HTML DSL！！"
        operator fun String.unaryPlus() {
            // this === "你好 HTML DSL！！"
            val stringNode = StringNode("$this&nbsp;&nbsp;")

            this@BlockNode.children += stringNode
        }
    }

    // 单独搬出来 字符串 +xxx
    class StringNode(private val value: String) : Node {
        override fun create()= value
    }

    fun html(lambdaAction: BlockNode.() -> Unit) : BlockNode // 要去生成File，所以必须返回最终成果
    {
        val html = BlockNode("html")

        html.lambdaAction()

        return html
    }

    fun BlockNode.head(lambdaAction: BlockNode.() -> Unit) {
        val head = BlockNode("head")

        head.lambdaAction()

        // 把tag加入节点
        children += head
    }

    fun BlockNode.body(lambdaAction: BlockNode.() -> Unit) {
        val body = BlockNode("body")

        body.lambdaAction()

        // 把tag加入节点
        children += body
    }

}



