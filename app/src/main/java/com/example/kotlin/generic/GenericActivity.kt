package com.example.kotlin.generic

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.generic.generic3.GenericActivity3
import com.example.kotlin.generic.generic3.GenericActivity3Kt

/**
 * Kotlin 泛型
 */
class GenericActivity : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 泛型"
    }

    /**
     * 泛型
     */
    fun onGeneric(v : View) {
        startActivity(Intent(this, GenericActivity1::class.java))
    }

    /**
     * 泛型协变，逆变和不变
     */
    fun onGeneric2(v : View) {
        startActivity(Intent(this, GenericActivity2::class.java))
    }

    /**
     * Kotlin 泛型协变和逆变
     */
    fun onGeneric31(v : View) {
        startActivity(Intent(this, GenericActivity3::class.java))
    }

    /**
     * Kotlin 泛型协变和逆变
     */
    fun onGeneric32(v : View) {
        startActivity(Intent(this, GenericActivity3Kt::class.java))
    }

    /**
     * 生产和消费
     */
    fun onGeneric4(v : View) {
        startActivity(Intent(this, GenericActivity4::class.java))
    }

    /**
     * 类限定对全部方法生效
     */
    fun onGeneric5(v : View) {
        startActivity(Intent(this, GenericActivity5::class.java))
    }

    /**
     * 泛型限定
     */
    fun onGeneric6(v : View) {
        startActivity(Intent(this, GenericActivity6::class.java))
    }

    /**
     * 注解
     */
    fun onGeneric7(v : View) {
        startActivity(Intent(this, GenericActivity7::class.java))
    }

    /**
     * 反射
     */
    fun onGeneric8(v : View) {
        startActivity(Intent(this, GenericActivity8::class.java))
    }


    /**
     * 生成Html标签
     */
    fun onGeneric9(v : View) {
        startActivity(Intent(this, GenericActivity9::class.java))
    }

    /**
     * 反射
     */
    fun onGeneric10(v : View) {
        startActivity(Intent(this, GenericActivity10::class.java))
    }

}

