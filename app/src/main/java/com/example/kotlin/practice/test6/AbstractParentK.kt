package com.example.kotlin.practice.test6

/**
 *
 */
abstract class AbstractParentK {

    /**
     * 获取V层的接口View
     *
     * @return 当前的接口View
     */
    @JvmField
    protected var mMvpView: String ? = null

//    protected fun getMvpView() : String? {
//        return mMvpView
//    }

    companion object {
        private val TAG = AbstractParentK::class.java.simpleName
    }
}