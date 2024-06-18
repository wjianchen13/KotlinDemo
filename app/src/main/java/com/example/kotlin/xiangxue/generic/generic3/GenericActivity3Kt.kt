package com.example.kotlin.xiangxue.generic.generic3

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.derry.asdelegate.dsl_update.generic.simple3.obj.FuClass
import com.derry.asdelegate.dsl_update.generic.simple3.obj.ZiClass
import com.example.kotlin.R

/**
 * Kotlin Kotlin 泛型协变和逆变
 */
class GenericActivity3Kt : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin Kotlin 泛型协变和逆变"
    }

    /**
     * Kotlin 泛型协变和逆变
     */
    fun onDelegateBase(v : View) {
        // ? extends  ===   out   生产者
        val list: MutableList<out FuClass> = ArrayList<ZiClass>()

        // ? super ===  in  消费者
        val list2 : MutableList<in ZiClass> = ArrayList<FuClass>()
    }

    val fuClass = FuClass()
    val ziClass = ZiClass()

}



