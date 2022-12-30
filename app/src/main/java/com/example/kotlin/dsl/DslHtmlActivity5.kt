package com.example.kotlin.dsl

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import java.io.File

/**
 * Kotlin DSL简单例子泛型实现
 */
class DslHtmlActivity5 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin DSL简单例子泛型实现"
    }

    /**
     * 测试
     */
    fun onDelegateBase(v : View) {
        +"Derry"

        // Domain Special Language 领域特定语言  比较成功的DSL语言有：JSON，Gradle，anko 等
        // 而今天我们要手写自己的，领域特定语言（专门生成解析 HTML 生成 HTML文本，语言规则 HTML的规则）
        // 根据下面的代码，运行后，会生成一个网页，相当于 我们自己定义语言规则

        val names = listOf("Derry1", "Derry2", "Derry3") // 集合

        val result =
            html {
                +"使用 Kotlin 进行 HTML 编码"

                // this == 第一个中转站 HTML类 {head，body。。。}
                head {
                    // this == 第二个中转站 Head类 {title。。。}
                    title { +"使用 Kotlin 进行 HTML 编码" }
                }
                body {
                    // this == 第三个中转站 Body类 {h1，p，a。。。}
                    h1 {
                        // this == h1中转站 { 未知 }
                    }
                    // h2 h3 h4 h5 h1000 h99999

                    p { -"此格式可用作 HTML 的替代标记" }

                    // 具有属性和文本内容的元素
                    a(href = "http://bbs.xiangxueketang.cn/pins/recommended") { -"享学论坛" }

                    // 混合内容
                    p {
                        -"Derry老师来了"
                        b { -"Derry是谁" }
                        -"文本。有关更多信息，请参阅"
                        a(href = "http://www.xiangxueketang.cn/") { -"湖南享学" }
                        -"Derry的项目"
                    }
                    p { -"一些文字" }

                    // 从命令行参数生成的内容
                    p {
                        -"命令行参数是："
                        ul {
                            // this == UL中转站 { li 子标签  }
                            for (name in names)
                                li { -name } // this == LI中转站
                        }
                    }
                }
            }
        println(result)

        val file = File("DerryHtml.html")
        file.writeText(result.toString())

        // 老师能讲一下lamada中转站原理么？
        /*
            head { // 持有this == 中转站{aaa bbb ccc}
                aaa {}

                bbb {}

                ccc {}
            }

         */
    }

    // 运算符重载+ -
    operator fun String.unaryPlus() {
        // this == "Derry"
    }

    // 面向对象思维 设计 类的关系（依赖倒置原则） 面向抽象 而 不面向细节 ,  面向高层 不 面向具体
    private interface Element { // 元素顶层接口
        /**
         * builder 拼接所有的元素
         * indent html所有文本缩进效果
         */
        fun run(builder: StringBuilder, indent: String)
    }

    // 从最简单的开始  <html> <head> 拼接这样的细节 是最简单
    private class TextElement(val text: String) : Element { // 文本Element，独立的字符串

        override fun run(builder: StringBuilder, indent: String) {
            builder.append("$indent$text\n") // 缩进后，显示文本内容，换行
        }
    }

    // 复杂的逻辑 <html> <head> 拼接 这种具体详情
    private open class Tag(val tagName: String) : Element { // tagName Tag的Element 例如: <html></html>

        val elements = arrayListOf<Element>() // 集合 每一个元素 都是 Element
        val attributes = hashMapOf<String, String>() // Map集合 每一个元素 Key=属性名  Value=属性对应的值

        override fun run(builder: StringBuilder, indent: String) {
            // <html>  缩进<html 属性>     闭合</html>
            builder.append("$indent<$tagName${renderAttributes()}>\n")

            for (element in elements) {
                element.run(builder, indent + "   ")
            }

            // </html> 还没有写闭合
            builder.append("$indent</$tagName>\n")
        }

        // 属性拼接：href = "http://bbs.xiangxueketang.cn/pins/recommended"
        // 得不到属性 null 没有属性，就不管
        private fun renderAttributes() : String ? {
            val builder = StringBuilder()

            for (key in attributes.keys) {
                // 空格 <标签名 href = ""
                builder.append(" $key=\"${attributes[key]}\"")
            }
            return builder.toString()
        }

        // 触发点
        override fun toString(): String {
            val builder = StringBuilder()

            run(builder, "") // 参数一：StringBuilder方便组装html数据， 参数二：indent默认不要缩进

            return builder.toString()
        }
    }

    // 解决 +"AAAA"  -"BBBB"  运算符重载的 扩展一层类， Tag的子类 拥有最丰富的功能
    private open class TagClass(tagName: String) : Tag(tagName = tagName) {

        operator fun String.unaryPlus() { // 运算符重载+
            elements+=TextElement(this) // this == "使用 Kotlin 进行 HTML 编码"
        }

        operator fun String.unaryMinus() { // 运算符重载-
            elements+=TextElement(this) // this == "此格式可用作 HTML 的替代标记"
        }
    }

    // 第三个中转站
    private open class Body(tagName: String) : TagClass(tagName) {

        fun h1(action: H1.() -> Unit) {
            val newH1 = H1()

            newH1.action()

            elements+=newH1
        }

        fun p(action: P.() -> Unit) {
            val newP = P()

            newP.action()

            elements+=newP
        }

        fun a(href: String, action: A.() -> Unit) {
            val newA = A()

            newA.href = href

            newA.action()

            elements+=newA
        }

        fun ul(action: UL.() -> Unit) {
            val newUL = UL()

            newUL.action()

            elements+=newUL
        }

        fun b(action: B.() -> Unit) {
            val newB = B()

            newB.action()

            elements+=newB
        }
    }

    // 第二个中转站
    private class Head : TagClass("head") {

        // 如果看到{} 报错，基本上都是，没要给{} 定义lambda规则
        fun title(action: Title.() -> Unit) {
            val newTitle = Title()

            newTitle.action()

            elements+=newTitle
        }
    }

    private class Title() : TagClass("title")
    private class H1 : Body("h1")
    private class P : Body("p")
    private class A : Body("a") {
        var href : String
            get() = attributes["href"]!! // !! 我断言你可以拿到，如果拿不到，我的责任
            set(value) {
                attributes["href"] = value
            }
    }
    private class B : Body("b")
    private class LI : Body("li") // LI中转站
    private class UL : Body("ul") {
        // li   ul调用后 一个或多个 li标签 会生成
        fun li(action: LI.() -> Unit) {
            val newLi = LI()

            newLi.action()

            elements+=newLi
        }
    }

// ...

    // 第一个中转站
    private class HTML : TagClass("html") {
        fun head(head: Head.() -> Unit) {
            val newHead = Head()

            newHead.head() // 为什么调用他，就是为了让代码执行起来

            elements+=newHead // 就是为了后面组装
        }

        fun body(body: Body.() -> Unit) {
            val newBody = Body("body")

            newBody.body() // 为什么调用他，就是为了让代码执行起来

            elements+=newBody // 就是为了后面组装
        }
    }

    private fun html(html: HTML.() -> Unit) : HTML // 必须返回所有结果 给 File生成 HTMl文本内容
    {
        val htmlObj = HTML()
        htmlObj.html()
        return htmlObj
    }

}



