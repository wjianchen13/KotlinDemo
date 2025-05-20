package com.example.kotlin.first.jetpack.livedata.test2

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin.R

/**
 * ViewModel 的生命周期是长于Activity
 * 的，如果把Activity 的实例传给ViewModel ，就很有可能会因为Activity 无法释放而造成内存泄
 * 漏，这是一种非常错误的做法
 */
class LiveDataActivity2 : AppCompatActivity() {

    private lateinit var plusOneBtn : Button
    private lateinit var clearBtn : Button
    private lateinit var infoText : TextView
    private lateinit var tv_test : TextView
    private lateinit var tv_test1 : TextView

    lateinit var viewModel: LiveDataViewModel3
    lateinit var sp: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livedata)
        plusOneBtn = findViewById(R.id.plusOneBtn)
        clearBtn = findViewById(R.id.clearBtn)
        infoText = findViewById(R.id.infoText)
        tv_test = findViewById(R.id.tv_test)
        tv_test1 = findViewById(R.id.tv_test1)

        sp = getPreferences(Context.MODE_PRIVATE)
        val countReserved = sp.getInt("count_reserved", 0)
        viewModel = ViewModelProvider(this, LiveDataModelFactory3(countReserved))
                .get(LiveDataViewModel3::class.java)
        plusOneBtn.setOnClickListener {
            viewModel.plusOne()
        }
        clearBtn.setOnClickListener {
            viewModel.clear()
        }
        viewModel.counter.observe(this, Observer { count ->
            infoText.text = count.toString()
        })

        plusOneBtn.setOnClickListener {
            viewModel.plusOne()
        }
        clearBtn.setOnClickListener {
            viewModel.clear()
        }

        viewModel.user.observe(this, Observer<User3> { user ->
            tv_test.text = "name: ${user.name}  age: ${user.age}"
        })

        tv_test1.setOnClickListener {
            viewModel.change()
        }

//        接下来到最关键的地方了，这里调用了viewModel.counter的observe()方法来观察数据的
//        变化。经过对MainViewModel 的改造，现在counter变量已经变成了一个LiveData对象，任
//        何LiveData对象都可以调用它的observe()方法来观察数据的变化。 observe()方法接收两
//                个参数：第一个参数是一个LifecycleOwner对象，有没有觉得很熟悉？没错， Activity 本身
//        就是一个LifecycleOwner对象，因此直接传this就好；第二个参数是一个Observer接口，
//        当counter中包含的数据发生变化时，就会回调到这里，因此我们在这里将最新的计数更新到
//        界面上即可
    }

    override fun onPause() {
        super.onPause()
        var e  = sp?.edit()
        e?.putInt("count_reserved", viewModel.counter.value ?: 0)
        e?.commit()
    }


}