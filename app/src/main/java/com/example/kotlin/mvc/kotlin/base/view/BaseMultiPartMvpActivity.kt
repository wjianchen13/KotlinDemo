package com.example.kotlin.mvc.kotlin.base.view

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import com.example.kotlin.mvc.kotlin.base.module.BaseModule
import com.example.kotlin.mvc.kotlin.base.presenter.MultiPartyMvpPresenter
import java.util.LinkedList

/**
 * 多个部分独立
 * @param <V>
 * @param <P>
</P></V> */
abstract class BaseMultiPartMvpActivity<V : IBaseMultiPartMvpView?, P : MultiPartyMvpPresenter<V, *>?> :
    BaseMvpActivity<V, P>(), IBaseMultiPartMvpView, IBaseTargetView {
    protected var mModules: MutableList<BaseModule<*, *>>? = null
    val modules: MutableList<BaseModule<*, *>>?
        get() {
            if (mModules == null) mModules = LinkedList()
            return mModules
        }

    override fun getContext(): Context? {
        return this
    }

    override fun showToast(str: String?) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
    }

    override fun addModule(feature: BaseModule<*, *>?) {
        if (feature != null) {
            modules!!.add(feature)
        }
    }

    override fun removeModule(feature: BaseModule<*, *>?) {
        if (feature != null) {
            modules!!.remove(feature)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findAllModule(object : OnModuleListener {
            override fun onModuleFind(m: BaseModule<*, *>?) {
                m?.onCreate(savedInstanceState)
            }
        })
        presenter!!.onCreate(savedInstanceState)
    }

    public override fun onStart() {
        super.onStart()
        findAllModule(object : OnModuleListener {
            override fun onModuleFind(m: BaseModule<*, *>?) {
                m?.onStart()
            }
        })
        presenter!!.onStart()
    }

    override fun onRestart() {
        super.onRestart()
        findAllModule(object : OnModuleListener {
            override fun onModuleFind(m: BaseModule<*, *>?) {
                m?.onStart()
            }
        })
        presenter!!.onRestart()
    }

    override fun onPostResume() {
        super.onPostResume()
        findAllModule(object : OnModuleListener {
            override fun onModuleFind(m: BaseModule<*, *>?) {
                m?.onStart()
            }
        })
        presenter!!.onPostResume()
    }

    public override fun onResume() {
        super.onResume()
        findAllModule(object : OnModuleListener {
            override fun onModuleFind(m: BaseModule<*, *>?) {
                m?.onResume()
            }
        })
        presenter!!.onResume()
    }

    public override fun onPause() {
        super.onPause()
        findAllModule(object : OnModuleListener {
            override fun onModuleFind(m: BaseModule<*, *>?) {
                m?.onPause()
            }
        })
        presenter!!.onPause()
    }

    public override fun onStop() {
        super.onStop()
        findAllModule(object : OnModuleListener {
            override fun onModuleFind(m: BaseModule<*, *>?) {
                m?.onStop()
            }
        })
        presenter!!.onStop()
    }

    public override fun onDestroy() {
        super.onDestroy()
        findAllModule(object : OnModuleListener {
            override fun onModuleFind(m: BaseModule<*, *>?) {
                m?.onDestroy()
            }
        })
        presenter!!.onDestroy()
    }

    private fun findAllModule(listener: OnModuleListener?) {
        if (modules != null && modules!!.size > 0) {
            for (m in modules!!) {
                listener?.onModuleFind(m)
            }
        }
    }

    interface OnModuleListener {
        fun onModuleFind(m: BaseModule<*, *>?)
    }

    companion object {
        val TAG = BaseMultiPartMvpActivity::class.java.simpleName
    }
}