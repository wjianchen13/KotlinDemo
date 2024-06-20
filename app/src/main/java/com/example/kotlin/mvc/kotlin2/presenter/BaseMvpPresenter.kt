package com.example.kotlin.mvc.kotlin2.presenter

import android.content.Context
import android.os.Bundle
import android.view.View
import com.example.kotlin.mvc.kotlin2.utils.Utils
import com.example.kotlin.mvc.kotlin2.view.IBaseMvpView

open class BaseMvpPresenter<V : IBaseMvpView?>(view: V) {
    var view: V?
        protected set

    init {
        this.view = view
    }

    fun showToast(str: String?) {
        if (view != null) view!!.showToast(str)
    }

    open fun getContext(): Context? {
        return if (view != null) view?.getContext() else null
    }
    fun onCreate(savedInstanceState: Bundle?) {
        Utils.i(TAG, "onCreate")
    }

    fun onStart() {
        Utils.i(TAG, "onStart")
    }

    fun onRestart() {
        Utils.i(TAG, "onRestart")
    }

    fun onPostResume() {
        Utils.i(TAG, "onPostResume")
    }

    fun onResume() {
        Utils.i(TAG, "onResume")
    }

    fun onPause() {
        Utils.i(TAG, "onPause")
    }

    fun onStop() {
        Utils.i(TAG, "onStop")
    }

    fun onDestroy() {
        Utils.i(TAG, "onDestroy")
    }

    fun onAttach(context: Context) {
        Utils.i(TAG, "onAttach")
    }

    fun onActivityCreated(savedInstanceState: Bundle?) {
        Utils.i(TAG, "onAttach")
    }

    fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Utils.i(TAG, "onAttach")
    }

    fun onDestroyView() {
        Utils.i(TAG, "onAttach")
    }

    fun onDetach() {
        Utils.i(TAG, "onAttach")
    }

    companion object {
        private val TAG = BaseMvpPresenter::class.java.simpleName
    }
}