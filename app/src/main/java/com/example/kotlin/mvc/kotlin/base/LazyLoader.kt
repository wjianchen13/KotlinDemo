package com.example.kotlin.mvc.kotlin.base

abstract class LazyLoader {
    var isLazyInit = false
        private set

    fun init() {
        if (isLazyInit) return
        lazyInitView()
        isLazyInit = true
    }

    protected abstract fun lazyInitView()
    fun destroy() {}
}