package com.example.kotlin.mvc.kotlin.base.module

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.kotlin.mvc.kotlin.base.LazyLoader
import com.example.kotlin.mvc.kotlin.base.presenter.BaseMultiPartMvpPresenter
import com.example.kotlin.mvc.kotlin.base.view.IBaseMvpView
import com.example.kotlin.mvc.kotlin.base.view.IBaseTargetView

/**
 * 模块公共父类
 *
 */
abstract class BaseModule<V : IBaseTargetView?, P : BaseMultiPartMvpPresenter<*, *>?>(
    v: View?
) : LazyLoader(), IBaseMvpView, View.OnClickListener {

    @JvmField
    protected var mRootLayout: View? = null
    @JvmField
    protected var mContext: Context? = null
    @JvmField
    protected var mTarget: V? = null
    @JvmField
    protected var mPresenter: P? = null
    @JvmField
    protected var mCurrentLayout: View? = null

    init {
        mRootLayout = v
    }

    constructor(target: V, presenter: P, parent: View?) : this(parent) {
        mTarget = target
        mTarget!!.addModule(this)
        mPresenter = presenter
    }

    override fun showToast(str: String?) {
        if (context() != null) Toast.makeText(context(), str, Toast.LENGTH_SHORT).show()
    }

    override fun lazyInitView() {}
    val isOnShowing: Boolean
        get() = if (mCurrentLayout == null) false else mCurrentLayout!!.visibility == View.VISIBLE

    override fun getContext(): Context? {
        return null
    }

    val applicationContext: Context?
        get() = null

    open fun setVisible(@Constants.AnimEnum animEnum: Int) {
        if (animEnum == Constants.MODULE_VISIABLE) init()
        if (!isLazyInit && animEnum == Constants.MODULE_IN_VISIABLE) return
        if (mRootLayout != null) mRootLayout!!.clearAnimation()
        when (animEnum) {
            Constants.MODULE_VISIABLE -> {}
            Constants.MODULE_IN_VISIABLE -> {}
        }
    }

    /**********************************************************************************************
     * Activity生命周期
     */
    fun onCreate(savedInstanceState: Bundle?) {}
    fun onStart() {}
    fun onRestart() {}
    fun onResume() {}
    fun onPause() {}
    fun onStop() {}
    fun onDestroy() {}

    /**********************************************************************************************
     * Fragment 生命周期
     */
    fun onAttach(context: Context) {}
    fun onActivityCreated(savedInstanceState: Bundle?) {}
    fun onViewCreated(view: View, savedInstanceState: Bundle?) {}
    fun onDestroyView() {}
    fun onDetach() {}
    override fun onClick(v: View) {}
    private fun context(): Context? {
        return mContext
    }
}